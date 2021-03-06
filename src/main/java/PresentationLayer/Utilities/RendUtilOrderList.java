package PresentationLayer.Utilities;

import FunctionLayer.Order;
import java.util.List;

/**
 *
 * @author Bo
 */
public class RendUtilOrderList {
    
    public static String allInvoiceIdTabel(List<Order> allOrder) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n"
                + "<tr><th>Invoices</th><th>Length</th><th>Width</th><th>Layers</th><th>Shipped</th></tr>\n");
        for (Order i : allOrder) {
            sb.append("<tr><form action=\"#\" method=POST>"); //Method kan være skrevet forkert! action=\"InvoiceDetailServlet\" method=POST>
            sb.append("<td>").append("" + i.getOrderId()).append("</td>");
            sb.append("<td>").append("" + i.getLayers()).append("</td>");
            sb.append("<td>").append("" + i.getWidth()).append("</td>");
            sb.append("<td>").append("" + i.getLayers()).append("</td>");
            if(i.getShipped() != null) {
            sb.append("<td>").append("" + i.getShipped()).append("</td>");
            } else {
                sb.append("<td>").append("" + "Is not shipped").append("</td>");
            }
            if(i.getShipped() == null) {
            sb.append("<td> \n <input type=\"button\" onclick=\"location.href='#';\" name=\"ship").append("\" value=\"Ship To Customer").append("\"><br>\n\n</td>"); //location.href='invoice_detail.jsp';\
            sb.append("<td> \n <input type=\"hidden\" onclick=\"location.href='#';\" name=\"ship").append("\" value=\"Ship To Customer").append("\"><br>\n\n</td>");
            } //<input type="hidden" name="command" value="buy"> !!!onclick kald metode!!!
            //sb.append("<td> \n <input type=\"button\" onclick=\"location.href='#';\" name=\"id").append("\" value=\"Ship To Customer").append(i.getOrderId()).append("\"><br>\n\n</td>");  
            
            sb.append("</tr>\n");
        }
        sb.append("</table>\n");
        return sb.toString();

    }
    
}
