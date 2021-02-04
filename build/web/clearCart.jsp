<%-- 
    Document   : clearCart
    Created on : 02 3, 21, 3:12:35 AM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ClearCart</title>
    </head>
    <body>
        <jsp:useBean id="coursesBean" class="enrollment.enroll" scope="session" />
        <% 
            int clearResult = coursesBean.clearEnrollment();
            
            if(clearResult == 1) { 
            %> 
            <p>Successfully Cleared the Cart. Thank you.</p>
        <%} else {%> 
            <p>There was a problem clearing the cart. </p>
        <% } %>    
        <a href="enroll_process.jsp"> Return to Main Menu </a>
    </body>
</html>
