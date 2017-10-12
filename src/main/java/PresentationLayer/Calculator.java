package PresentationLayer;

import FunctionLayer.BlocksLengthToCalculator;
import FunctionLayer.FacadeCalculator;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
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
        session.setAttribute("heigth", layers);
        
        //Initier en ordre
//        Order setOrder = new Order();
        
        //Setter ordren så den senere kan skrives til db
//        setOrder.setLængde(length);
//        setOrder.setBredde(width);
//        setOrder.setHøjde(heigth);
        
        //Mapper skal ind her og skrive ordren til db
        
        //Skal kalde udregningsmetoderne i FacadeCalculator
//        BlocksLengthToCalculator amountBlockLength = FacadeCalculator.amountLength(length);
        
        //returner til buy.jsp
        return "buy";
    }

}
