/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-13 13:37:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeReview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>리뷰작성</title>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t*{\r\n");
      out.write("\t\tmargin:0;\r\n");
      out.write("\t\tpadding:0;\r\n");
      out.write("\t}\r\n");
      out.write("\t.review-top{\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t\theight:50px;\r\n");
      out.write("\t\tbackground-color:#4286f4;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t\tcolor:white;\r\n");
      out.write("\t\tfont-weight:800;\r\n");
      out.write("\t\tfont-size:18px;\r\n");
      out.write("\t\tline-height:50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.title{\r\n");
      out.write("\t\tmargin-top:20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.point-text{\r\n");
      out.write("\t\tcolor:red;\r\n");
      out.write("\t\tfont-size:14px;\r\n");
      out.write("\t\tmargin-bottom:10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.review-text{\r\n");
      out.write("\t\tpadding-top: 10px;\r\n");
      out.write("\t\tborder-top:1px solid #cdcdcd;\r\n");
      out.write("\t}\r\n");
      out.write("\tp{\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t\tfont-weight:800;\r\n");
      out.write("\t\tfont-size:18px;\r\n");
      out.write("\t}\r\n");
      out.write(".bg {\r\n");
      out.write("    width: 250px;\r\n");
      out.write("    height: 58px;\r\n");
      out.write("    display: block;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    background: url(\"../img/star0.png\");\r\n");
      out.write("    margin: 5px auto;\r\n");
      out.write("}\r\n");
      out.write("em {\r\n");
      out.write("    height: 58px;\r\n");
      out.write("    display: block;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    background: url(\"../img/star5.png\");\r\n");
      out.write("}\r\n");
      out.write("#rank-wrap{\r\n");
      out.write("\twidth:250px;\r\n");
      out.write("\theight:58px;\r\n");
      out.write("\tmargin:-58px auto 0px;\r\n");
      out.write("}\r\n");
      out.write("#rank-wrap a{\r\n");
      out.write("\twidth:50px;\r\n");
      out.write("\theight:58px;\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("}\r\n");
      out.write("textarea{\r\n");
      out.write("\twidth: 480px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: 1px solid #cdcdcd;\r\n");
      out.write("    background-color: #ebebeb;\r\n");
      out.write("    margin: 15px auto;\r\n");
      out.write("    display: block;\r\n");
      out.write("    resize:none;\r\n");
      out.write("}\r\n");
      out.write("#write-btn{\r\n");
      out.write("\tbackground-color: #4286f4;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: 1px solid #cdcdcd;\r\n");
      out.write("    width: 480px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("    font-weight: 800;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tlet rank = document.getElementById(\"rank-wrap\").childNodes;\r\n");
      out.write("\t\tlet star = document.getElementById(\"star\");\r\n");
      out.write("\t\tlet point = document.getElementById(\"point\");\r\n");
      out.write("\t\tlet value = document.getElementsByName(\"reviewRank\");\r\n");
      out.write("\t\tlet text = document.getElementById(\"text\");\r\n");
      out.write("\t\tlet $rank = $(\"input[name=reviewRank]\");\r\n");
      out.write("\t\trank[1].onclick = function(){\r\n");
      out.write("\t\t\tstar.style.width = \"23%\";\r\n");
      out.write("\t\t\t$rank.val('1');\r\n");
      out.write("\t\t\tpoint.innerHTML= \"1점\";\r\n");
      out.write("\t\t\ttext.innerHTML = \"최악입니다\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\trank[2].onclick = function(){\r\n");
      out.write("\t\t\tstar.style.width = \"42%\";\r\n");
      out.write("\t\t\t$rank.val('2');\r\n");
      out.write("\t\t\tpoint.innerHTML= \"2점\";\r\n");
      out.write("\t\t\ttext.innerHTML = \"별로에요\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\trank[3].onclick = function(){\r\n");
      out.write("\t\t\tstar.style.width = \"60%\";\r\n");
      out.write("\t\t\t$rank.val('3');\r\n");
      out.write("\t\t\tpoint.innerHTML= \"3점\";\r\n");
      out.write("\t\t\ttext.innerHTML = \"괜찮아요\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\trank[4].onclick = function(){\r\n");
      out.write("\t\t\tstar.style.width = \"79%\";\r\n");
      out.write("\t\t\t$rank.val('4');\r\n");
      out.write("\t\t\tpoint.innerHTML= \"4점\";\r\n");
      out.write("\t\t\ttext.innerHTML = \"만족합니다\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\trank[5].onclick = function(){\r\n");
      out.write("\t\t\tstar.style.width = \"100%\";\r\n");
      out.write("\t\t\t$rank.val('5');\r\n");
      out.write("\t\t\tpoint.innerHTML= \"5점\";\r\n");
      out.write("\t\t\ttext.innerHTML = \"최고에요\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$('#reviewCon').keyup(function (e){\r\n");
      out.write("\t\t\tvar content = $(this).val();\r\n");
      out.write("\t        $('#counter').html(content.length + '/300자');\r\n");
      out.write("\t        if(content.length>300){\r\n");
      out.write("        \t\talert(\"300자 제한입니다.\");\r\n");
      out.write("\t        \t$(this).val($(this).val().substr(0, 300));\r\n");
      out.write("\t        \t$('#counter').html(300 + '/300자');\r\n");
      out.write("\t        \t$('#counter').css(\"color\",\"black\");\r\n");
      out.write("\t        }\r\n");
      out.write("\t        if(content.length>=10){\r\n");
      out.write("  \t    \t\treturn true;\r\n");
      out.write("\t  \t    }\r\n");
      out.write("\t        return false;\r\n");
      out.write("\t      });\r\n");
      out.write("\t      $('#reviewCon').keyup();\r\n");
      out.write("\t      \r\n");
      out.write("\t    \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"review-top\">리뷰작성하기</div>\r\n");
      out.write("\t<p class=\"title\">진료는 만족하셨나요?</p>\r\n");
      out.write("\t<div class=\"review-wrap\">\r\n");
      out.write("\t\t<!-- 댓글 작성폼 -->\r\n");
      out.write("\t\t<div class=\"review\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/board/writeReview\"\r\n");
      out.write("\t\t\t\tmethod=\"post\" name=\"writeReviewFrm\">\r\n");
      out.write("\t\t\t\t<span class=\"bg\"> <em id=\"star\" class=\"value\"></em></span>\r\n");
      out.write("\t\t\t\t<div id=\"rank-wrap\">\r\n");
      out.write("\t\t\t\t\t<a></a><a></a><a></a><a></a><a></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p class=\"point-text\"><span id=\"point\">5점</span>&nbsp;(<span id=\"text\">최고에요</span>)</p>\r\n");
      out.write("\t\t\t\t<p class=\"review-text\">어떤 점이 리뷰를 작성하게 했나요?</p>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"reviewRank\" value=\"5\" /> \r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"reviewWriter\" value=\"hong\" /> \r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"reviewLevel\" value=\"1\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"reviewRef\" value=\"0\" />\r\n");
      out.write("\t\t\t\t<textarea name=\"reviewCon\" id=\"reviewCon\" cols=\"60\" rows=\"10\" placeholder=\"10자 이상 작성해주세요!\"></textarea>\r\n");
      out.write("\t\t\t\t<span id=\"counter\">###</span>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"등록\" id=\"write-btn\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
