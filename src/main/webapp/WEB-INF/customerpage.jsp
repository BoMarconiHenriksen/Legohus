<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page import="FunctionLayer.User"%>
<%@page import="PresentationLayer.Utilities.RendUtilOrderListFromId"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="DBAccess.OrderMapper"%>
<%@page import="FunctionLayer.BlocksLengthToCalculator"%>
<%@page import="java.util.List"%>
<%@page import="PresentationLayer.Utilities.RendUtilAllBlocks"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        You are now logged in as a customer of our wonderful site.

        <form id="formLegoHouse" action="FrontController" method="POST">
            <input type="hidden" name="command" value="buy">

            <div id="length">
                Length
                <input type="number" name="length" min="5" value="5" placeholder="5" >
            </div>

            <div id="width">
                Width
                <input type="number" name="width" min="5" value="5" placeholder="5" >
            </div>

            <div id="layers">
                Layers
                <input type="number" name="layers" min="1" value="1" placeholder="1" >
            </div>

            <input type="submit" value="Buy">
        </form>

        <!-- Show order button Virker ikke. Vil ikke gå til orders.jsp-->
        <!--<button type="submit" action="FrontController" method="POST">Show last orders   
            <input type="hidden" name="command" value="orders">
        </button> -->
        
        <!--Midlertidlig løsning for show all customer orders-->
        <h1>Your last orders</h1>
        <%  OrderMapper infoToAdmin = new OrderMapper();

        //Henter user fra session
        User user = (User) session.getAttribute("user");
        int OrderId = user.getId();    
        List<Order> orderList = infoToAdmin.getAllOrdersFromId(OrderId);
        %>
        <%= RendUtilOrderListFromId.allInvoiceIdTabel(orderList)%>



    </body>
</html>
