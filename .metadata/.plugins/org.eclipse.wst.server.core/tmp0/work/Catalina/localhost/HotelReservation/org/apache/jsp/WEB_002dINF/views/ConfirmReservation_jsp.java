/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-12-16 09:56:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConfirmReservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsp_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005fsp_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsp_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_sp_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_sp_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sp:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_sp_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsp_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_sp_005fform_005f0_reused = false;
    try {
      _jspx_th_sp_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sp_005fform_005f0.setParent(null);
      // /WEB-INF/views/ConfirmReservation.jsp(13,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fform_005f0.setAction("CheckReservation");
      // /WEB-INF/views/ConfirmReservation.jsp(13,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fform_005f0.setMethod("post");
      // /WEB-INF/views/ConfirmReservation.jsp(13,1) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fform_005f0.setModelAttribute("hotel");
      int[] _jspx_push_body_count_sp_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sp_005fform_005f0 = _jspx_th_sp_005fform_005f0.doStartTag();
        if (_jspx_eval_sp_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t<table>\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<th>Room Type:</th>\r\n");
            out.write("\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.room_type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<th>Price:</th>\r\n");
            out.write("\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<th>GST:</th>\r\n");
            out.write("\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.GST}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<th>Total:</th>\r\n");
            out.write("\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.price+hotel.GST}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t</table>\r\n");
            out.write("\t\t");
            if (_jspx_meth_sp_005fhidden_005f0(_jspx_th_sp_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sp_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_sp_005fhidden_005f1(_jspx_th_sp_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sp_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_sp_005fhidden_005f2(_jspx_th_sp_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sp_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_sp_005fhidden_005f3(_jspx_th_sp_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sp_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_sp_005fhidden_005f4(_jspx_th_sp_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sp_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_sp_005fhidden_005f5(_jspx_th_sp_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sp_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t<input type=\"submit\" value=\"Confirm\" />\r\n");
            out.write("\t\t<input type=\"button\" value=\"Back\"\r\n");
            out.write("\t\t\tonclick=\"window.location.href = 'http://localhost:2/HotelReservation/PreInsertHotel'\" />\r\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_sp_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sp_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sp_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sp_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sp_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsp_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_sp_005fform_005f0);
      _jspx_th_sp_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sp_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_sp_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sp_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sp_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sp_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sp:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_sp_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_sp_005fhidden_005f0_reused = false;
    try {
      _jspx_th_sp_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sp_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sp_005fform_005f0);
      // /WEB-INF/views/ConfirmReservation.jsp(37,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fhidden_005f0.setPath("city");
      // /WEB-INF/views/ConfirmReservation.jsp(37,2) null
      _jspx_th_sp_005fhidden_005f0.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.city }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_sp_005fhidden_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sp_005fhidden_005f0 = _jspx_th_sp_005fhidden_005f0.doStartTag();
        if (_jspx_th_sp_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sp_005fhidden_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sp_005fhidden_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sp_005fhidden_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_sp_005fhidden_005f0);
      _jspx_th_sp_005fhidden_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sp_005fhidden_005f0, _jsp_getInstanceManager(), _jspx_th_sp_005fhidden_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sp_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sp_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sp_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sp:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_sp_005fhidden_005f1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_sp_005fhidden_005f1_reused = false;
    try {
      _jspx_th_sp_005fhidden_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sp_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sp_005fform_005f0);
      // /WEB-INF/views/ConfirmReservation.jsp(38,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fhidden_005f1.setPath("hName");
      // /WEB-INF/views/ConfirmReservation.jsp(38,2) null
      _jspx_th_sp_005fhidden_005f1.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.hName }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_sp_005fhidden_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_sp_005fhidden_005f1 = _jspx_th_sp_005fhidden_005f1.doStartTag();
        if (_jspx_th_sp_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sp_005fhidden_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sp_005fhidden_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sp_005fhidden_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_sp_005fhidden_005f1);
      _jspx_th_sp_005fhidden_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sp_005fhidden_005f1, _jsp_getInstanceManager(), _jspx_th_sp_005fhidden_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sp_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sp_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sp_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sp:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_sp_005fhidden_005f2 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_sp_005fhidden_005f2_reused = false;
    try {
      _jspx_th_sp_005fhidden_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sp_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sp_005fform_005f0);
      // /WEB-INF/views/ConfirmReservation.jsp(39,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fhidden_005f2.setPath("price");
      // /WEB-INF/views/ConfirmReservation.jsp(39,2) null
      _jspx_th_sp_005fhidden_005f2.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.price }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_sp_005fhidden_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_sp_005fhidden_005f2 = _jspx_th_sp_005fhidden_005f2.doStartTag();
        if (_jspx_th_sp_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sp_005fhidden_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sp_005fhidden_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sp_005fhidden_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_sp_005fhidden_005f2);
      _jspx_th_sp_005fhidden_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sp_005fhidden_005f2, _jsp_getInstanceManager(), _jspx_th_sp_005fhidden_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sp_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sp_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sp_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sp:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_sp_005fhidden_005f3 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_sp_005fhidden_005f3_reused = false;
    try {
      _jspx_th_sp_005fhidden_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sp_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sp_005fform_005f0);
      // /WEB-INF/views/ConfirmReservation.jsp(40,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fhidden_005f3.setPath("GST");
      // /WEB-INF/views/ConfirmReservation.jsp(40,2) null
      _jspx_th_sp_005fhidden_005f3.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.GST }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_sp_005fhidden_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_sp_005fhidden_005f3 = _jspx_th_sp_005fhidden_005f3.doStartTag();
        if (_jspx_th_sp_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sp_005fhidden_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sp_005fhidden_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sp_005fhidden_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_sp_005fhidden_005f3);
      _jspx_th_sp_005fhidden_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sp_005fhidden_005f3, _jsp_getInstanceManager(), _jspx_th_sp_005fhidden_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sp_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sp_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sp_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sp:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_sp_005fhidden_005f4 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_sp_005fhidden_005f4_reused = false;
    try {
      _jspx_th_sp_005fhidden_005f4.setPageContext(_jspx_page_context);
      _jspx_th_sp_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sp_005fform_005f0);
      // /WEB-INF/views/ConfirmReservation.jsp(41,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fhidden_005f4.setPath("room_type");
      // /WEB-INF/views/ConfirmReservation.jsp(41,2) null
      _jspx_th_sp_005fhidden_005f4.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.room_type }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_sp_005fhidden_005f4 = new int[] { 0 };
      try {
        int _jspx_eval_sp_005fhidden_005f4 = _jspx_th_sp_005fhidden_005f4.doStartTag();
        if (_jspx_th_sp_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sp_005fhidden_005f4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sp_005fhidden_005f4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sp_005fhidden_005f4.doFinally();
      }
      _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_sp_005fhidden_005f4);
      _jspx_th_sp_005fhidden_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sp_005fhidden_005f4, _jsp_getInstanceManager(), _jspx_th_sp_005fhidden_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sp_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_sp_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sp_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sp:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_sp_005fhidden_005f5 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_sp_005fhidden_005f5_reused = false;
    try {
      _jspx_th_sp_005fhidden_005f5.setPageContext(_jspx_page_context);
      _jspx_th_sp_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sp_005fform_005f0);
      // /WEB-INF/views/ConfirmReservation.jsp(42,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sp_005fhidden_005f5.setPath("stay_date");
      // /WEB-INF/views/ConfirmReservation.jsp(42,2) null
      _jspx_th_sp_005fhidden_005f5.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.stay_date }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_sp_005fhidden_005f5 = new int[] { 0 };
      try {
        int _jspx_eval_sp_005fhidden_005f5 = _jspx_th_sp_005fhidden_005f5.doStartTag();
        if (_jspx_th_sp_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sp_005fhidden_005f5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sp_005fhidden_005f5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sp_005fhidden_005f5.doFinally();
      }
      _005fjspx_005ftagPool_005fsp_005fhidden_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_sp_005fhidden_005f5);
      _jspx_th_sp_005fhidden_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sp_005fhidden_005f5, _jsp_getInstanceManager(), _jspx_th_sp_005fhidden_005f5_reused);
    }
    return false;
  }
}
