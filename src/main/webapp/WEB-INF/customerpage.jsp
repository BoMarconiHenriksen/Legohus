<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

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
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
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
                   
                    <!--<button type="submit" value=action name="showAmount" >Show amount of Lego blocks   
                        <input type="hidden" name="origin" value="showProduct">
                    </button> 
                    
                    <button type="submit" value=action name="shoppingCart" >Add to shoppingcart   </button>   

                    <button type="submit" value="action" name="checkout">Checkout </button>  -->
                </form>
        
    </body>
</html>
