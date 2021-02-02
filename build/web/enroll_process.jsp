<%-- 
    Document   : enroll_process
    Created on : 02 2, 21, 11:20:02 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*, enrollment.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enrollment Pages</title>
    </head>
    <body>
        <jsp:useBean id="studentBean" class="students" scope="session" />
        <% studentBean.studentid = Integer.parseInt(request.getParameter("studentid"));
           studentBean.viewRecord();
        %>
        <h1>Enrollment Page</h1>
        <p>Student ID: <%=studentBean.studentid%></p>
        <p>Full Name: <%=studentBean.completename%></p>
        <p>Degree Code: <%=studentBean.degreeid%> </p>
        
        <jsp:useBean id="coursesBean" class="enroll" scope="session" />
        <% coursesBean.loadCourses(); %>
         <table>
             <tr>
                 <th>Course ID</th>
                 <th>Course Degree</th>
             </tr>
         <%  for(int i = 0; i < coursesBean.CourseList.size(); i++) { %>
         <tr>
             <td><%=coursesBean.CourseList.get(i).courseid%></td>
             <td><%=coursesBean.CourseList.get(i).degree%></td>
         </tr>
          <% } %>
         </table>
        
        
        <p> Enroll Course: </p>
        <form name="search" action="addCourse.jsp" method="POST">
            <input type="text" name="studentid" id="studentid">
            <br />
            <input type="submit" value="search" name="Search">
        </form>
        
        
    </body>
</html>
