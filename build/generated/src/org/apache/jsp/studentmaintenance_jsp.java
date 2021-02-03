package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentmaintenance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Maintenance - CCINFOM</title>\n");
      out.write("        <style>\n");
      out.write("            body {   \n");
      out.write("                font-family: \"Helvetica Neue\",Helvetica,Arial,sans-serif;\n");
      out.write("                font-size: 14px;\n");
      out.write("                line-height: 1.42857143;\n");
      out.write("                color: #333;\n");
      out.write("                background-color: #fff;\n");
      out.write("            } \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1>Student Maintenance</h1>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("                \n");
      out.write("                <a href=\"addstudent.jsp\" class=\"list-group-item\" style=\"margin:5px;\">Add Student Data</a>\n");
      out.write("                <a href=\"modstudent.jsp\" class=\"list-group-item\" style=\"margin:75px;\">Modify Student Data</a>\n");
      out.write("                <a href=\"delstudent.jsp\" class=\"list-group-item\" style=\"margin:10px;\">Delete Student Data</a>\n");
      out.write("                <a href=\"loadstudent.jsp\" class=\"list-group-item\" style=\"margin:75px;\">Load Student Records</a>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"recordmanagement.jsp\" class=\"list-group-item\" style=\"margin:5px;\">Return to Record Management</a><br>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
