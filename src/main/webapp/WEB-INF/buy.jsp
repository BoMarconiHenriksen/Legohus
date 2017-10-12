<%-- 
    Document   : buy
    Created on : 12-10-2017, 15:03:12
    Author     : Bo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>The buy page!</p>
        <h1>Length <%=request.getParameter( "length" )%> </h1>
        <h1>Width <%=request.getParameter( "width" )%> </h1>
        <h1>Height <%=request.getParameter( "layers" )%> </h1>
    </body>
</html>
