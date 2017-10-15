package PresentationLayer;

import FunctionLayer.BlockToCalculator;
import FunctionLayer.FacadeCalculator;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.FacadeOrderToDB;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Imorter de relevante servletter og de relevente classer fra functionLayer
 *
 * @author Bo
 */
public class Calculator extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        String incLength = (request.getParameter("length"));
        int length = Integer.parseInt(incLength);
        
        String incWidth = (request.getParameter("width"));
        int width = Integer.parseInt(incWidth);
        
        String incLayers = (request.getParameter("layers"));
        int layers = Integer.parseInt(incLayers);
        
        //Setter højde, længde og bredde på session
        HttpSession session = request.getSession();
        session.setAttribute("length", length);
        session.setAttribute("width", width);
        session.setAttribute("layers", layers);
        
        //customerId skal med new i databasen for ordren
        User user = new User();
        int customerId = user.getId();
        
        //Skriver ordren til databsen gennem facaden
        Order order = FacadeOrderToDB.createOrder(customerId, length, width, layers);
        
        //Skal kalde udregningsmetoderne i FacadeCalculator
        BlockToCalculator blockLength = FacadeCalculator.calculateBlocksLength(length);
        BlockToCalculator blockWidth = FacadeCalculator.calculateBlokWidth(width);
        int allBlocks = FacadeCalculator.totalBlock(layers, blockLength, blockWidth);
        
        //returner til buy.jsp
        return "buy";
    }
    
    public static void main(String[] args) throws LoginSampleException {
        int customerId = 3;
        int blockLength = 14;
        int blockWidth = 9;
        int layers = 4;
        
        //Test af createOrder metoden. Kan skrive til databasen herfra
        FacadeOrderToDB.createOrder(customerId, blockLength, blockWidth, layers);
        
//        FacadeCalculator.calculateBlocksLength(blockLength);
//        FacadeCalculator.calculateBlokWidth(blockWidth);
//        //FacadeCalculator.totalBlock(layers, blockLength, blockWidth);
//        
//        System.out.println(blockLength);
//        System.out.println(blockWidth);
        
    }

}
