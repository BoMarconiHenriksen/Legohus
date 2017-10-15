<%-- 
    Document   : buy
    Created on : 12-10-2017, 15:03:12
    Author     : Bo
--%>

<%@page import="PresentationLayer.Utilities.RendUtilAllBlocks"%>
<%@page import="FunctionLayer.BlockToCalculator"%>
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
        
        <!--<%  
            BlockToCalculator all = new BlockToCalculator();
            //RendUtilAllBlocks ruall = new RendUtilAllBlocks();
        
           //List<BlockToCalculator> blockList = all.get
            %>
        <div>
           <% //RendUtilAllBlocks.blockLengthTable(blockList); %>
        </div>
       <%
         
       out.println("<h2>2x4 længde  " + all.getAmountBlock2X4Length() + "</h2>");
       out.println("<h2>2x4 længde  " + all.getAmountBlock2x2Length() + "</h2>");
       out.println("<h2>2x4 længde  " + all.getAmountBlock1x2Length() + "</h2>");
       out.println("<h2>2x4 længde  " + all.getBlock2X4Width() + "</h2>");
       out.println("<h2>2x4 længde  " + all.getBlock2X2Width() + "</h2>");
       out.println("<h2>2x4 længde  " + all.getBlock1X2Width() + "</h2>");
       
       out.println("Hej");
       
       
       %>
        
        
    </body>
</html>
