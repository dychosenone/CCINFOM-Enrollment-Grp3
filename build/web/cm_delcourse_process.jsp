<%-- 
    Document   : cm_delcourse_process
    Created on : 02 3, 21, 10:41:48 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing Delete Course Data Record</title>
    </head>
    <body>
        <h1>Deleting Existing Course Record</h1>
       <jsp:useBean id="coursesBean" class="enrollment.courses" scope="page" />
        <%  coursesBean.courseid      = request.getParameter("courseid");
            
            coursesBean.viewAllRecords();
            
            int found = 0;
            for (int i=0; i< coursesBean.courselist.size(); i++) 
                if (coursesBean.courselist.get(i).courseid.equals(coursesBean.courseid))
                    found = 1;
            
            if (found != 0) {
                coursesBean.delRecord();
        %>
        Deleting of existing course record with id <%=coursesBean.courseid%> was successful<br>
        <%
            } else {
        %>
        Deleting of existing course record with id was not successful<br>        
        <%        
            }
        %>
        <br>       
        <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
    </body>
</html>