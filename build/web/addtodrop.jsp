<%-- 
    Document   : addtodrop
    Created on : 02 3, 21, 3:04:44 AM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Add to Drop </title>
    </head>
    <body>
        <jsp:useBean id="courseBean" class="enrollment.drop" scope="session"/>
       <%  int cterm = (int) request.getSession().getAttribute("term");
            int schoolyear = (int) request.getSession().getAttribute("year");
            String courseid = request.getParameter("courseid");
            int val = courseBean.addDrop(courseid, cterm, schoolyear);
         
            if(val == 1) { %>
          
                <p>Drop cart added a course to be dropped.</p>
        <%    } %>
        <a href="drop_process.jsp"> Return to Dropping </a>
    </body>
</html>
