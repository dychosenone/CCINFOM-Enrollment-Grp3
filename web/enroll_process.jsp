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
        <title>Enrollment Pages</title>
    </head>
    <body>
        <jsp:useBean id="studentBean" class="enrollment.students" scope="session" />
        <%  
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
        %>
        <h1>Enrollment Page</h1>
        <p>Student ID: <%=studentBean.studentid%></p>
        <p>Full Name: <%=studentBean.completename%></p>
        <p>Degree Code: <%=studentBean.degreeid%> </p>
        <p>Current Term: <%=currentTerm%>
        <p>School Year: <%=schoolYear%> </p>
        
        <h3>Available Courses for Enrollment </h3>
        <jsp:useBean id="coursesBean" class="enrollment.enroll" scope="session" />
        <% coursesBean.Student.studentid = studentBean.studentid; %>
        <% coursesBean.Student.degreeid = studentBean.degreeid; %>
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
            <input type="text" name="courseid" id="courseid">
            
            <br />
            <br /> 
            <input type="submit" value="Add to Cart" name="addToCart">
        </form>
        <h3>My Cart</h3>
        <table>
            <tr>
                 <th>Student ID</th>
                 <th>Course ID</th>
                 <th>Term</th>
                 <th>School Year</th>
            </tr>
         <%  for(int i = 0; i < coursesBean.EnrollmentList.size(); i++) { %>
            <tr>
                <td><%=coursesBean.EnrollmentList.get(i).studentid%></td>
                <td><%=coursesBean.EnrollmentList.get(i).courseid%></td>
                <td><%=coursesBean.EnrollmentList.get(i).term%></td>
                <td><%=coursesBean.EnrollmentList.get(i).schoolyear%></td>
            </tr>
         <% } %>
         </table>
         
         <form name="submit" action="submit.jsp" method="POST">
            <input type="submit" value="Enroll" name="Enroll" />
         </form>
         
    </body>
</html>
