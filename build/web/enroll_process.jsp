<%-- 
    Document   : enroll_process
    Created on : 02 2, 21, 11:20:02 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="studentBean" class="enrollment.students" scope="session" />
        <% studentBean.studentid = Integer.parseInt(request.getParameter("studentid"));
           studentBean.viewRecord();
        %>
        <h1>Enrollment Page</h1>
        <p>Student ID: <%=studentBean.studentid%></p>
        <p>Full Name: <%=studentBean.completename%></p>
        <p>Degree Code: <%=studentBean.degreeid%> </p>
        
        <jsp:useBean id="coursesBean" class="enrollment.courses" scope="session" />
        <% coursesBean.viewAllRecords(); %>
         <table>
             <tr>
                 <th>Course ID</th>
                 <th>Course Name</th>
                 <th>Department</th>
             </tr>
         <%  for(int i = 0; i < coursesBean.courselist.size(); i++) { %>
         <tr>
             <td><%=coursesBean.courselist.get(i).courseid%></td>
             <td><%=coursesBean.courselist.get(i).coursename%></td>
             <td><%=coursesBean.courselist.get(i).department%></td>
         </tr>
          <% } %>
         </table>
        
        
        <p> Enroll Course: </p>
        <form name="search" action="enroll_process.jsp" method="POST">
            <input type="text" name="studentid" id="studentid">
            <br />
            <input type="submit" value="search" name="Search">
        </form>
        
        
    </body>
</html>
