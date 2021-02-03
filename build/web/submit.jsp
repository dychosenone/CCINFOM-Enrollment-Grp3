<%-- 
    Document   : submit
    Created on : 02 3, 21, 3:12:35 AM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Submit</title>
    </head>
    <body>
        <jsp:useBean id="coursesBean" class="enrollment.enroll" scope="session" />
        <% 
            int result = coursesBean.confirmEnrollment();
            int clearResult = coursesBean.clearEnrollment();
            
            if(result == 1 && clearResult == 1) { 
                session.invalidate();
            %> 
            <p>Successfully Enrolled. Thank you.</p>
        <%}%>  
        <a href="index.html"> Return to Main Menu </a>
    </body>
</html>
