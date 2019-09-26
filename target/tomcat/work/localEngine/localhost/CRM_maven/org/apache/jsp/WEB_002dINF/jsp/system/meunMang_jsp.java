package org.apache.jsp.WEB_002dINF.jsp.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class meunMang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("\t<meta name=\"msapplication-tap-highlight\" content=\"no\" />\r\n");
      out.write("\t<meta name=\"robots\" content=\"noindex\" />\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge,chrome=1\" />\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../common/css/bootstrap.min.css\" />\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../common/css/common.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../common/css/winTip.css\" />\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../system/css/userMang.css\" />\r\n");
      out.write("\t<title>菜单管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body ng-app=\"menu\" ng-controller=\"menuCtrl\">\r\n");
      out.write("\t<div class=\"meun-btn\">\r\n");
      out.write("       \t<ul class=\"nav navbar-nav option\">\r\n");
      out.write("\t\t\t<li onclick=\"wuorder.ShowDiv('addmeun','fade')\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"create\"><span class=\"glyphicon glyphicon-plus\"></span>增加</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"orange\" onclick=\"changeMenu()\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"create\"><span class=\"glyphicon glyphicon-pencil\"></span>修改</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"red\" onclick=\"showTip()\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" class=\"create\"><span class=\"glyphicon glyphicon-minus\"></span>删除</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"menuCon\"> \r\n");
      out.write("    \t<div class=\"coursePanel\">\r\n");
      out.write("\t\t  <span class=\"glyphicon glyphicon-th-list\"></span>菜单管理\t  \r\n");
      out.write("\t\t</div>  \r\n");
      out.write("    \t<div ng-repeat=\"infors in list\" class=\"menutree\">\t\r\n");
      out.write("    \t\t<span class=\"glyphicon glyphicon-chevron-down sildup arrow\" aria-hidden=\"true\"  ng-click=\"Financial_show=!Financial_show\"></span>                      \t\t\r\n");
      out.write("    \t\t<p class=\"menuTit\"  data-id=\"{{infors.menuid}}\" ng-class=\"{menuactive : active}\" ng-click=\"active = !active\">           \t\t\t\r\n");
      out.write("    \t\t\t<b ng-bind=\"infors.menuname\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infors.menuno\"  style=\"display:none\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infors.menuname\"  style=\"display:none\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infors.menucode\"  style=\"display:none\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infors.menuurl\"  style=\"display:none\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infors.menuimgurl\"  style=\"display:none\"></b>\r\n");
      out.write("    \t\t</p>\r\n");
      out.write("            <p class=\"menuList\" ng-show=\"!Financial_show\" ng-class=\"{menuactive : color.active}\" ng-click=\"color.active = !color.active\" ng-repeat=\"infor in infors.children\" data-id=\"{{infor.menuid}}\">\r\n");
      out.write("            \t<span class=\"glyphicon glyphicon-bookmark flag\"></span>\r\n");
      out.write("            \t<b ng-bind=\"infor.menuParaname\" style=\"display:none\"></b>\t                    \t                    \t\r\n");
      out.write("     \t\t<b ng-bind=\"infor.menuno\"  style=\"display:none\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infor.menuname\"></b>\t\t\t            \t\t\r\n");
      out.write("     \t\t<b ng-bind=\"infor.menucode\"  style=\"display:none\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infor.menuurl\"  style=\"display:none\"></b>\r\n");
      out.write("     \t\t<b ng-bind=\"infor.menuimgurl\"  style=\"display:none\"></b>  \t                    \t\r\n");
      out.write("            </p> \r\n");
      out.write("    \t</div>            \r\n");
      out.write("    </div> \r\n");
      out.write("\t<!-- 菜单管理_增加 -->\r\n");
      out.write("\t<div id=\"addmeun\" class=\"ui-wrap\">\r\n");
      out.write("\t\t<div class=\"addnew-wrap\">\r\n");
      out.write("\t\t\t<h2 class=\"wrap-tit\">菜单管理_增加<span class=\"close closebtn\"  onclick=\"wuorder.CloseDiv('addmeun','fade')\">×</span></h2>\t\t\t\r\n");
      out.write("\t\t\t<form class=\"form-horizontal add_form\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">上级菜单：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<select class=\"form-control\" name=\"menuParaname\" id=\"menuParaname\" >\r\n");
      out.write("\t\t\t\t\t\t\t<option  value=\"\">请选择菜单</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option  ng-repeat=\"option in list\" value=\"{{option.menuid}}\">{{option.menuname}}</option>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单序号：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menuno\" id=\"menuno\"> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单名称：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menuname\" id=\"menuname\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"help-block\" id=\"menunameError\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p class=\"help-block\" id=\"menunameError\"></p>\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单编码：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menucode\" id=\"menucode\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单URL：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menuurl\" id=\"menuurl\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单图片：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menuimgurl\" id=\"menuimgurl\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p class=\"help-block\" ng-model=\"errorName\"></p>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-offset-4 col-md-6\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"addMenu()\" value=\"保 存\" class=\"btn\"/>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\"  class=\"btn\"  onclick=\"wuorder.CloseDiv('addmeun','fade')\" style=\"background: #4c7cba;\">取消</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 菜单理_修改-->\r\n");
      out.write("\t<div id=\"meunchange\"  class=\"ui-wrap\">\r\n");
      out.write("\t\t<div class=\"addnew-wrap\">\r\n");
      out.write("\t\t\t<h2 class=\"wrap-tit\">菜单理_修改<span class=\"close closebtn\"  onclick=\"wuorder.CloseDiv('meunchange','fade')\">×</span></h2>\r\n");
      out.write("\t\t\t<form class=\"form-horizontal add_form\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">上级菜单：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<select class=\"form-control\" name=\"menuParaname\" id=\"ch-upmenu\">\r\n");
      out.write("\t\t\t\t\t\t\t<option  value=\"\">请选择菜单</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option  ng-repeat=\"option in list\" value=\"{{option.menuid}}\">{{option.menuname}}</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单序号：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menuno\" id=\"ch-menuno\"> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单名称：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"ch-menuname\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单编码：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menucode\" id=\"ch-menucode\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单URL：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menuurl\" id=\"ch-menuurl\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">菜单图片：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"menuimgurl\" id=\"ch-menuimgurl\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-offset-4 col-md-6\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"meunsave()\" value=\"保 存\" class=\"btn\"/>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\"  class=\"btn\"  onclick=\"wuorder.CloseDiv('meunchange','fade')\" style=\"background: #4c7cba;\">取消</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 提示 -->\r\n");
      out.write("    <div class=\"themisWrap\" style=\"display:none;\" >\r\n");
      out.write("      <div class=\"themisGray\"></div>\r\n");
      out.write("        <div class=\"themis\" style=\"top:30%;\">\r\n");
      out.write("           <h3 class=\"themistit\"><span class=\"themisTipPic\" style=\"float: left;padding-top: 17px;padding-left: 10px;margin-right: 10px;\"><img class=\"pic\" src=\"../system/img/tishi.png\" height=\"25\" width=\"25\" alt=\"\" /></span>友情提示</h3>\r\n");
      out.write("           <div class=\"themispay\">\r\n");
      out.write("                <div class=\"themistip\" style=\"margin-bottom: 20px; color:red; font-size:14px;\">确定删除这些信息吗!</div>\r\n");
      out.write("                <button class=\"btn navbar-right\" id=\"quxiao\" >取消</button>\r\n");
      out.write("                <button class=\"btn navbar-right\" id=\"queding\" style=\"background: #4c7cba;\" onclick=\"del()\">确定</button> \r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/angular.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/winTip.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/boot.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../system/js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../system/js/menuMang.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
