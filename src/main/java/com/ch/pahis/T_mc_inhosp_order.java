package com.ch.pahis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class T_mc_inhosp_order {
	@Autowired
	JdbcTemplate jdbcTemplate_oracle;
	@Autowired
	JdbcTemplate jdbcTemplate_passpa2db;
	
	@Autowired
	Sys_pa sys_pa;
	public int inhosp_order(int cidin,int trunca, int count, int sum_date,List anlilist,String hiscode,String ienddate,
			String startdate){
		int cid=cidin;
		try {
			String sql=null;
			List listbatch=new ArrayList();
			List prescnolist=new ArrayList();

			//插入非药品数据
			sql="insert into t_mc_inhosp_order (grouptag, orderstatus, doctorname, is_temp, remark, pa_enddatetime, "
					+ "orderno, wardcode, purpose, singledose, frequency, drugform, is_out, visitid, routecode, "
					+ "deptcode, ordercode, deptname, caseid, reasonable_desc, doctorcode, meditime, drug_unique_code, "
					+ "startdatetime, ordertype, routename, enddatetime, cid, drugspec, executetime, wardname, "
					+ "patientid, hiscode, ordername, groupstate, doseunit, is_allow) values(?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			int a=0;
//			int b=0;
			int iid=0;
//			int cid=0;
			String ienddate1=ienddate;
			String startdate1=startdate;
			for(int i=0;i<count;i++){
				//数据分割，增加时间
				if(i%(count/sum_date)==0 && i>0){
					ienddate1=sys_pa.date1(ienddate1, "yyyyMMdd");
					startdate1=sys_pa.date2(startdate, "yyyy-MM-dd HH:mm:ss",i,sum_date);
				}
				for(int j=0;j<anlilist.size();j++){
					iid=iid+1;
					JSONObject json=JSONObject.fromObject(anlilist.get(j));
					JSONObject PassClient=json.getJSONObject("PassClient");
					JSONObject Patient=json.getJSONObject("Patient");
					JSONObject ScreenDrugList=json.getJSONObject("ScreenDrugList");
					JSONArray ScreenDrugs=ScreenDrugList.getJSONArray("ScreenDrugs");
					Patient.put("PatCode", hiscode+ienddate1+i+"_"+j+"_zy");
//					Patient.put("InHospNo",hiscode+ienddate1+i+"_"+j);
					Patient.put("InHospNo",hiscode+"_住院_"+Patient.getString("InHospNo"));
					
					//门诊caseid：Zy住院号+“＿”＋病人编号
					String caseid="Zy"+Patient.getString("PatCode");
					
					//病原学检测
					String itemcode=null;
					String itemname=null;
					List list_byx=null;
					int IsTestEtiology=0;
					if(Integer.parseInt(Patient.get("IsTestEtiology").toString())==1){
						IsTestEtiology=3;
					}
					String sql1="select a.itemcode,a.itemname from mc_dict_costitem a ,mc_hospital_match_relation b where "
							+ "a.match_scheme=b.costitemmatch_scheme and a.is_byx=? and b.hiscode_user=? order by a.itemcode asc";
					list_byx=jdbcTemplate_passpa2db.queryForList(sql1,new Object[]{IsTestEtiology,hiscode});
					Map byx=(Map)list_byx.get(0);
					itemcode=byx.get("itemcode").toString();
					itemname=byx.get("itemname").toString();
					
					//得到一个病人的所有的处方号，来制作非药品
					for(int k=0;k<ScreenDrugs.size();k++){
						JSONObject ScreenDrug=ScreenDrugs.getJSONObject(k);
						if(prescnolist.size()>0){
							boolean rig=false;
							for(int k1=0;k1<prescnolist.size();k1++){
								String prescnostr=prescnolist.get(k1).toString();
								if(ScreenDrug.get("RecipNo").equals(prescnostr)){
									rig=true;//表示存在重复的处方
								}
							}
							if(!rig){//表示存在重复的处方，不在新增
								prescnolist.add(ScreenDrug.get("RecipNo"));
							}
						}else{
							prescnolist.add(ScreenDrug.get("RecipNo"));
						}
					}
					
					if(prescnolist.size()>0){
						for(int k1=0;k1<prescnolist.size();k1++){
							cid=cid+1;
							a=a+1;
							if(a%2000==0){
								System.out.println("t_mc_inhosp_order 非药--"+a);
							}
							String prescnostr=prescnolist.get(k1).toString();
							Map map=new HashMap();
							map.put("iid", iid);
							map.put("cid",cid);
							map.put("Patient", Patient);
							map.put("HospID", PassClient.getString("HospID"));
							map.put("costtime1", startdate1);
							map.put("caseid", caseid);
							map.put("prescnostr", prescnostr+"_非_1");//非药和药品不能再一个处方中
							map.put("itemcode",itemcode);
							map.put("itemname",itemname);
							listbatch.add(map);
							
							if(a%500==0){
								batchInsertRows(sql,listbatch);
								listbatch.clear();
							}
							
							break;
						}
						prescnolist.clear();
					}
				}
			}
			if(listbatch.size()>0){
				batchInsertRows(sql,listbatch);
				listbatch.clear();
			}
			System.out.println("t_mc_inhosp_order非药总数："+a+"-->有效数据："+a);
			
			
			//插入药品数据
			sql="insert into t_mc_inhosp_order (grouptag, orderstatus, doctorname, is_temp, remark, pa_enddatetime, "
					+ "orderno, wardcode, purpose, singledose, frequency, drugform, is_out, visitid, routecode, "
					+ "deptcode, ordercode, deptname, caseid, reasonable_desc, doctorcode, meditime, drug_unique_code, "
					+ "startdatetime, ordertype, routename, enddatetime, cid, drugspec, executetime, wardname, "
					+ "patientid, hiscode, ordername, groupstate, doseunit, is_allow) values(?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			a=0;
//			b=0;
			iid=0;
//			cid=0;
			ienddate1=ienddate;
			startdate1=startdate;
			for(int i=0;i<count;i++){
				//数据分割，增加时间
				if(i%(count/sum_date)==0 && i>0){
					ienddate1=sys_pa.date1(ienddate1, "yyyyMMdd");
					startdate1=sys_pa.date2(startdate, "yyyy-MM-dd HH:mm:ss",i,sum_date);
				}
				for(int j=0;j<anlilist.size();j++){
					iid=iid+1;
					JSONObject json=JSONObject.fromObject(anlilist.get(j));
					JSONObject PassClient=json.getJSONObject("PassClient");
					JSONObject Patient=json.getJSONObject("Patient");
					JSONObject ScreenDrugList=json.getJSONObject("ScreenDrugList");
					JSONArray ScreenDrugs=ScreenDrugList.getJSONArray("ScreenDrugs");
					Patient.put("PatCode", hiscode+ienddate1+i+"_"+j+"_zy");
//					Patient.put("InHospNo",hiscode+ienddate1+i+"_"+j);
					Patient.put("InHospNo",hiscode+"_住院_"+Patient.getString("InHospNo"));
					
					//门诊caseid：Zy住院号+“＿”＋病人编号
					String caseid="Zy"+Patient.getString("PatCode");
					
					for(int k=0;k<ScreenDrugs.size();k++){
						cid=cid+1;
						//字典表找数据
						JSONObject ScreenDrug=ScreenDrugs.getJSONObject(k);
						String sql1="select drugname,drugcode,drugspec,drugform,comp_name,doseunit from "
								+ "mc_dict_drug_pass where drug_unique_code=? and match_scheme= "
								+ "(select drugmatch_scheme from mc_hospital_match_relation where  hiscode_user=? ) "
								+ "and doseunit=?";
						List list_drug_pass=jdbcTemplate_passpa2db.queryForList(sql1,new Object[]{
								ScreenDrug.getString("DrugUniqueCode"),hiscode,ScreenDrug.getString("DoseUnit")});
						String drugspec="";
						String drugform="";
						String comp_name="";
						String doseunit="";
						String drugcode="";
						for(int k1=0;k1<list_drug_pass.size();k1++){
							if(StringUtils.isNotBlank(drugcode)){
//								cid=cid+1;
								break;
							}
							Map map=(Map)list_drug_pass.get(k1);
							if(map.get("drugspec")!=null){
								drugspec=map.get("drugspec").toString();
							}
							if(map.get("drugform")!=null){
								drugform=map.get("drugform").toString();
							}
							if(map.get("comp_name")!=null){
								comp_name=map.get("comp_name").toString();
							}
							if(map.get("doseunit")!=null){
								doseunit=map.get("doseunit").toString();
							}
							if(map.get("drugcode")!=null){
								drugcode=map.get("drugcode").toString();
							}
						}
						if(StringUtils.isBlank(drugcode)){
							System.out.println("未找到字典表药品数据,病人姓名："+Patient.get("Name"));
							continue;
						}
						a=a+1;
						if(a%2000==0){
							System.out.println("t_mc_inhosp_order --"+a);
						}
						
						Map map=new HashMap();
						map.put("drugspec", drugspec);
						map.put("drugform", drugform);
						map.put("comp_name", comp_name);
						map.put("doseunit", doseunit);
						map.put("drugcode", drugcode);
						map.put("ScreenDrug", ScreenDrug);
						map.put("Patient", Patient);
						map.put("caseid", caseid);
						map.put("PassClient", PassClient);
						map.put("iid", iid);
						map.put("cid", cid);
						map.put("startdate1", startdate1);
						listbatch.add(map);
						
						if(a%500==0){
							batchInsertRows1(sql,listbatch);
							listbatch.clear();
						} 
						
//						if(a-50000>=0){
//							b=b+50000;
//							a=a-50000;
//							batchInsertRows(sql, listbatch);
//							System.out.println("t_mc_inhosp_order总数："+count*anlilist.size()+"-->有效数据："+b);
//							listbatch.clear();
//						}
//						if((i+1)==count){
//							batchInsertRows(sql, listbatch);
//							System.out.println("t_mc_inhosp_order总数："+count*anlilist.size()+"-->有效数据："+(b+a));
//							listbatch.clear();
//						}
					}
					json.clear();
					json = null;
				}
			}
			if(listbatch.size()>0){
				batchInsertRows1(sql,listbatch);
				listbatch.clear();
			}
			System.out.println("t_mc_inhosp_order药品总数："+a+"-->有效数据："+a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("t_mc_inhosp_order制造数据异常:"+e);
		}
		
		return cid;
	}
	
	public void batchInsertRows(String sql, final List listbatch) throws Exception {
		BatchPreparedStatementSetter setter = new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement pst, int i) throws SQLException {
				Map map=(Map)listbatch.get(i);
				JSONObject Patient=JSONObject.fromObject(map.get("Patient"));
				String HospID=map.get("HospID").toString();
				int iid=Integer.parseInt(map.get("iid").toString());
				int cid=Integer.parseInt(map.get("cid").toString());
				String caseid=map.get("caseid").toString();
				String costtime1=map.get("costtime1").toString();
				String prescnostr=map.get("prescnostr").toString();
				String itemcode=map.get("itemcode").toString();
				String itemname=map.get("itemname").toString();
				
				try{
					pst.setString(1,"");//[grouptag
					pst.setInt(2,0);//orderstatus
					pst.setString(3,Patient.getString("DoctorName"));//doctorname
					pst.setInt(4,1);//is_temp
					pst.setString(5,"");//remark
					pst.setString(6,"");//pa_enddatetime
					pst.setInt(7,cid);//orderno
					pst.setString(8,"");//wardcode
					pst.setInt(9,0);//purpose
					pst.setString(10,"");//singledose
					pst.setString(11,"");//frequency
					pst.setString(12,"");//drugform
					pst.setInt(13,0);//is_out,如果是出院带药1的话，会导致PASS不审
					pst.setString(14,Patient.getString("VisitCode"));//visitid
					pst.setString(15,"");//routecode
					pst.setString(16,Patient.getString("DeptCode"));//deptcode
					pst.setString(17,itemcode);//ordercode
					pst.setString(18,Patient.getString("DeptName"));//deptname
					pst.setString(19,caseid);//caseid
					pst.setString(20,"合理越权描述");//reasonable_desc
					pst.setString(21,Patient.getString("DoctorCode"));//doctorcode
					pst.setInt(22,0);//meditime
					pst.setString(23,itemcode);//drug_unique_code
					pst.setString(24,costtime1);//startdatetime
					pst.setInt(25,3);//ordertype
					pst.setString(26,"");//routename
					pst.setString(27,costtime1);//enddatetime
					pst.setInt(28,cid);//cid
					pst.setString(29,"");//drugspec
					pst.setString(30,"");//executetime
					pst.setString(31,Patient.getString("DeptName"));//wardname
					pst.setString(32,Patient.getString("PatCode"));//patientid
					pst.setString(33,HospID);//hiscode
					pst.setString(34,itemname);//ordername
					pst.setInt(35,1);//groupstate
					pst.setString(36,"");//doseunit
					pst.setInt(37,0);//is_allow]
				}catch (Exception e){
					System.out.println("出现异常的数据:"+map);
					System.out.println(e);
				}
			}
			@Override
			public int getBatchSize() {
				//这个方法设定更新记录数，通常List里面存放的都是我们要更新的，所以返回list.size();  
				return listbatch.size();
			}
		};
		jdbcTemplate_oracle.batchUpdate(sql, setter);
	}
	
	public void batchInsertRows1(String sql, final List listbatch) throws Exception {
		BatchPreparedStatementSetter setter = new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement pst, int i) throws SQLException {
				Map map=(Map)listbatch.get(i);
				String drugspec=map.get("drugspec").toString();
				String drugform=map.get("drugform").toString();
				String comp_name=map.get("comp_name").toString();
				String doseunit=map.get("doseunit").toString();
				String drugcode=map.get("drugcode").toString();
				JSONObject ScreenDrug=JSONObject.fromObject(map.get("ScreenDrug").toString());
				JSONObject Patient=JSONObject.fromObject(map.get("Patient").toString());
				JSONObject PassClient=JSONObject.fromObject(map.get("PassClient").toString());
				String caseid=map.get("caseid").toString();
				int iid=Integer.parseInt(map.get("iid").toString());
				int cid=Integer.parseInt(map.get("cid").toString());
//				String startdate1=map.get("startdate1").toString();//接口导数据之后，PA自己生成的，不需要我在接口弄
				
				try{
					pst.setString(1,ScreenDrug.getString("GroupTag"));//[grouptag
					pst.setString(2,ScreenDrug.getString("OrderType"));//orderstatus
					pst.setString(3,ScreenDrug.getString("DoctorName"));//doctorname
					pst.setString(4,ScreenDrug.getString("IsTempDrug"));//is_temp
					pst.setString(5,"");//remark
					pst.setString(6,"");//pa_enddatetime ,放startdate1
					pst.setString(7,ScreenDrug.getString("Index"));//orderno
					pst.setString(8,Patient.getString("DeptCode"));//wardcode
					pst.setInt(9,Integer.parseInt(ScreenDrug.getString("Purpose")));//purpose
					pst.setString(10,ScreenDrug.getString("DosePerTime"));//singledose
					pst.setString(11,ScreenDrug.getString("Frequency"));//frequency
					pst.setString(12,drugform);//drugform
					pst.setInt(13,0);//is_out,如果是出院带药1的话，会导致PASS不审
					pst.setString(14,Patient.getString("VisitCode"));//visitid
					pst.setString(15,ScreenDrug.getString("RouteCode"));//routecode
					pst.setString(16,ScreenDrug.getString("DeptCode"));//deptcode
					pst.setString(17,drugcode);//ordercode
					pst.setString(18,ScreenDrug.getString("DeptName"));//deptname
					pst.setString(19,caseid);//caseid
					pst.setString(20,"合理越权描述");//reasonable_desc
					pst.setString(21,ScreenDrug.getString("DoctorCode"));//doctorcode
					pst.setInt(22,0);//meditime
					pst.setString(23,ScreenDrug.getString("DrugUniqueCode"));//drug_unique_code
					pst.setString(24,ScreenDrug.getString("StartTime"));//startdatetime
					pst.setInt(25,1);//ordertype
					pst.setString(26,ScreenDrug.getString("RouteName"));//routename
					pst.setString(27,ScreenDrug.getString("EndTime"));//enddatetime
					pst.setInt(28,cid);//cid
					pst.setString(29,drugspec);//drugspec
					pst.setString(30,ScreenDrug.getString("ExecuteTime"));//executetime
					pst.setString(31,"");//wardname
					pst.setString(32,Patient.getString("PatCode"));//patientid
					pst.setString(33,PassClient.getString("HospID"));//hiscode
					pst.setString(34,ScreenDrug.getString("DrugName"));//ordername
					pst.setInt(35,1);//groupstate
					pst.setString(36,doseunit);//doseunit
					pst.setInt(37,0);//is_allow]
				}catch (Exception e){
					System.out.println("出现异常的数据:"+map);
					System.out.println(e);
				}
			}
			@Override
			public int getBatchSize() {
				//这个方法设定更新记录数，通常List里面存放的都是我们要更新的，所以返回list.size();  
				return listbatch.size();
			}
		};
		jdbcTemplate_oracle.batchUpdate(sql, setter);
	}
}
