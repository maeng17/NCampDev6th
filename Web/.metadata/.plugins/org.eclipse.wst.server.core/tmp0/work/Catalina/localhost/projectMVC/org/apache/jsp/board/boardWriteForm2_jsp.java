/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-23 08:02:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardWriteForm2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	table {\r\n");
      out.write("		border-collapse: collapse;\r\n");
      out.write("	}\r\n");
      out.write("	#boardWriteForm {\r\n");
      out.write("		display:flex;\r\n");
      out.write("	    flex-direction:column;\r\n");
      out.write("	    align-items: center;\r\n");
      out.write("	    margin:0 auto;\r\n");
      out.write("	    text-align: left;\r\n");
      out.write("	}\r\n");
      out.write("	#boardWriteForm div {\r\n");
      out.write("		color: red;\r\n");
      out.write("		font-size: 8pt;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("	#header {\r\n");
      out.write("	height: 10%;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\" style=\"text-align: center;\">\r\n");
      out.write("	<h1>\r\n");
      out.write("		<a href=\"/projectMVC/index.jsp\">\r\n");
      out.write("			<img alt=\"cat\" src=\"../image/cat.jpg\"  width=\"50\" height=\"50\"  >			\r\n");
      out.write("		</a>\r\n");
      out.write("	</h1>	\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/boardMenu.jsp", out, false);
      out.write("\r\n");
      out.write("			\r\n");
      out.write("	<div id=\"section\">\r\n");
      out.write("		<form name=\"boardWriteForm\" id=\"boardWriteForm\">\r\n");
      out.write("		<h3>글쓰기</h3>\r\n");
      out.write("			<table border=\"1\" cellpadding=\"7\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th width=\"100\">제목</th>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input type=\"text\" name=\"subject\" id=\"subject\" size=\"45\" />\r\n");
      out.write("						<div id=\"subjectDiv\"></div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>내용</th>\r\n");
      out.write("					<td>\r\n");
      out.write("						<textarea name=\"content\" id=\"content\" cols=\"50\" rows=\"15\"></textarea>\r\n");
      out.write("						<div id=\"contentDiv\"></div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"2\" align=\"center\">\r\n");
      out.write("						<input type=\"button\" value=\"글쓰기\" id=\"boardWriteBtn\" />\r\n");
      out.write("						<input type=\"reset\" value=\"다시작성\" />\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jQuery.com/jquery-3.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/* $(function(){\r\n");
      out.write("	$('#boardWriteBtn').click(function(){});\r\n");
      out.write("});  둘 중 하나 사용 가능*/\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("	$('#boardWriteBtn').click(function(){\r\n");
      out.write("		$('#subjectDiv').empty();\r\n");
      out.write("		$('#contentDiv').empty();\r\n");
      out.write("		\r\n");
      out.write("		if($('#subject').val() == '')\r\n");
      out.write("			$('#subjectDiv').html(\"제목 입력\");\r\n");
      out.write("		else if($('#content').val() == '')\r\n");
      out.write("			$('#contentDiv').html(\"내용 입력\");\r\n");
      out.write("		else\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type: 'post'\r\n");
      out.write("				, url: '/projectMVC/board/boardWrite2.do'\r\n");
      out.write("				, data: {'subject':$('#subject').val(), 'content':$('#content').val() }\r\n");
      out.write("				, dataType: 'text'\r\n");
      out.write("				, success: function(data){\r\n");
      out.write("					//alert(data.trim());\r\n");
      out.write("					\r\n");
      out.write("					if(data.trim() == 'ok'){\r\n");
      out.write("						alert(\"작성하신 글을 등록하였습니다.\");\r\n");
      out.write("						location.href=\"/projectMVC/board/boardlist.do?pg=1\";\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				, error: function(e){\r\n");
      out.write("					console.log(e)\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
