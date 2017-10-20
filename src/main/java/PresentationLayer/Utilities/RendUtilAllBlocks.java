package PresentationLayer.Utilities;

import FunctionLayer.BlockToCalculator;
import java.util.List;

/**
 *
 * @author Bo
 */
public class RendUtilAllBlocks {
    
    public static String blockLengthTable(List<BlockToCalculator> blockList) {
        StringBuilder sb = new StringBuilder();

        sb.append("<table>\n"
                + "<tr><th>Side 1</th><th>Side 2</th><th>Side 3</th><th>Side 4</th><th>Ialt x højde</th></tr>\n");
        for (BlockToCalculator b : blockList) {
            sb.append("<tr><form action=\"buy"
                    + "\">");
            sb.append("<td>").append(b.getAmountBlock2X4Length()).append("</td>");
            sb.append("<td>").append(b.getAmountBlock2x2Length()).append("</td>");
            sb.append("<td>").append(b.getAmountBlock1x2Length()).append("</td>");
            sb.append("<td>").append(b.getBlock2X4Width()).append("</td>");
            sb.append("<td>").append(b.getBlock2X2Width()).append("</td>");
            sb.append("<td>").append(b.getBlock1X2Width()).append("</td>");
            //sb.append("<td> \n <input type=\"checkbox\" name=\"cupcakename\" value=\"" + b.getCupcakeName() + "\"><br>\n\n</td>");
        }
        sb.append("</table>\n");
       return sb.toString();

    }
    
    
    
}
