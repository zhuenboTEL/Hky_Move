/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.RC0
 * Generated at: 2018-01-26 06:38:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <title>KIT ADMIN</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/plugins/layui/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/build/css/app.css\" media=\"all\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/build/js/jquery-3.2.1.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/build/js/menu_min.js\"></script> \t\r\n");
      out.write("    <script src=\"/plugins/layui/layui.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("  $(document).ready(function (){\r\n");
      out.write("\t  $(\".menu ul li\").menu();\r\n");
      out.write("});\r\n");
      out.write("  </script>  \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"layui-layout layui-layout-admin kit-layout-admin\">\r\n");
      out.write("        <div class=\"layui-header\">\r\n");
      out.write("            <div class=\"layui-logo\">Personnel 管理系统</div>\r\n");
      out.write("            <div class=\"layui-logo kit-logo-mobile\">K</div>\r\n");
      out.write("            \r\n");
      out.write("            <ul class=\"layui-nav layui-layout-right kit-nav\">\r\n");
      out.write("                <li class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <img src=\"http://m.zhengjinfan.cn/images/0.jpg\" class=\"layui-nav-img\"> Van\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <dl class=\"layui-nav-child\">\r\n");
      out.write("                        <dd><a href=\"javascript:;\">基本资料</a></dd>\r\n");
      out.write("                        <dd><a href=\"javascript:;\">安全设置</a></dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"layui-nav-item\"><a href=\"javascript:;\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> 注销</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("        <div class=\"layui-side layui-bg-black kit-side\">\r\n");
      out.write("            <div class=\"layui-side-scroll\">\r\n");
      out.write("                <div class=\"kit-side-fold\"><i class=\"fa fa-navicon\" aria-hidden=\"true\"></i></div>\r\n");
      out.write("                 <div class=\"menu\">\r\n");
      out.write("                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("                <ul class=\"layui-nav layui-nav-tree\" lay-filter=\"kitNavbar\" kit-navbar>\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a class=\"\" href=\"javascript:;\"><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span>个人信息</span></a>\r\n");
      out.write("                        <ul class=\"layui-nav-child\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 综合信息</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("                                <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>信息清单</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("\t\t                        <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 基本信息</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("\t\t                        <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"/page/basic\" data-icon=\"fa-user\" data-title=\"基本信息\" kit-target data-id='1'><i class=\"layui-icon\" aria-hidden=\"true\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>基本信息</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"/page/message\" data-icon=\"fa-user\" data-title=\"通讯信息\" kit-target data-id='2'><i class=\"layui-icon\" aria-hidden=\"true\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>通讯信息</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                             \r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </li>\r\n");
      out.write("\t\t                     <li>\r\n");
      out.write("\t\t                        <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 经历信息</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("\t\t                        <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"nav.html\" data-icon=\"&#xe628;\" data-title=\"导航栏\" kit-target data-id='3'><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>教育经历</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"list4.html\" data-icon=\"&#xe614;\" data-title=\"列表四\" kit-target data-id='4'><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>工作经历</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                                <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 论文专著</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("                                <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>论文发表</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>专著译著</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>有效专利</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>软件著作权</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("\t\t                        <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 项目支撑</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("\t\t                        <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"/page/message\" data-icon=\"fa-user\" data-title=\"通讯信息\" kit-target data-id='2'><i class=\"layui-icon\" aria-hidden=\"true\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>科研支撑</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"/page/message\" data-icon=\"fa-user\" data-title=\"通讯信息\" kit-target data-id='2'><i class=\"layui-icon\" aria-hidden=\"true\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>技术支撑</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("\t\t                        <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 成就荣誉</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &#xe61a;</i></a>\r\n");
      out.write("\t\t                        <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"nav.html\" data-icon=\"&#xe628;\" data-title=\"导航栏\" kit-target data-id='3'><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>任职情况</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"list4.html\" data-icon=\"&#xe614;\" data-title=\"列表四\" kit-target data-id='4'><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>荣誉称号</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"nav.html\" data-icon=\"&#xe628;\" data-title=\"导航栏\" kit-target data-id='3'><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>兼职情况</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"list4.html\" data-icon=\"&#xe614;\" data-title=\"列表四\" kit-target data-id='4'><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>人才培养</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                                <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 年度考核</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("                                <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分年度</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                             <li>\r\n");
      out.write("\t\t                        <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 自我评价</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("\t\t                        <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"/page/message\" data-icon=\"fa-user\" data-title=\"通讯信息\" kit-target data-id='2'><i class=\"layui-icon\" aria-hidden=\"true\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分年度</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" data-url=\"/page/message\" data-icon=\"fa-user\" data-title=\"通讯信息\" kit-target data-id='2'><i class=\"layui-icon\" aria-hidden=\"true\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分季度</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("\t\t                        <a href=\"javascript:;\" data-url=\"/page/message\" data-icon=\"fa-user\" data-title=\"通讯信息\" kit-target data-id='2'><i class=\"layui-icon\" aria-hidden=\"true\">&nbsp;&#xe658;</i><span>领导考评</span></a>\r\n");
      out.write("\t\t                    </li>\t\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a class=\"\" href=\"javascript:;\"><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span>员工管理</span></a>\r\n");
      out.write("                         <ul class=\"layui-nav-child\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 人员信息管理</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("                                <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分支主题</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 考勤管理</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("                                <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>事假</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>病假</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>出差</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 合同管理</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("                                <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>新增</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>续签</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>终止</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\"><i class=\"layui-icon\">&nbsp;&#xe658;</i><span> 人员变动</span><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>\r\n");
      out.write("                                <ul class=\"layui-nav-child\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>入职</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>离职</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>晋升</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <a href=\"javascript:;\" kit-target data-options=\"{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}\"><i class=\"layui-icon\">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>调动</span></a>\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a class=\"\" href=\"javascript:;\"><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span>部门管理</span></a>\r\n");
      out.write("                        <ul class=\"layui-nav-child\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\" data-url=\"nav.html\" data-icon=\"&#xe628;\" data-title=\"导航栏\" kit-target data-id='3'><i class=\"layui-icon\">&nbsp;&#xe654;</i><span>增加</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\" data-url=\"list4.html\" data-icon=\"&#xe614;\" data-title=\"列表四\" kit-target data-id='4'><i class=\"layui-icon\">&nbsp;&#xe642;</i><span>调整</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\" data-url=\"list4.html\" data-icon=\"&#xe614;\" data-title=\"列表四\" kit-target data-id='4'><i class=\"layui-icon\">&nbsp;&#xe640;</i><span>删除</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a class=\"\" href=\"javascript:;\"><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span>薪酬管理</span></a>\r\n");
      out.write("                        <ul class=\"layui-nav-child\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\" data-url=\"nav.html\" data-icon=\"&#xe628;\" data-title=\"导航栏\" kit-target data-id='3'><i class=\"layui-icon\">&nbsp;&#xe65e;</i><span>薪酬表</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:;\" data-url=\"list4.html\" data-icon=\"&#xe614;\" data-title=\"列表四\" kit-target data-id='4'><i class=\"layui-icon\">&nbsp;&#xe659;</i><span>薪酬变动表</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a href=\"javascript:;\" data-url=\"/components/table/table.html\" data-name=\"table\" kit-loader><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span>用户权限管理</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-body\" id=\"container\">\r\n");
      out.write("            <!-- 内容主体区域 -->\r\n");
      out.write("            <div style=\"padding: 15px;\">主体内容加载中,请稍等...</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layui-footer\">\r\n");
      out.write("            <!-- 底部固定区域 -->\r\n");
      out.write("            2017 &copy;\r\n");
      out.write("            <a href=\"http://kit.zhengjinfan.cn/\">kit.zhengjinfan.cn/</a> MIT license\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <script>\r\n");
      out.write("        var message;\r\n");
      out.write("        layui.config({\r\n");
      out.write("            base: '/build/js/'\r\n");
      out.write("        }).use(['app', 'message'], function() {\r\n");
      out.write("            var app = layui.app,\r\n");
      out.write("                $ = layui.jquery,\r\n");
      out.write("                layer = layui.layer;\r\n");
      out.write("            //将message设置为全局以便子页面调用\r\n");
      out.write("            message = layui.message;\r\n");
      out.write("            //主入口\r\n");
      out.write("            app.set({\r\n");
      out.write("                type: 'iframe'\r\n");
      out.write("            }).init();\r\n");
      out.write("            $('#pay').on('click', function() {\r\n");
      out.write("                layer.open({\r\n");
      out.write("                    title: false,\r\n");
      out.write("                    type: 1,\r\n");
      out.write("                    content: '<img src=\"/build/images/pay.png\" />',\r\n");
      out.write("                    area: ['500px', '250px'],\r\n");
      out.write("                    shadeClose: true\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        }); \r\n");
      out.write("        \r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}