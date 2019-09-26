package org.apache.jsp.WEB_002dINF.jsp.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write(" \r\n");
      out.write("\r\n");

	pageContext.setAttribute("PATH", request.getContextPath());
			

      out.write('\r');
      out.write('\n');
  
		String loginName = session.getAttribute("loginName").toString();
		String ischange = session.getAttribute("ischange").toString();
 
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/css/bootstrap.min.css\" />\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/css/common.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/css/winTip.css\" />\r\n");
      out.write("\t<title>首页</title>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"left\">\r\n");
      out.write("\t \t<div class=\"logo\">\r\n");
      out.write("\t        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/system/img/headelogo.jpg\"/>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  <div class=\"scroll\">\r\n");
      out.write("\t\t    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t                    \r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- 登录 -->\r\n");
      out.write("\t<div class=\"login\">\r\n");
      out.write("\t    <div class=\"login_con\">\r\n");
      out.write("\t    \t<ul class=\"heademenu\">\r\n");
      out.write("\t    \t\t<li>\r\n");
      out.write("\t    \t\t\t<span class=\"glyphicon glyphicon-user name\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t    \t\t\t<span class=\"name username\" id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.login_user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">欢迎您：<b>");
      out.print(loginName);
      out.write("</b><b id=\"ischange\" style=\"display:none\">");
      out.print(ischange);
      out.write("</b></span>\r\n");
      out.write("\t    \t\t</li>\r\n");
      out.write("\t    \t\t<li>\r\n");
      out.write("\t    \t\t\t<span class=\"glyphicon glyphicon-paperclip name\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t    \t\t\t<span class=\"name\"><b class=\"space\">今日备忘录：</b><b id=\"target\" class=\"space\"></b></span>\t    \t\t\t\r\n");
      out.write("\t            \t<span class=\"targetbtn\" id=\"addTarget\" onclick=\"addToday()\">添加</span>\r\n");
      out.write("\t            \t<span class=\"targetbtn\" id=\"chTarget\" onclick=\"chToday()\" >修改</span>\r\n");
      out.write("\t    \t\t</li>\t    \t\t\r\n");
      out.write("\t    \t</ul>\r\n");
      out.write("\t    \t<!-- 消息滚动 -->\r\n");
      out.write("\t    \t<div class=\"gonggao\">\t    \t\t\r\n");
      out.write("\t    \t\t<div class=\"container\">\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t  <div class=\"marquee\">\r\n");
      out.write("\t\t\t\t\t\t <ul class=\"marquee-content-items\">\r\n");
      out.write("\t\t\t\t\t\t    <li><marquee id=\"tishi\"></marquee></li>\t\t\t\t\t\t   \t\t\t     \r\n");
      out.write("\t\t\t\t\t\t </ul>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t    \t</div>\r\n");
      out.write("\t        <p class=\"navbar-text login_btn\">\t        \t\r\n");
      out.write("\t            <a href=\"javascript:;\" class=\"btn btn-primary\" style=\"background-color: #337ab7;\" onclick=\"wuorder.ShowDiv('uotTip','fade')\">退出</a>                     \r\n");
      out.write("\t            <a href=\"javascript:;\" class=\"btn btn-danger\" onclick=\"wuorder.ShowDiv('updpwd','fade')\">修改密码</a>\r\n");
      out.write("\t        </p>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<section class=\"right\">            \r\n");
      out.write("\t    <div class=\"con\">\r\n");
      out.write("\t        <div class=\"basemian\">        \t\t\r\n");
      out.write("\t        \t<iframe name=\"iframe\" id=\"iframepage\" frameBorder=0 scrolling=no width=\"100%\" height=\"1000\" allowTransparency=\"true\"></iframe>\r\n");
      out.write("\t\t\t</div>        \r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</section> \r\n");
      out.write("\t \r\n");
      out.write("\t<!-- 修改密码 -->\r\n");
      out.write("\t<div id=\"updpwd\">\r\n");
      out.write("\t\t<div class=\"updpwd\">\r\n");
      out.write("\t\t\t<span class=\"close closebtn\" onclick=\"wuorder.CloseDiv('updpwd','fade')\">×</span>\t\t\t\r\n");
      out.write("\t\t\t<form role=\"form\" class=\"ui_form\">\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"exampleInputPassword1\">旧密码</label>\r\n");
      out.write("\t\t\t    <input type=\"password\" class=\"form-control\"  id=\"oldPassword\" name=\"oldPassword\" placeholder=\"请输入旧密码\">\r\n");
      out.write("\t\t\t    <p class=\"error oldPasswordError\" ></p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"exampleInputEmail1\">新密码</label>\r\n");
      out.write("\t\t\t    <input type=\"password\" class=\"form-control\"  id=\"newPassword\" name=\"newPassword\" placeholder=\"请输入新密码\">\r\n");
      out.write("\t\t\t    <p class=\"error newPasswordError\"></p>\r\n");
      out.write("\t\t\t  </div>\t\t\t  \r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"exampleInputPassword1\">确认密码</label>\r\n");
      out.write("\t\t\t    <input type=\"password\" class=\"form-control\"  id=\"repeatPassword\" name=\"repeatPassword\" placeholder=\"确认密码\">\r\n");
      out.write("\t\t\t    <p class=\"error repeatPasswordError\"></p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <a href=\"javascript:;\"  class=\"btn\"  onclick=\"savepwd()\">保存</a>\t\t\t  \r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 提示 -->\r\n");
      out.write("    <div class=\"themisWrap\" style=\"display:none;\" id=\"uotTip\">\r\n");
      out.write("      <div class=\"themisGray\"></div>\r\n");
      out.write("        <div class=\"themis\" style=\"top:30%;\">\r\n");
      out.write("           <h3 class=\"themistit\"><span class=\"themisTipPic\" style=\"float: left;padding-top: 17px;padding-left: 10px;margin-right: 10px;\"><img class=\"pic\" src=\"./system/img/tishi.png\" height=\"25\" width=\"25\" alt=\"\" /></span>友情提示</h3>\r\n");
      out.write("           <div class=\"themispay\">\r\n");
      out.write("                <div class=\"themistip\" style=\"margin-bottom: 20px; color:red; font-size:14px;\">确定要退出吗!</div>\r\n");
      out.write("                <button onclick=\"wuorder.CloseDiv('uotTip','fade')\" class=\"btn btn-default navbar-right\"  style=\"margin-left:10px; margin-right: 0px;\">取消</button>\r\n");
      out.write("                <a href=\"./logout.do\" class=\"btn btn-primary navbar-right\">确定</a> \r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- 今日目标 -->\r\n");
      out.write("    <div class=\"themisWrap\" style=\"display:none;\" id=\"todayNote\">\r\n");
      out.write("      <div class=\"themisGray\"></div>\r\n");
      out.write("        <div class=\"themis\" style=\"top:30%;\">\r\n");
      out.write("           <h3 class=\"themistit\"><span class=\"themisTipPic\" style=\"float: left;padding-top: 17px;padding-left: 10px;margin-right: 10px;\"><img class=\"pic\" src=\"./system/img/tishi.png\" height=\"25\" width=\"25\" alt=\"\" /></span><b id=\"todayTip\">友情提示</b></h3>\r\n");
      out.write("           <div class=\"themispay\">\r\n");
      out.write("                <div class=\"themistip\" style=\"margin-bottom: 20px; color:red; font-size:14px;\">\r\n");
      out.write("                \t<input type=\"text\" class=\"form-control\" id=\"todayVal\"> \r\n");
      out.write("                \t<p class=\"help-block\" id=\"todayValError\"></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-offset-4 col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\" class=\"btn\" onclick=\"saveAdd()\">保 存</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\"  class=\"btn\"  style=\"background: #4c7cba;\" onclick=\"wuorder.CloseDiv('todayNote','fade')\">取消</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("       <!-- 消息弹窗 -->        \r\n");
      out.write("       <div id=\"message\">\r\n");
      out.write("       \t\t<span class=\"closemess\" onclick=\"wuorder.CloseDiv('message','fade')\">×</span>\r\n");
      out.write("       \t\t<h2 class=\"mess_tip\">消息提醒</h2>\r\n");
      out.write("          \t<p id=\"messcontent\">XX时间，有新的“XX”渠道资源xx条，请回访！</p>\r\n");
      out.write("       </div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/js/reconnecting-websocket.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/js/boot.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/js/echarts.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/system/js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/system/js/index.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/system/index.jsp(35,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/system/index.jsp(35,6) '${menus}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${menus}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/system/index.jsp(35,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t    <div class=\"nav_meun\">\r\n");
          out.write("\t\t\t        <p class=\"biaoti\">\r\n");
          out.write("\t\t\t        \t<span class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.menuimgurl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" aria-hidden=\"true\" style=\"margin-right: 8px;\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/system/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.menuimgurl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"width:16px;height:16px;\"/></span>\r\n");
          out.write("\t\t\t        \t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.menuname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t        \t<span class=\"glyphicon glyphicon-menu-down silde arrow\" aria-hidden=\"true\"></span>\r\n");
          out.write("\t\t\t        \t<span class=\"home glyphicon glyphicon-user\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.menuname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></span>\r\n");
          out.write("\t\t\t        </p>\r\n");
          out.write("\t\t\t        <ul class=\"bianji\">\r\n");
          out.write("\t\t\t        \t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\t\t          \t         \r\n");
          out.write("\t\t\t        </ul>\t\t       \r\n");
          out.write("\t\t\t    </div>\r\n");
          out.write("\t\t    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/system/index.jsp(44,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/system/index.jsp(44,12) '${item.children}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${item.children}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/system/index.jsp(44,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("list");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t          \t\t<li><a href=\"./");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.menuurl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" target=\"iframe\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.menuname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("\t\t\t          \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
