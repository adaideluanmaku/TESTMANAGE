/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-23 08:06:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_005fmanage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chcss/test_manage.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chjs/test_manage.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chcss/websocket/websocket-connect.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chjs/websocket/websocket-connect.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chcss/userorders/userorders.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chjs/userorders/userorders.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chjs/loading/loading.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>TEST_MANAGE</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<input id=\"addurl\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<input id=\"userid\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<input id=\"loginname\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"doc\">\r\n");
      out.write("\t<div class=\"hd\">\r\n");
      out.write("\t\t<div class=\"menus1\">\r\n");
      out.write("\t\t\t<div id=\"menus1_1\">首页");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("<label id=\"log\" style=\"color:red;position: absolute;top:-7px;\"></label></div>\r\n");
      out.write("\t\t\t<div id=\"menus1_2\">案例</div>\r\n");
      out.write("\t\t\t<div id=\"menus1_3\">学习</div>\r\n");
      out.write("\t\t\t<!-- <div id=\"menus1_4\">PASS</div> -->\r\n");
      out.write("\t\t\t<div id=\"menus1_7\">工作计划<label id=\"work\" style=\"color:red;position: absolute;top:-7px;\"></label></div>\r\n");
      out.write("\t\t\t<div id=\"menus1_8\">聊天室<label id=\"new\" style=\"color:red;position: absolute;top:-7px;\"></label></div>\r\n");
      out.write("\t\t\t<div id=\"menus1_10\">医嘱工具<label id=\"new\" style=\"color:red;position: absolute;top:-7px;\"></label></div>\r\n");
      out.write("\t\t\t<div id=\"menus1_11\">工具箱</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"menus2\">\r\n");
      out.write("\t\t\t<div id=\"menus1_9\" class=\"menus1_9\">系统广播<label id=\"new\" style=\"color:red;position: absolute;top:-7px;\"></label></div>\r\n");
      out.write("\t\t\t<div>用户:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </div>\r\n");
      out.write("\t\t\t<div id=\"menus1_5\" class=\"menus1_5\">账号管理</div>\r\n");
      out.write("\t\t\t<div id=\"menus1_6\" class=\"menus1_6\">退出</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"bd\">\r\n");
      out.write("\t\t<iframe id=\"iframe_box\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/log/log\" frameborder=\"0\" scrolling=\"no\" class=\"iframe_box\" ></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- websocket窗口 -->\r\n");
      out.write("\t<!-- 用户列表 -->\r\n");
      out.write("\t<div id=\"user-div\" class=\"user-div\"></div>\r\n");
      out.write("\t<!-- 聊天窗口 -->\r\n");
      out.write("\t<div id=\"websocket-div\">\r\n");
      out.write("\t\t<input id=\"touid\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t<div class=\"websocket-msg\">\r\n");
      out.write("\t\t\t<!-- 标题 -->\r\n");
      out.write("\t\t\t<label id=\"websocket-msg-touser\" style=\"font-size: 20px\"></label>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 内容-->\r\n");
      out.write("\t\t\t<input id=\"touid\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t\t<div id=\"content\" class=\"content\"></div>\r\n");
      out.write("\t\t\t<div style=\"float: left\">\r\n");
      out.write("\t\t\t\t<input id=\"usermsg\" class=\"easyui-textbox\" multiline=\"true\" validType=\"length[1,10000]\" style=\"width:460px;height:50px; float: left\" onkeydown=\"send_msg(event)\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width:120px; float:right\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok',width:110\" onclick=\"sendMsg()\" style=\"float:right\">发送</a>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok',width:110\" onclick=\"clearAll()\" style=\"float:right\">清空</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 广播窗口 -->\r\n");
      out.write("\t<div id=\"broadcast-div\">\r\n");
      out.write("\t\t<div class=\"websocket-msg1\">\r\n");
      out.write("\t\t\t<!-- 内容-->\r\n");
      out.write("\t\t\t<div id=\"content1\" class=\"content\"></div>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 医嘱窗口 -->\r\n");
      out.write("\t<div id=\"orders-div\">\r\n");
      out.write("\t<input id=\"data_no\" type=\"hidden\" name=\"data_no\" value=\"\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><p1 style=\"color: blue\" >(到案例工作目录点击案例读取数据或手动写入数据)<p1></td>\r\n");
      out.write("\t\t\t<td style=\"width:200px;text-align:left\">案例编号：<span id=\"biaoti\" style=\"font-size:20px;color:red\"></span></td>\r\n");
      out.write("\t\t\t<td style=\"width:200px;text-align:left\">机构号：<input id=\"HospID\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; \"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t<p>病人基本信息</p>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t病人号：<input id=\"PatCode\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t门诊/住院号：<input id=\"InHospNo\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t门诊/住院唯一标识：<input id=\"VisitCode\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t姓名：<input id=\"Name\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t性别：\r\n");
      out.write("\t\t\t\t\t<select id=\"Sex\" class=\"easyui-combobox\" name=\"PatStatus\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"\" selected=\"selected\">无</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"男\">男</option>\r\n");
      out.write("\t\t\t\t\t    <option value=\"女\">女</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"male\">male</option>\r\n");
      out.write("\t\t\t\t\t    <option value=\"female\">female</option>\r\n");
      out.write("\t\t\t\t\t    <option value=\"m\">m</option>\r\n");
      out.write("\t\t\t\t\t    <option value=\"f\">f</option>\r\n");
      out.write("\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t出生日期：\r\n");
      out.write("\t\t\t\t\t<input  id=\"Birthday\" name=\"Birthday\" type= \"text\" class= \"easyui-datebox\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t身高cm：<input id=\"HeightCM\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t体重kg：<input id=\"WeighKG\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t科室编号：<input id=\"DeptCode\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t科室名称：<input id=\"DeptName\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t医生编号：<input id=\"DoctorCode\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t医生姓名：<input id=\"DoctorName\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t病人状态：\r\n");
      out.write("\t\t\t\t\t<select id=\"PatStatus\" class=\"easyui-combobox\" name=\"PatStatus\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"1\" selected=\"selected\">住院</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"2\">门诊</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"3\">急诊</option>  \r\n");
      out.write("\t\t\t\t\t    <option value=\"0\">出院</option>  \r\n");
      out.write("\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t是否哺乳：\r\n");
      out.write("\t\t\t\t\t<select id=\"IsLactation\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"-1\" selected=\"selected\">无法获取哺乳状态</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"0\">不是</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"1\">是</option>   \r\n");
      out.write("\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t是否妊娠：\r\n");
      out.write("\t\t\t\t\t<select id=\"IsPregnancy\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"-1\" selected=\"selected\">无法获取妊娠状态</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"0\">不是</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"1\">是</option>   \r\n");
      out.write("\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t妊娠开始时间：\r\n");
      out.write("\t\t\t\t\t<input  id=\"PregStartDate\" name=\"PregStartDate\" type= \"text\" class= \"easyui-datebox\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t肝损害程度：\r\n");
      out.write("\t\t\t\t\t<select id=\"HepDamageDegree\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"-1\" selected=\"selected\">无法获取肝损害状态</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"0\">无肝损害</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"1\">存在肝损害，但损害程度不明确</option> \r\n");
      out.write("\t\t\t\t\t    <option value=\"3\">轻度肝损害</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"4\">中度肝损害</option>\r\n");
      out.write("\t\t\t\t\t    <option value=\"5\">重度肝损害</option>   \r\n");
      out.write("\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t肾损害程度：\r\n");
      out.write("\t\t\t\t\t<select id=\"RenDamageDegree\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"-1\" selected=\"selected\">无法获取肾损害状态</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"0\">无肾损害</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"1\">存在肾损害，但损害程度不明确</option> \r\n");
      out.write("\t\t\t\t\t    <option value=\"3\">轻度肾损害</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"4\">中度肾损害</option>\r\n");
      out.write("\t\t\t\t\t    <option value=\"5\">重度肾损害</option>   \r\n");
      out.write("\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t审查时间：\r\n");
      out.write("\t\t\t\t\t<input  id=\"UseTime\" name=\"UseTime\" type= \"text\" class= \"easyui-datebox\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t审查模式：<input id=\"CheckMode\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t采集：\r\n");
      out.write("\t\t\t\t\t<select id=\"IsDoSave\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"1\" selected=\"selected\">采集</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"2\">不采</option>   \r\n");
      out.write("\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t年龄：<input id=\"Age\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t费别：<input id=\"PayClass\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t病原学检查：\r\n");
      out.write("\t\t\t\t\t<select id=\"IsTestEtiology\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"0\" selected=\"selected\">未做过</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"1\">做过</option>   \r\n");
      out.write("\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t住院时间：\r\n");
      out.write("\t\t\t\t\t<input  id=\"InHospDate\" name=\"InHospDate\" type= \"text\" class= \"easyui-datebox\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t出院时间：<input id=\"OutHospDate\" name=\"OutHospDate\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t身份证：<input id=\"IDCard\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t联系方式：<input id=\"Telephone\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>过敏原信息</p>\r\n");
      out.write("\t\t<table id=\"aller\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>疾病信息</p>\r\n");
      out.write("\t\t<table id=\"dis\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>手术信息</p>\r\n");
      out.write("\t\t<table id=\"opr\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>药品信息</p>\r\n");
      out.write("\t\t<table id=\"odr\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p style=\"background-color: #8991ef\">附加信息</p>\r\n");
      out.write("\t\t<p>信息类型</p>\r\n");
      out.write("\t\t<select id=\"jsontype\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t    <option value=\"1\" selected=\"selected\">补充信息</option>   \r\n");
      out.write("\t\t    <option value=\"2\">完整的审查输入信息</option>   \r\n");
      out.write("\t\t</select>  \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>任务类型</p>\r\n");
      out.write("\t\t<select id=\"prtasktype\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t    <option value=\"0\" selected=\"selected\">普通</option>   \r\n");
      out.write("\t\t    <option value=\"1\">加急</option>   \r\n");
      out.write("\t\t</select>  \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>补充药品信息</p>\r\n");
      out.write("\t\t<table id=\"druginfo\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>补充诊断信息</p>\r\n");
      out.write("\t\t<table id=\"diseaseinfo\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>补充历史医嘱信息</p>\r\n");
      out.write("\t\t<table id=\"otherrecipinfo\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>补充检查信息</p>\r\n");
      out.write("\t\t<table id=\"examinfo\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>补充检验信息</p>\r\n");
      out.write("\t\t<table id=\"labinfo\"></table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 过敏原字典表 -->\r\n");
      out.write("<div id=\"aller_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"aller_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"aller_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_aller_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 疾病字典表 -->\r\n");
      out.write("<div id=\"dis_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"dis_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"dis_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_dis_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 手术字典表 -->\r\n");
      out.write("<div id=\"opr_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"opr_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"opr_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_opr_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 药品字典表 -->\r\n");
      out.write("<div id=\"odr_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"odr_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"odr_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_odr_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 给药途径字典表 -->\r\n");
      out.write("<div id=\"route_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"route_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"route_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_route_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 频次字典表 -->\r\n");
      out.write("<div id=\"fre_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"fre_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"fre_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_fre_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 科室字典表 -->\r\n");
      out.write("<div id=\"dept_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"dept_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"dept_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_dept_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 医生字典表 -->\r\n");
      out.write("<div id=\"doc_dict\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"doc_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"doc_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_doc_dict\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 自定义检验检查表 -->\r\n");
      out.write("<div id=\"user_labitem\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input id=\"labitem_search_data\" class=\"easyui-textbox\" style=\"width:300px\" prompt=\"请输入编号......\">\r\n");
      out.write("\t\t<a id=\"labitem_seach\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" >查询</a>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"db_user_labitem\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 工具箱 -->\r\n");
      out.write("<div id=\"tools-div\" style=\"text-align: center; padding-top: 10px\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<a href=\"http://172.18.3.146:8087/SP_TEST_TOOLS/All/datatojson\" target=\"1\">pa-win审查结果查询</a>\r\n");
      out.write("\t\t<p></p><br> \r\n");
      out.write("\t\t<a href=\"http://172.18.3.146:8098/pass_java_anli\" target=\"1\">pass-win测试程序</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div> \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/view/test_manage.jsp(32,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aaa }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/view/test_manage.jsp(80,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginname=='admin' }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div style=\"float: left\">\r\n");
        out.write("\t\t\t\t\t<input id=\"usermsg1\" class=\"easyui-textbox\" multiline=\"true\" validType=\"length[1,10000]\" style=\"width:460px;height:50px; float: left\" onkeydown=\"send_sysmsg(event)\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t<div style=\"width:120px; float:right\">\r\n");
        out.write("\t\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok',width:110\" onclick=\"sendsysMsg()\" style=\"float:right\">发送</a>\r\n");
        out.write("\t\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok',width:110\" onclick=\"sendsysreload()\" style=\"float:right\">强刷用户页面</a>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}