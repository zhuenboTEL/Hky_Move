/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.RC0
 * Generated at: 2018-01-26 05:51:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>个人基本信息</title>\r\n");
      out.write("<link href=\"/bootstrap/layui/css/layui.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"margin-top: 20px;margin-left: 25%;margin-right: 25%\">\r\n");
      out.write("  <form class=\"layui-form layui-form-pane\" action=\"\">\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">用户名</label>\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <input type=\"text\" name=\"title\" autocomplete=\"off\" placeholder=\"请输入标题\" value=\"小明\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\" pane=\"\" class=\"layui-form\" lay-filter=\"test1\">\r\n");
      out.write("    <label class=\"layui-form-label\">性别</label>\r\n");
      out.write("    <div class=\"layui-input-block\" class=\"layui-form\">\r\n");
      out.write("      <input type=\"radio\" name=\"sex\" value=\"nan\" title=\"男\" checked=\"checked\">\r\n");
      out.write("\t  <input type=\"radio\" name=\"sex\" value=\"nv\" title=\"女\" >\r\n");
      out.write("\t  <input type=\"radio\" name=\"sex\" value=\"\" title=\"中性\" disabled>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">出生日期</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" value=\"1998-06-09\t\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">民族</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"0\">汉</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">籍贯</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select name=\"quiz1\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"\">请选择省</option>\r\n");
      out.write("        <option value=\"浙江\" selected=\"\">浙江省</option>\r\n");
      out.write("        <option value=\"你的工号\">江西省</option>\r\n");
      out.write("        <option value=\"你最喜欢的老师\">福建省</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select name=\"quiz2\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"\">请选择市</option>\r\n");
      out.write("        <option value=\"杭州\">杭州</option>\r\n");
      out.write("        <option value=\"宁波\" disabled=\"\">宁波</option>\r\n");
      out.write("        <option value=\"温州\">温州</option>\r\n");
      out.write("        <option value=\"温州\">台州</option>\r\n");
      out.write("        <option value=\"温州\">绍兴</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select name=\"quiz3\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"\">请选择县/区</option>\r\n");
      out.write("        <option value=\"西湖区\">西湖区</option>\r\n");
      out.write("        <option value=\"余杭区\">余杭区</option>\r\n");
      out.write("        <option value=\"拱墅区\">临安市</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">出生地</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select name=\"quiz1\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"\">请选择省</option>\r\n");
      out.write("        <option value=\"浙江\" selected=\"\">浙江省</option>\r\n");
      out.write("        <option value=\"你的工号\">江西省</option>\r\n");
      out.write("        <option value=\"你最喜欢的老师\">福建省</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select name=\"quiz2\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"\">请选择市</option>\r\n");
      out.write("        <option value=\"杭州\">杭州</option>\r\n");
      out.write("        <option value=\"宁波\" disabled=\"\">宁波</option>\r\n");
      out.write("        <option value=\"温州\">温州</option>\r\n");
      out.write("        <option value=\"温州\">台州</option>\r\n");
      out.write("        <option value=\"温州\">绍兴</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select name=\"quiz3\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"\">请选择县/区</option>\r\n");
      out.write("        <option value=\"西湖区\">西湖区</option>\r\n");
      out.write("        <option value=\"余杭区\">余杭区</option>\r\n");
      out.write("        <option value=\"拱墅区\">临安市</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\" style=\"width: 120px\">参加工作时间</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" value=\"1998-06-09\t\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">政治面貌</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\">\r\n");
      out.write("        <option value=\"0\">中共党员</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">入党时间</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" value=\"1998-06-09\t\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">技术职务</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\" >\r\n");
      out.write("        <option value=\"0\">写作</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">取得时间</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" value=\"1998-06-09\t\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">聘任时间</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" value=\"1998-06-09\t\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">技术等级</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\" >\r\n");
      out.write("        <option value=\"0\">专业技术十三级</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">行政级别</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\" >\r\n");
      out.write("        <option value=\"0\">正局级</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">研究领域</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\" >\r\n");
      out.write("        <option value=\"0\">其他研究</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">专业特长</label>\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <input type=\"text\" name=\"title\" autocomplete=\"off\" placeholder=\"请输入标题\" value=\"小明\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">最高学历</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\" >\r\n");
      out.write("        <option value=\"0\">博士研究生</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">最高学位</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\" >\r\n");
      out.write("        <option value=\"0\">学士</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">身份证号</label>\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <input type=\"text\" name=\"title\" autocomplete=\"off\" placeholder=\"请输入标题\" value=\"小明\" class=\"layui-input\" disabled=\"disabled\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\" pane=\"\" class=\"layui-form\" lay-filter=\"test1\">\r\n");
      out.write("    <label class=\"layui-form-label\">留学经历</label>\r\n");
      out.write("    <div class=\"layui-input-block\" class=\"layui-form\">\r\n");
      out.write("      <input type=\"radio\" name=\"sex\" value=\"nan\" title=\"有\" checked=\"checked\">\r\n");
      out.write("\t  <input type=\"radio\" name=\"sex\" value=\"nv\" title=\"无\" >\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">外语水平</label>\r\n");
      out.write("    <div class=\"layui-input-block\" style=\"width: 100px\">\r\n");
      out.write("      <select name=\"interest\" lay-filter=\"aihao\" disabled=\"disabled\" >\r\n");
      out.write("        <option value=\"0\">学士</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <button class=\"layui-btn\" lay-submit=\"\" lay-filter=\"demo2\" style=\"margin-left: 40%\">修改基本信息</button>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/bootstrap/js/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/bootstrap/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("layui.use(['form', 'layedit', 'laydate'], function(){\r\n");
      out.write("  var form = layui.form\r\n");
      out.write("  ,layer = layui.layer\r\n");
      out.write("  ,layedit = layui.layedit\r\n");
      out.write("  ,laydate = layui.laydate;\r\n");
      out.write("  \r\n");
      out.write("  form.render(null,\"test1\"); //更新全部\r\n");
      out.write("  //日期\r\n");
      out.write("  laydate.render({\r\n");
      out.write("    elem: '#date'\r\n");
      out.write("  });\r\n");
      out.write("  laydate.render({\r\n");
      out.write("    elem: '#date1'\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  //创建一个编辑器\r\n");
      out.write("  var editIndex = layedit.build('LAY_demo_editor');\r\n");
      out.write(" \r\n");
      out.write("  //自定义验证规则\r\n");
      out.write("  form.verify({\r\n");
      out.write("    title: function(value){\r\n");
      out.write("      if(value.length < 5){\r\n");
      out.write("        return '标题至少得5个字符啊';\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    ,pass: [/(.+){6,12}$/, '密码必须6到12位']\r\n");
      out.write("    ,content: function(value){\r\n");
      out.write("      layedit.sync(editIndex);\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  //监听指定开关\r\n");
      out.write("  form.on('switch(switchTest)', function(data){\r\n");
      out.write("    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {\r\n");
      out.write("      offset: '6px'\r\n");
      out.write("    });\r\n");
      out.write("    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  //监听提交\r\n");
      out.write("  form.on('submit(demo1)', function(data){\r\n");
      out.write("    layer.alert(JSON.stringify(data.field), {\r\n");
      out.write("      title: '最终的提交信息'\r\n");
      out.write("    })\r\n");
      out.write("    return false;\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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