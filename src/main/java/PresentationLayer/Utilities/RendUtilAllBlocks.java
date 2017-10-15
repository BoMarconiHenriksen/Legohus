package PresentationLayer.Utilities;

import FunctionLayer.BlockToCalculator;
import FunctionLayer.BlocksLengthToCalculator;
import java.util.List;

/**
 *
 * @author Bo
 */
public class RendUtilAllBlocks {
    
    public static void blockLengthTable(List<BlockToCalculator> blockList) {
        StringBuilder sb = new StringBuilder();

        sb.append("<table>\n"
                + "<tr><th>Lego Blocks</th><th>Pris</th><th></th><th></th></tr>\n");
        for (BlockToCalculator b : blockList) {
            sb.append("<tr><form action=\"CustomerControlerServlet\">");
            sb.append("<td>").append(b.getAmountBlock2X4Length()).append("</td>");
            sb.append("<td>").append(b.getAmountBlock2x2Length()).append("</td>");
            sb.append("<td>").append(b.getAmountBlock1x2Length()).append("</td>");
            sb.append("<td>").append(b.getBlock2X4Width()).append("</td>");
            sb.append("<td>").append(b.getBlock2X2Width()).append("</td>");
            sb.append("<td>").append(b.getBlock1X2Width()).append("</td>");
            //sb.append("<td> \n <input type=\"checkbox\" name=\"cupcakename\" value=\"" + b.getCupcakeName() + "\"><br>\n\n</td>");
        }
        sb.append("</table>\n");
       

    }
    
    
    
}
