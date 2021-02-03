package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class coursemaintenance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Course Maintenance - CCINFOM</title>\n");
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
      out.write("                <h1>Course Maintenance</h1>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("                \n");
      out.write("                ");
      enrollment.courses coursesBean = null;
      synchronized (session) {
        coursesBean = (enrollment.courses) _jspx_page_context.getAttribute("coursesBean", PageContext.SESSION_SCOPE);
        if (coursesBean == null){
          coursesBean = new enrollment.courses();
          _jspx_page_context.setAttribute("coursesBean", coursesBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
      enrollment.courses coursesTemp = null;
      synchronized (_jspx_page_context) {
        coursesTemp = (enrollment.courses) _jspx_page_context.getAttribute("coursesTemp", PageContext.PAGE_SCOPE);
        if (coursesTemp == null){
          coursesTemp = new enrollment.courses();
          _jspx_page_context.setAttribute("coursesTemp", coursesTemp, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
 coursesBean.viewAllRecords(); 
      out.write("\n");
      out.write("                Complete Course Records on Enrollment Database<br><br>\n");
      out.write("                <table style=\"width:75%\" border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Course ID</td>\n");
      out.write("                        <td>Course Name</td>\n");
      out.write("                        <td>Department ID</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    ");
  coursesBean.viewAllRecords();
                        for (int i=0; i<coursesBean.courselist.size(); i++) {
                           coursesTemp = coursesBean.courselist.get(i);
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(coursesTemp.courseid);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(coursesTemp.coursename);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(coursesTemp.department);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"cm_addcourse.jsp\" class=\"list-group-item\" style=\"margin:5px;\">Add Course Data</a>\n");
      out.write("                <a href=\"cm_modcourse.jsp\" class=\"list-group-item\" style=\"margin:75px;\">Modify Course Data</a>\n");
      out.write("                <a href=\"cm_delcourse.jsp\" class=\"list-group-item\" style=\"margin:75px;\">Delete Course Data</a>\n");
      out.write("                <a href=\"recordmanagement.jsp\" class=\"list-group-item\" style=\"margin:25px;\">Return to Record Management</a><br>\n");
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
