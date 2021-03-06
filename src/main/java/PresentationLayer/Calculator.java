package PresentationLayer;

import FunctionLayer.BlocksLengthToCalculator;
import FunctionLayer.BlocksWidthToCalculator;
import FunctionLayer.CalculateLegoHouse;
import static FunctionLayer.CalculateLegoHouse.calculateBlocksLength;
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

        //Henter user fra session
        User user = (User) session.getAttribute("user");
        //System.out.println(user); //Tester at vi får useren
        //Henter user id
        int id = user.getId();

        //Skriver ordren til databasen gennem facaden
        Order order = FacadeOrderToDB.createOrder(id, length, width, layers);

        //Skal kalde udregningsmetoderne i FacadeCalculator
        BlocksLengthToCalculator blockLength = FacadeCalculator.calculateBlocksLength(length);
        BlocksWidthToCalculator blockWidth = FacadeCalculator.calculateBlokWidth(width);
        int allBlocks = FacadeCalculator.totalBlock(layers, blockLength, blockWidth);
        
        
        //returner til buy.jsp
        return "buy";
    }

    //Test
    public static void main(String[] args) throws LoginSampleException {
        int customerId = 3;
        int blockLength = 14;
        int blockWidth = 9;
        int layers = 4;

        //Test af createOrder metoden. Kan skrive til databasen herfra
        
        FacadeCalculator.calculateBlocksLength(blockLength);
        FacadeCalculator.calculateBlokWidth(blockWidth);
//        FacadeCalculator.totalBlock(layers, blockLength, blockWidth);
        CalculateLegoHouse cal = new CalculateLegoHouse();
        BlocksLengthToCalculator bl =  calculateBlocksLength(blockLength);
        
        //Test udregning length
        BlocksLengthToCalculator result = cal.calculateBlocksLength(blockLength);
        System.out.println("calculateBlocksLength()");
        System.out.println(result);

        System.out.println(blockLength);
        System.out.println(blockWidth);
        
        //Test af objektet
        int lengthBlock = bl.getAmountBlock2X4Length();
        System.out.println(lengthBlock);
    }

}
