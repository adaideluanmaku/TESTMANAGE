/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-23 08:07:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.testmng;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testmngs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("/chcss/testmng/testmng.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chjs/testmng/testmng.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chjs/loading/loading.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>TEST_MNG</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<input id=\"addurl\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<div class=\"doc\">\r\n");
      out.write("\t<div class=\"box_1\">\r\n");
      out.write("\t\t<div id=\"view_1\" style=\"background-color: slategray;\">团队维护</div>\r\n");
      out.write("\t\t<div id=\"view_2\">项目维护</div>\r\n");
      out.write("\t\t<div id=\"view_3\">案例维护</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"box_2_1\" class=\"box_2\">\r\n");
      out.write("\t\t<div class=\"search\" >\r\n");
      out.write("\t\t\t<div style=\"float: left; margin-right: 10px\"><input id=\"search_data\" class=\"easyui-textbox\" style=\"width:200px\" prompt=\"请输入团队名称\"></div>\r\n");
      out.write("\t\t\t<a id=\"box_search_button\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">查询</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 表格 -->\r\n");
      out.write("\t\t<div id=\"box_db\"></div>\r\n");
      out.write("\t\t<!-- 表格功能按钮 -->\r\n");
      out.write("\t\t<div id=\"button_1\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"add_\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">Add</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"del_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">delete</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"box_2_2\" class=\"box_2\">\r\n");
      out.write("\t\t<div class=\"search\" >\r\n");
      out.write("\t\t\t<!-- 下拉单 -->\r\n");
      out.write("\t\t\t<div id=\"ComboBox\" style=\"float: left; margin-right: 10px\"><input id=\"ComboBox_right\" class=\"easyui-combobox\" /></div>\r\n");
      out.write("\t\t\t<div style=\"float: left; margin-right: 10px\"><input id=\"search_data\" class=\"easyui-textbox\" style=\"width:200px\" prompt=\"请输入项目名称\"></div>\r\n");
      out.write("\t\t\t<a id=\"box_search_button\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">查询</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 表格 -->\r\n");
      out.write("\t\t<div id=\"box_db\"></div>\r\n");
      out.write("\t\t<!-- 表格功能按钮 -->\r\n");
      out.write("\t\t<div id=\"button_2\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"add_\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">Add</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"del_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">delete</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"box_2_3\" class=\"box_2\">\r\n");
      out.write("\t\t<div class=\"search\" >\r\n");
      out.write("\t\t\t<!-- 下拉单 -->\r\n");
      out.write("\t\t\t<div id=\"ComboBox\" style=\"float: left; margin-right: 10px\"><input id=\"ComboBox_right\" class=\"easyui-combobox\" /></div>\r\n");
      out.write("\t\t\t<div style=\"float: left; margin-right: 10px\"><input id=\"search_data\" class=\"easyui-textbox\" style=\"width:200px\" prompt=\"请输入案例名称、案例编号.....\"></div>\r\n");
      out.write("\t\t\t<a id=\"box_search_button\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">查询</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 表格 -->\r\n");
      out.write("\t\t<div id=\"box_db\"></div>\r\n");
      out.write("\t\t<!-- 表格功能按钮-->\r\n");
      out.write("\t\t<div id=\"button_3\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"add_\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">Add</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"del_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">delete</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"copy_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">copy</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-menubutton\" data-options=\"menu:'#mm_selenium',iconCls:'icon-edit'\" >selenium功能</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-menubutton\" data-options=\"menu:'#mm_pa',iconCls:'icon-edit'\" >PA功能</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"projectid\" value=\"\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mm_selenium\" style=\"width:150px;\">\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"script_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">selenium-script</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"test_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">selenium-testone</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"selenium_all_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">selenium_testall</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mm_pa\" style=\"width:180px;\">\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"pa_java\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">pa-screen-one-java</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"pa_screen_redis\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">pa-screen-redis</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"pa_all\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">pa-screen-all</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"pa_redis_clear\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">pa-screen-redis-clear</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"hisdate_to_oracle\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">hisdate_to_oracle</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"pa_win\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">pa-screen-one-win</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mm_pass\" style=\"width:180px;\">\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"hisdate_to_oracle\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">pass_hisdate_to_oracle</a>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("<!-- 对话框 -->\r\n");
      out.write("<!-- 区分dialog保存时，0为新增，1为更新 -->\r\n");
      out.write("<input id=\"dialog_type\" type=\"hidden\" value=\"0\">\r\n");
      out.write("<div id=\"team_dialog\">\r\n");
      out.write("\t<!-- 文本框 -->\r\n");
      out.write("\t<div style=\"margin-bottom:20px; text-align: center; padding-top:10px;\">\r\n");
      out.write("\t\t<form id=\"team_form\">\r\n");
      out.write("\t\t<input id=\"teamid\" type=\"hidden\" name=\"teamid\" value=\"\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t团队名称 :\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"teamname\" name=\"teamname\" class=\"easyui-textbox\" required=\"true\" validType=\"length[1,100]\" style=\"width:200px;height:32px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>备注 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"remark\" name=\"remark\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:550px;height:100px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 对话框 -->\r\n");
      out.write("<div id=\"project_dialog\">\r\n");
      out.write("\t<!-- 文本框 -->\r\n");
      out.write("\t<div style=\"margin-bottom:20px; text-align: center; padding-top:10px;\">\r\n");
      out.write("\t\t<form id=\"project_form\">\r\n");
      out.write("\t\t<input id=\"projectid\" type=\"hidden\" name=\"projectid\" value=\"\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t<!-- 下拉单 -->\r\n");
      out.write("\t\t\t\t<input id=\"ComboBox_right\" required=\"true\" name=\"teamid\" class=\"easyui-combobox\"/> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div >项目名称 : </div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"projectname\" name=\"projectname\" class=\"easyui-textbox\" required=\"true\" validType=\"length[1,100]\" style=\"width:200px;height:32px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>备注 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"remark\" name=\"remark\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:550px;height:100px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 对话框 -->\r\n");
      out.write("<div id=\"testmng_dialog\">\r\n");
      out.write("\t<!-- 文本框 -->\r\n");
      out.write("\t<div style=\"margin-bottom:20px; text-align: center; padding-top:10px;\">\r\n");
      out.write("\t\t<form id=\"testmng_form\">\r\n");
      out.write("\t\t<input id=\"testid\" type=\"hidden\" name=\"testid\" value=\"\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t<!-- 下拉单 -->\r\n");
      out.write("\t\t\t\t<input id=\"ComboBox_right\" required=\"true\" name=\"projectid\" class=\"easyui-combobox\"/> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t<!-- 案例状态 -->\r\n");
      out.write("\t\t\t\t<select id=\"ComboBox_status\" class=\"easyui-combobox\" name=\"status\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">启用</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"0\">停用</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div >selenium公共脚本 : </div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<select id=\"selenium_share_status\" class=\"easyui-combobox\" name=\"selenium_share_status\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\">否</option> \r\n");
      out.write("\t\t\t\t    <option value=\"1\">是</option>  \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div >案例名称 : </div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"testname\" name=\"testname\" class=\"easyui-textbox\" required=\"true\" validType=\"length[1,100]\" style=\"width:400px;height:32px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>案例编号 :1-1(格式范例)</div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"testno\" name=\"testno\" class=\"easyui-textbox\" multiline=\"true\" required=\"true\" style=\"width:200px;height:32px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>逻辑描述 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"testtext\" name=\"testtext\" class=\"easyui-textbox\" multiline=\"true\" validType=\"length[1,10000]\" style=\"width:550px;height:100px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>输入条件 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"testin\" name=\"testin\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:550px;height:250px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>预期结果 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"testout\" name=\"testout\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:550px;height:100px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>备注 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"remark\" name=\"remark\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:550px;height:100px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 对话框 -->\r\n");
      out.write("<div id=\"script_dialog\">\r\n");
      out.write("\t<div class=\"search1\" >\r\n");
      out.write("\t\t<div style=\"float: left; margin-right: 10px\"><input id=\"search_data\" class=\"easyui-textbox\" style=\"width:200px\" prompt=\"请输入脚本名称\"></div>\r\n");
      out.write("\t\t<a id=\"box_search_button\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">查询</a>\r\n");
      out.write("\t\t<a id=\"selenium_button\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save'\">上传selenium脚本</a>\r\n");
      out.write("\t\t<a id=\"selenium_button1\" href=\"\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save'\">下载selenium脚本</a>\r\n");
      out.write("\t\t<a id=\"selenium_button2\" href=\"\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save'\">删除selenium脚本</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 表格 -->\r\n");
      out.write("\t<div id=\"box_db\"></div>\r\n");
      out.write("\t<!-- 表格功能按钮-->\r\n");
      out.write("\t<div id=\"button_4\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" id=\"add_\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">Add</a>\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" id=\"del_\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">delete</a>\r\n");
      out.write("\t</div> \r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("<div id=\"script_dialog_1\">\r\n");
      out.write("\t<div style=\"margin-bottom:20px; text-align: center; padding-top:10px;\">\r\n");
      out.write("\t\t<form id=\"script_form\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"testid\" name=\"testid\" value=\"\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"scriptid\" name=\"scriptid\" value=\"\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"ComboBox_right\" required=\"true\" name=\"scripttype\" class=\"easyui-combobox\"/> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<a id=\"selenium_link\" href=\"#\" onClick=\"selenium_link()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">选择关联selenium案例</a>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div >案例编号 : </div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"testno\" name=\"testno\" class=\"easyui-textbox\" required=\"true\" style=\"width:200px;height:32px;\" readonly=\"true\" >\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>步骤 :(只能写数字) </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"step\" name=\"step\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:200px;height:32px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>步骤名称 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"scriptname\" name=\"scriptname\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:400px;height:32px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>页面定位 :(如果是新标签页面、切换窗口、关联案例脚本，请输入页面URL) </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"xpath\" name=\"xpath\" class=\"easyui-textbox\" multiline=\"true\" validType=\"length[1,1000]\" style=\"width:550px;height:100px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>输入值 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t \t<input id=\"testvalue\" name=\"testvalue\" class=\"easyui-textbox\" multiline=\"true\" style=\"width:550px;height:100px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div >测试页面地址 : </div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"testurl\" name=\"testurl\" class=\"easyui-textbox\" validType=\"length[1,1000]\" style=\"width:400px;height:32px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 关联公共脚本使用 -->\r\n");
      out.write("<div id=\"script_dialog_2\">\r\n");
      out.write("\t<div style=\"float: left; margin-right: 10px\"><input id=\"search_data\" class=\"easyui-textbox\" style=\"width:200px\" prompt=\"请输入案例名称、案例编号.....\"></div>\r\n");
      out.write("\t<a id=\"box_search_button\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">查询</a>\r\n");
      out.write("\t<div id=\"box_db\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- redis查询对话框 -->\r\n");
      out.write("<div id=\"redis_dialog\">\r\n");
      out.write("\t<div id=\"redisresult\" style=\"word-wrap: break-word;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 案例测试结果对话框 -->\r\n");
      out.write("<div id=\"json_dialog\">\r\n");
      out.write("\t<div id=\"redisresult\" style=\"word-wrap: break-word;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 对话框 -->\r\n");
      out.write("<div id=\"selenium_file\">\r\n");
      out.write("\t<!-- 进度条 -->\r\n");
      out.write("\t<!-- 文本框 -->\r\n");
      out.write("\t<div style=\"margin-bottom:20px; text-align: center; padding-top:10px;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<div>附件 : </div>\r\n");
      out.write("\t\t\t\t</td >\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!-- 上传附件 -->\r\n");
      out.write("\t\t\t\t<form id=\"form_file\" enctype=\"multipart/form-data\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<input id=\"testid\" type=\"hidden\" value=\"\" name=\"testid\">\r\n");
      out.write("\t\t\t        <div>  \r\n");
      out.write("\t\t\t            <input id=\"learnfile1\" name=\"learnfile1\" class=\"easyui-filebox\" style=\"width:300px\">\r\n");
      out.write("\t\t\t            <!-- <input type=\"submit\" value=\"提交\"> -->\r\n");
      out.write("\t\t\t            <a id=\"file_button\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok'\">提交</a>\r\n");
      out.write("\t\t\t        </div>  \r\n");
      out.write("\t\t\t \t</form>\r\n");
      out.write("\t\t\t \t<div style=\"margin: 0 auto; color: red\">只能java脚本</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 附件显示查看或者下载 -->\r\n");
      out.write("<a id=\"file_dialog\" href=\"\"></a>\r\n");
      out.write("\r\n");
      out.write("<!-- HIS DATE TO ORACLE TOOL DIALOG -->\r\n");
      out.write("<div id=\"hisdate_to_oracle_dialog\">\r\n");
      out.write("<h1>将数据导入到ORACLE数据库，模拟HIS数据。</h1><br>\r\n");
      out.write("<h1>N家HISCODE*数据集*单天循环次数*天数=总数</h1>\r\n");
      out.write("\t<table style=\"padding-top: 15px;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\tN家机构：<input id=\"hiscodes1\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:300px;height:25px; float: left\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\t开始时间：<input  id=\"datetime1\" type= \"text\" class= \"easyui-datebox\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\t范例：单：HISCODE001。多：HISCODE001,HISCODE002\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\t范例：2012-01-01\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table style=\"padding-top: 15px;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\t循环1次数据集：\r\n");
      out.write("\t\t\t\t<select id=\"anlisum\" class=\"easyui-combobox\" name=\"PatStatus\" style=\"width:200px;\">   \r\n");
      out.write("\t\t\t\t    <option value=\"1\" selected=\"selected\">23条PASS各模块案例</option> \r\n");
      out.write("\t\t\t\t    <option value=\"2\">2235条PASS全案例</option>  \r\n");
      out.write("\t\t\t\t    <option value=\"3\">343条PA全案例</option>\r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table style=\"padding-top: 15px;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t单天循环次数：<input id=\"count1\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t循环天数：<input id=\"sum_date1\" class=\"easyui-textbox\" validType=\"length[1,10000]\" style=\"width:100px;height:25px; float: left\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table style=\"padding-top: 15px;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t重新创建所有表和结构：\r\n");
      out.write("\t\t\t\t<select id=\"createTB1\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\" selected=\"selected\">关</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">开</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t创建视图：\r\n");
      out.write("\t\t\t\t<select id=\"createview1\" class=\"easyui-combobox\" style=\"width:100px;\" readonly=\"true\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\" selected=\"selected\">关</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">开</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t先清空业务表：\r\n");
      out.write("\t\t\t\t<select id=\"trunca1\" class=\"easyui-combobox\" style=\"width:100px;\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\" selected=\"selected\">关</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">开</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t门诊数据：\r\n");
      out.write("\t\t\t\t<select id=\"mz1\" class=\"easyui-combobox\" style=\"width:100px;\"  readonly=\"true\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\" selected=\"selected\">关</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">开</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td >\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t住院数据：\r\n");
      out.write("\t\t\t\t<select id=\"zy1\" class=\"easyui-combobox\" style=\"width:100px;\"  readonly=\"true\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\" selected=\"selected\">关</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">开</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t出院数据：\r\n");
      out.write("\t\t\t\t<select id=\"cy1\" class=\"easyui-combobox\" style=\"width:100px;\"  readonly=\"true\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\" selected=\"selected\">关</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">开</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table style=\"padding-top: 20px;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\t配对方案编号：\r\n");
      out.write("\t\t\t\t<input  id=\"match_scheme1\" type= \"text\" class= \"easyui-textbox\" style=\"width:100px;height:25px; float: left\"> \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t字典表数据：\r\n");
      out.write("\t\t\t\t<select id=\"dict1\" class=\"easyui-combobox\" style=\"width:100px;\"  readonly=\"true\">   \r\n");
      out.write("\t\t\t\t    <option value=\"0\" selected=\"selected\">关</option>   \r\n");
      out.write("\t\t\t\t    <option value=\"1\">开</option>   \r\n");
      out.write("\t\t\t\t</select>  \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\t范例：单：4 。多：4,5,6\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
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
}
