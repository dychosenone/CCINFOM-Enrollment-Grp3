<%-- 
    Document   : cm_modcourse_process
    Created on : 02 3, 21, 10:37:34 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing Modify Course Data Record</title>
        <style>
            body {   
                font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
                font-size: 14px;
                line-height: 1.42857143;
                color: #333;
                background-color: #fff;
            } 
        </style>
    </head>
    <body>
        <h1>Modifying Existing Course Record</h1>
        <jsp:useBean id="coursesBean" class="enrollment.courses" scope="page" />
        <%  coursesBean.courseid      = request.getParameter("courseid");
            coursesBean.coursename    = request.getParameter("coursename");
            coursesBean.department    = request.getParameter("department");
           
            coursesBean.viewAllRecords();
            
            int found = 0;
            for (int i=0; i< coursesBean.courselist.size(); i++) 
                if (coursesBean.courselist.get(i).courseid.equals(coursesBean.courseid))
                    found = 1;
            
            if (found != 0) {
                coursesBean.modRecord();
        %>
        Modifying of existing course record with id <%=coursesBean.courseid%> was successful<br>
        <%
            } else {
        %>
        Modifying of existing course record with id was not successful<br>        
        <%        
            }
        %>
        <br>       
        <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
    </body>
</html>
