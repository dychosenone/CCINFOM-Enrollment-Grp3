<%-- 
    Document   : submitdrop
    Created on : 02 4, 21, 11:34:59 AM
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
        <jsp:useBean id="subBean" class="enrollment.drop" scope="session" />
        <% 
            int cterm = (int) request.getSession().getAttribute("term");
            int schoolyear = (int) request.getSession().getAttribute("year");
            String courseid = request.getParameter("courseid");
            
            int result = subBean.confirmDrop();
            int cResult = subBean.delDrop(courseid, cterm, schoolyear);
            
            if(result == 1 && cResult == 1) { 
                session.invalidate();
            %> 
            <p>Successfully Dropped Enrollments. </p>
        <%}%>  
        <p> Come back next time. </p>
        <a href="index.html"> Return to Main Menu </a>
    </body>
</html>
