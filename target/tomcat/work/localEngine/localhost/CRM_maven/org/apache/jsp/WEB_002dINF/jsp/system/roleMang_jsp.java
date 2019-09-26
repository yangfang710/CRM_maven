package org.apache.jsp.WEB_002dINF.jsp.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roleMang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../common/css/winTip.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../system/css/userMang.css\" />\r\n");
      out.write("\t<title>角色管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body ng-app=\"role\" ng-controller=\"roleCtrl\">\r\n");
      out.write("\t<div class=\"meun-btn\">\r\n");
      out.write("       \t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li onclick=\"wuorder.ShowDiv('add-orle','fade')\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"create\"><span class=\"glyphicon glyphicon-plus\"></span>增加</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"orange\" onclick=\"changeRole()\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"create\"><span class=\"glyphicon glyphicon-pencil\"></span>修改</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"red\" onclick=\"show()\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"create\"><span class=\"glyphicon glyphicon-minus\"></span>删除</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"purple\" style=\"background: #880374\" onclick=\"assess()\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" class=\"create\"><span class=\"glyphicon glyphicon-link\"></span>分配权限</a>\r\n");
      out.write("\t\t\t</li>\t\t\t\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"bs-example table-responsive\" data-example-id=\"simple-table\" id=\"list\"> \r\n");
      out.write("    \t<div class=\"coursePanel\">\r\n");
      out.write("\t\t  <span class=\"glyphicon glyphicon-th-list\"></span>角色管理\t  \r\n");
      out.write("\t\t</div>               \r\n");
      out.write("         <table class=\"table table-bordered table-hover table-striped\">                    \r\n");
      out.write("               <tr class=\"henglan\">\r\n");
      out.write("                   <td class=\"text-primary\" style=\"width: 40px;\"><input type=\"checkbox\" class=\"all\" /></td>\r\n");
      out.write("                   <td class=\"text-primary\" style=\"width: 60px;\">序号</td>\r\n");
      out.write("                   <td class=\"text-primary\" style=\"width: 200px;\">角色名称</td>\r\n");
      out.write("                   <td class=\"text-primary\" style=\"width: 140px;\">所属部门</td>\r\n");
      out.write("                   <td class=\"text-primary\">权限</td>                           \r\n");
      out.write("               </tr> \r\n");
      out.write("              <tr ng-repeat=\"infor in list\"  data-id=\"{{infor.roleid}}\">\r\n");
      out.write("                  <td><input type=\"checkbox\" class=\"{{infor.roleid}}\"/></td>\r\n");
      out.write("                  <td ng-bind=\"{{(currentPage-1)*pageSize+($index+1)}}\"></td>\r\n");
      out.write("                  <td ng-bind=\"infor.rolename\"></td>\r\n");
      out.write("                  <td ng-bind=\"infor.deptname\" data-id=\"{{infor.deptid}}\"></td>\r\n");
      out.write("                  <td ng-bind=\"infor.menuname\"></td>                             \r\n");
      out.write("              </tr>\r\n");
      out.write("         </table>\r\n");
      out.write("        <!-- 分页 -->\r\n");
      out.write("\t \t <nav>\r\n");
      out.write("\t      <ul class=\"pagination\">\r\n");
      out.write("\t          <li ng-class=\"{true:'disabled'}[currentPage==1]\"><a href=\"javascript:void(0);\" ng-click=\"firstPage()\">首页</a></li>\r\n");
      out.write("\t          <li ng-class=\"{true:'active'}[currentPage==page]\" ng-repeat=\"page in pages\"><a href=\"javascript:void(0);\" ng-click=\"loadPage(page)\">{{ page }}</a></li>\r\n");
      out.write("\t          <li ng-class=\"{true:'disabled'}[currentPage==pageTotal]\"><a href=\"javascript:void(0);\" ng-click=\"lastPage()\">尾页</a></li>\r\n");
      out.write("\t      </ul>\r\n");
      out.write("\t      <span style=\"vertical-align: 30px;\">&nbsp;&nbsp;共：{{count}} 条</span>\r\n");
      out.write("\t      <span style=\"vertical-align: 30px;\">&nbsp;&nbsp;共：{{pageTotal}} 页</span>\r\n");
      out.write("\t  \t</nav>        \r\n");
      out.write("    </div>\r\n");
      out.write("\t<!-- 增加 -->\r\n");
      out.write("\t<div id=\"add-orle\" class=\"ui-wrap\">\r\n");
      out.write("\t\t<div class=\"addnew-wrap\">\r\n");
      out.write("\t\t\t<h2 class=\"wrap-tit\">角色管理_增加<span class=\"close closebtn\"  onclick=\"wuorder.CloseDiv('add-orle','fade')\">×</span></h2>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form class=\"form-horizontal add_form\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">角色名称：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"rolename\" id=\"rolename\"> \r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p class=\"help-block\" id=\"rolenameError\"></p>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">所属部门：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"form-control\" name=\"deptname\" id=\"deptname\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">请选择部门</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option ng-repeat=\"option in deptname\" value=\"{{option.deptid}}\">{{option.deptname}}</option>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p class=\"help-block\" id=\"deptnameError\"></p>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-offset-4 col-md-6\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"addRole()\" value=\"保 存\" class=\"btn\"/>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\"  class=\"btn\"  onclick=\"wuorder.CloseDiv('add-orle','fade')\" style=\"background: #4c7cba;\">取消</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 修改 -->\r\n");
      out.write("\t<div id=\"change-role\"  class=\"ui-wrap\">\r\n");
      out.write("\t\t<div class=\"addnew-wrap\">\r\n");
      out.write("\t\t\t<h2 class=\"wrap-tit\">角色管理_修改<span class=\"close closebtn\"  onclick=\"wuorder.CloseDiv('change-role','fade')\">×</span></h2>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form class=\"form-horizontal add_form\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">角色名称：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"rolename\" id=\"ch-rolename\"> \r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-md-3 control-label\">所属部门：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"form-control\" name=\"deptname\" id=\"ch-deptname\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">请选择部门</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option ng-repeat=\"option in deptname\" value=\"{{option.deptid}}\">{{option.deptname}}</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-offset-4 col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\" class=\"btn\" onclick=\"edit()\">保 存</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\"  class=\"btn\"  onclick=\"wuorder.CloseDiv('change-role','fade')\" style=\"background: #4c7cba;\">取消</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<!-- 分配权限-->\r\n");
      out.write("\t<div id=\"change-access\"  class=\"ui-wrap\">\r\n");
      out.write("\t\t<div class=\"addnew-wrap\">\r\n");
      out.write("\t\t\t<h2 class=\"wrap-tit\">角色管理_分配权限<span class=\"close closebtn\" onclick=\"wuorder.CloseDiv('change-access','fade')\">×</span></h2>\r\n");
      out.write("\t\t\t<form class=\"form-horizontal add_form\">\r\n");
      out.write("\t\t\t\t<div class=\"assessCon\">\r\n");
      out.write("\t\t\t\t\t<!-- <div class=\"assesstree\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"assessTit\"  ng-click=\"show=!show\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-down arrow\" aria-hidden=\"true\" ng-show=\"show\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-right arrow\" aria-hidden=\"true\" ng-show=\"!show\"></span>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"assessList\" ng-show=\"show\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div> -->\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-offset-4 col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\" class=\"btn\" onclick=\"saveAssess()\">保 存</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\"  class=\"btn\"  onclick=\"wuorder.CloseDiv('change-access','fade')\" style=\"background: #4c7cba;\">取消</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<!-- 提示 -->\r\n");
      out.write("    <div class=\"themisWrap\" style=\"display:none;\" >\r\n");
      out.write("      <div class=\"themisGray\"></div>\r\n");
      out.write("        <div class=\"themis\" style=\"top:30%;\">\r\n");
      out.write("           <h3 class=\"themistit\"><span class=\"themisTipPic\" style=\"float: left;padding-top: 17px;padding-left: 10px;margin-right: 10px;\"><img class=\"pic\" src=\"../system/img/tishi.png\" height=\"25\" width=\"25\" alt=\"\" /></span>友情提示</h3>\r\n");
      out.write("           <div class=\"themispay\">\r\n");
      out.write("                <div class=\"themistip\" style=\"margin-bottom: 20px; color:red; font-size:14px;\">确定删除这些信息吗!</div>\r\n");
      out.write("                <button class=\"btn navbar-right\" id=\"quxiao\" >取消</button>\r\n");
      out.write("                <button class=\"btn navbar-right\" id=\"queding\" style=\"background: #4c7cba;\" onclick=\"del()\">确定</button>                    \r\n");
      out.write("                                    \r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/angular.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/winTip.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../common/js/boot.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../system/js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../system/js/roleMang.js\"></script>\r\n");
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
