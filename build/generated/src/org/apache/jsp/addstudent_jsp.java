package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add a Student - CCINFOM</title>\n");
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
      out.write("            \n");
      out.write("            .btn {\n");
      out.write("            border: 1px solid black;            \n");
      out.write("            padding: 10px 15px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            \n");
      out.write("            font-family: inherit;\n");
      out.write("            font-size: inherit;\n");
      out.write("            line-height: inherit;\n");
      out.write("            background-color: inherit;\n");
      out.write("            \n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            color: inherit;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Green */ \n");
      out.write("            .success:hover {\n");
      out.write("            border: 1.5px solid #ddd;\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Full-width input fields */\n");
      out.write("            input[type=text] {\n");
      out.write("            width: 45%;\n");
      out.write("            padding: 15px;\n");
      out.write("            margin: 0px 0 12px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: none;\n");
      out.write("            background: #f1f1f1;\n");
      out.write("            font-family: inherit;\n");
      out.write("            font-size: inherit;\n");
      out.write("            line-height: inherit;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=text]:focus {\n");
      out.write("            background-color: #ddd;            \n");
      out.write("            outline: none;\n");
      out.write("            font-family: inherit;\n");
      out.write("            font-size: inherit;\n");
      out.write("            line-height: inherit;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("               <h1>Enter the student details to add:</h1> \n");
      out.write("            </div>\n");
      out.write("            <div>    \n");
      out.write("                <form name=\"addstudent\"   action=\"addstudent_process.jsp\" method=\"POST\">\n");
      out.write("                    <p>Student ID </p>\n");
      out.write("                    <input type=\"text\" name=\"studentid\" id=\"studentid\">\n");
      out.write("\n");
      out.write("                    <p>Complete Name </p>\n");
      out.write("                    <input type=\"text\" name=\"completename\" id=\"completename\">\n");
      out.write("\n");
      out.write("                    <p>Degree ID </p>\n");
      out.write("                    <input type=\"text\" name=\"degreeid\" id=\"degreeid\">\n");
      out.write("                    <br><br>\n");
      out.write("                    <button class=\"btn success\" value=\"submit\" name=\"submit\">Submit</button>\n");
      out.write("                    <br><br><br>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"list-group\">\n");
      out.write("                <a href=\"studentmaintenance.jsp\" class=\"list-group-item\">Back to Student Maintenance</a><br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>    \n");
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
