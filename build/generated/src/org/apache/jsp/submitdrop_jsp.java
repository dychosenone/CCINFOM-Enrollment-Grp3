package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class submitdrop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Confirm Drop - CCINFOM</title>\n");
      out.write("        <style>\n");
      out.write("            .page-header {\n");
      out.write("            padding-bottom: 9px;\n");
      out.write("            margin: 40px 0 20px;\n");
      out.write("            border-bottom: 1px solid #eee;\n");
      out.write("            }\n");
      out.write("              \n");
      out.write("            .h1, h1 {\n");
      out.write("            font-size: 36px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .h1, .h2, .h3, h1, h2, h3 {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .h1, .h2, .h3, .h4, .h5, .h6, h1, h2, h3, h4, h5, h6 {\n");
      out.write("            font-family: inherit;\n");
      out.write("            font-weight: 500;\n");
      out.write("            line-height: 1.1;\n");
      out.write("            color: inherit;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("            padding-right: 15px;\n");
      out.write("            padding-left: 15px;\n");
      out.write("            margin-right: auto;\n");
      out.write("            margin-left: auto;\n");
      out.write("            width: 970px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           .list-group-item:first-child {\n");
      out.write("            border-radius: 4px;\n");
      out.write("            margin-bottom: 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            a.list-group-item:focus, a.list-group-item:hover, button.list-group-item:focus, button.list-group-item:hover {\n");
      out.write("            color: #555;\n");
      out.write("            text-decoration: none;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a.list-group-item, button.list-group-item {\n");
      out.write("            color: #555;\n");
      out.write("            text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .list-group-item {\n");
      out.write("            position: relative;\n");
      out.write("            display: block;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            margin-bottom: -1px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body {   \n");
      out.write("            font-family: \"Helvetica Neue\",Helvetica,Arial,sans-serif;\n");
      out.write("            font-size: 14px;\n");
      out.write("            line-height: 1.42857143;\n");
      out.write("            color: #333;\n");
      out.write("            background-color: #fff;\n");
      out.write("            } \n");
      out.write("            \n");
      out.write("            * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1>Drop Confirmation</h1>\n");
      out.write("            </div> \n");
      out.write("        \n");
      out.write("            ");
      enrollment.drop subBean = null;
      synchronized (session) {
        subBean = (enrollment.drop) _jspx_page_context.getAttribute("subBean", PageContext.SESSION_SCOPE);
        if (subBean == null){
          subBean = new enrollment.drop();
          _jspx_page_context.setAttribute("subBean", subBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("            ");
 
                int cterm = (int) request.getSession().getAttribute("term");
                int schoolyear = (int) request.getSession().getAttribute("year");
                String courseid = request.getParameter("courseid");

                int result = subBean.confirmDrop();
                int cResult = subBean.delDrop(courseid, cterm, schoolyear);

                if(result == 1 && cResult == 1) { 
                    session.invalidate();
                
      out.write(" \n");
      out.write("                <p>Successfully Dropped Enrollments. </p>\n");
      out.write("            ");
}
      out.write("  \n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("                <a href=\"index.html\" class=\"list-group-item\">Return to Main Menu</a><br>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
