<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page import="PresentationLayer.Utilities.RendUtilOrderList"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.List"%>
<%@page import="DBAccess.OrderMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>

        <h1>Hello <%=request.getParameter("email")%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.

        <%  OrderMapper infoToAdmin = new OrderMapper();

            List<Order> orderList = infoToAdmin.getAllOrders();
        %>
        <%= RendUtilOrderList.allInvoiceIdTabel(orderList)%>

    </body>
</html>
