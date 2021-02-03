<%-- 
    Document   : cm_addcourse_process
    Created on : 02 3, 21, 10:34:26 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing Add Course Data Record</title>
    </head>
    <body>
        <h1>Adding New Course Record</h1>
        <jsp:useBean id="coursesBean" class="enrollment.courses" scope="page" />
        <%  coursesBean.courseid      = request.getParameter("courseid");
            coursesBean.coursename    = request.getParameter("coursename");
            coursesBean.department    = request.getParameter("department");
             
            if (coursesBean.addRecord()!=0) {
        %>
        Adding of new course record with id <%=coursesBean.courseid%> was successful<br>
        <%
            } else {
        %>
        Adding of new course record with id was not successful<br>        
        <%        
            }
        %>
        <br>     
        <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
    </body>
</html>
