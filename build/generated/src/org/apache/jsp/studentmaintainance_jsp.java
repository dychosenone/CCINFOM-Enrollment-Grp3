package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentmaintainance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1>Student Maintenance</h1>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("                \n");
      out.write("                ");
      enrollment.students studentsBean = null;
      synchronized (session) {
        studentsBean = (enrollment.students) _jspx_page_context.getAttribute("studentsBean", PageContext.SESSION_SCOPE);
        if (studentsBean == null){
          studentsBean = new enrollment.students();
          _jspx_page_context.setAttribute("studentsBean", studentsBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
      enrollment.students studentsTemp = null;
      synchronized (_jspx_page_context) {
        studentsTemp = (enrollment.students) _jspx_page_context.getAttribute("studentsTemp", PageContext.PAGE_SCOPE);
        if (studentsTemp == null){
          studentsTemp = new enrollment.students();
          _jspx_page_context.setAttribute("studentsTemp", studentsTemp, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
 studentsBean.viewAllRecords(); 
      out.write("\n");
      out.write("                <br>Complete Student Records on Enrollment Database<br>\n");
      out.write("                <table style=\"width:75%\" border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Student ID</td>\n");
      out.write("                        <td>Complete Name</td>\n");
      out.write("                        <td>Degree ID</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    ");
  studentsBean.viewAllRecords();
                        for (int i=0; i<studentsBean.studlist.size(); i++) {
                           studentsTemp = studentsBean.studlist.get(i);
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(studentsTemp.studentid);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(studentsTemp.completename);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(studentsTemp.degreeid);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"addstudent.jsp\" class=\"list-group-item\">Add Student Data</a>\n");
      out.write("                <a href=\"modstudent.jsp\" class=\"list-group-item\">Modify Student Data</a>\n");
      out.write("                <a href=\"delstudent.jsp\" class=\"list-group-item\">Delete Student Data</a>\n");
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