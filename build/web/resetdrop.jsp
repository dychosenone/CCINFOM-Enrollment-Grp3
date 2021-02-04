<%-- 
    Document   : resetdrop
    Created on : 02 4, 21, 11:33:52 AM
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
       <%  
      
            
            int cterm = (int) request.getSession().getAttribute("term");
            int schoolyear = (int) request.getSession().getAttribute("year");
            String courseid = request.getParameter("courseid");
            int val = courseBean.delDrop(courseid, cterm, schoolyear);
            val = courseBean.clearDrop();
            if(val == 1) { %>
          
                <p>Drop cart resetted.</p>
        <%    } %>
        <a href="drop_process.jsp"> Return to Dropping </a>
    </body>
</html>

