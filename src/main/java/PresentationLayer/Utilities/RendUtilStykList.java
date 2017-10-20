package PresentationLayer.Utilities;

import FunctionLayer.BlocksLengthToCalculator;
import FunctionLayer.CalculateLegoHouse;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.util.ArrayList;

/**
 *
 * @author Bo
 */
public class RendUtilStykList {

    //TODO Jeg kan ikke finde ud af at få resultatet af udregningerne til denne klasse
    public static String stykListTabel() throws LoginSampleException {
        StringBuilder sb = new StringBuilder();
        
//        BlocksLengthToCalculator length = new BlocksLengthToCalculator();//calculateBlocksLength();
//        BlocksWidthToCalculator width = new BlocksWidthToCalculator();
//        Order antal = new Order();
//        
        Order order = new Order();
        ArrayList<Integer> all = new ArrayList<>();
        
        int length = order.getLength();
//        int width = 9;
//        int layers = 4;
        
        CalculateLegoHouse cal = new CalculateLegoHouse();
//        BlocksLengthToCalculator bl =  calculateBlocksLength(length);
        
        BlocksLengthToCalculator resultLength = cal.calculateBlocksLength(length);
        int amountBlock2x4 = resultLength.getAmountBlock2X4Length();
        all.add(amountBlock2x4);
        int amountBlock2x2 = resultLength.getAmountBlock2x2Length();
        all.add(amountBlock2x2);
        int amountBlock1x2 = resultLength.getAmountBlock1x2Length();
        all.add(amountBlock1x2);
        

        sb.append("<table>\n"
                + "<tr><th>Length 1</th><th>Width 2</th><th>Length 3</th><th>Width 4</th><th>i alt x højde</th></tr>\n");

        for (Integer i : all) {
          
            
       
            sb.append("<tr><form action=\"#\" method=POST>"); //Method kan være skrevet forkert! action=\"InvoiceDetailServlet\" method=POST>
            //sb.append("<td>").append("2x4" + i.getAmountBlock2X4Length()).append("</td>");
            
            sb.append("<td>").append("2x4" + all.get(i)).append("</td>");
            sb.append("<td>").append("2x4" + amountBlock2x4).append("</td>");
            sb.append("<td>").append("2x2" + amountBlock2x2).append("</td>");
            sb.append("<td>").append("1x2" + amountBlock1x2).append("</td>");
//            sb.append("<td>").append("2x4W" + width.getBlock2X4Width()).append("</td>");
//            sb.append("<td>").append("2x2W" + width.getBlock2X2Width()).append("</td>");
//            sb.append("<td>").append("1x2W" + width.getBlock1X2Width()).append("</td>");
            //sb.append("<td>").append("I alt" + antal.getAllBlocks()).append("</td>");
            
            sb.append("</tr>\n");
        }
        sb.append("</table>\n");
        return sb.toString();

    }

}
