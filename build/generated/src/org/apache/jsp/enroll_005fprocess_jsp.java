package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enroll_005fprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Enrollment Pages</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      enrollment.students studentBean = null;
      synchronized (session) {
        studentBean = (enrollment.students) _jspx_page_context.getAttribute("studentBean", PageContext.SESSION_SCOPE);
        if (studentBean == null){
          studentBean = new enrollment.students();
          _jspx_page_context.setAttribute("studentBean", studentBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
  
            int currentTerm;
            int schoolYear;
            long studentid;
            if(request.getSession().getAttribute("studentid") == null){
                studentBean.studentid = Long.parseLong(request.getParameter("studentid"));
                studentBean.viewRecord();
                currentTerm = Integer.parseInt(request.getParameter("currentTerm"));
                schoolYear = Integer.parseInt(request.getParameter("schoolYear"));
                studentid = Long.parseLong(request.getParameter("studentid"));
                session.setAttribute("term", currentTerm);
                session.setAttribute("year", schoolYear);
                session.setAttribute("studentid", studentid);
            } else {
                studentBean.studentid = (long) request.getSession().getAttribute("studentid");
                studentid = (long) request.getSession().getAttribute("studentid");
                currentTerm = (int) request.getSession().getAttribute("term");
                schoolYear = (int) request.getSession().getAttribute("year");
            }
        
      out.write("\n");
      out.write("        <h1>Enrollment Page</h1>\n");
      out.write("        <p>Student ID: ");
      out.print(studentBean.studentid);
      out.write("</p>\n");
      out.write("        <p>Full Name: ");
      out.print(studentBean.completename);
      out.write("</p>\n");
      out.write("        <p>Degree Code: ");
      out.print(studentBean.degreeid);
      out.write(" </p>\n");
      out.write("        <p>Current Term: ");
      out.print(currentTerm);
      out.write("\n");
      out.write("        <p>School Year: ");
      out.print(schoolYear);
      out.write(" </p>\n");
      out.write("        \n");
      out.write("        <h3>Available Courses for Enrollment </h3>\n");
      out.write("        ");
      enrollment.enroll coursesBean = null;
      synchronized (session) {
        coursesBean = (enrollment.enroll) _jspx_page_context.getAttribute("coursesBean", PageContext.SESSION_SCOPE);
        if (coursesBean == null){
          coursesBean = new enrollment.enroll();
          _jspx_page_context.setAttribute("coursesBean", coursesBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
 coursesBean.Student.studentid = studentBean.studentid; 
      out.write("\n");
      out.write("        ");
 coursesBean.Student.degreeid = studentBean.degreeid; 
      out.write("\n");
      out.write("        ");
 coursesBean.loadCourses(); 
      out.write("\n");
      out.write("        <table>\n");
      out.write("             <tr>\n");
      out.write("                 <th>Course ID</th>\n");
      out.write("                 <th>Course Degree</th>\n");
      out.write("             </tr>\n");
      out.write("         ");
  for(int i = 0; i < coursesBean.CourseList.size(); i++) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(coursesBean.CourseList.get(i).courseid);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(coursesBean.CourseList.get(i).degree);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("          ");
 } 
      out.write("\n");
      out.write("         </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <p> Enroll Course: </p>\n");
      out.write("        <form name=\"search\" action=\"addCourse.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"text\" name=\"courseid\" id=\"courseid\">\n");
      out.write("            \n");
      out.write("            <br />\n");
      out.write("            <br /> \n");
      out.write("            <input type=\"submit\" value=\"Add to Cart\" name=\"addToCart\">\n");
      out.write("        </form>\n");
      out.write("        <h3>My Cart</h3>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                 <th>Student ID</th>\n");
      out.write("                 <th>Course ID</th>\n");
      out.write("                 <th>Term</th>\n");
      out.write("                 <th>School Year</th>\n");
      out.write("            </tr>\n");
      out.write("         ");
  for(int i = 0; i < coursesBean.EnrollmentList.size(); i++) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(coursesBean.EnrollmentList.get(i).studentid);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(coursesBean.EnrollmentList.get(i).courseid);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(coursesBean.EnrollmentList.get(i).term);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(coursesBean.EnrollmentList.get(i).schoolyear);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("         </table>\n");
      out.write("         \n");
      out.write("         <form name=\"submit\" action=\"submit.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"Enroll\" name=\"Enroll\" />\n");
      out.write("         </form>\n");
      out.write("         \n");
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
