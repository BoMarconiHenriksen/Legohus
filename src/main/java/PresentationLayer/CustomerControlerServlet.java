package PresentationLayer;

import FunctionLayer.BlocksLengthToCalculator;
import FunctionLayer.BlocksWidthToCalculator;
import FunctionLayer.CalculateLegoHouse;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bo
 */
@WebServlet(name = "CustomerControlerServlet", urlPatterns = {"/CustomerControlerServlet"})
public class CustomerControlerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws FunctionLayer.LoginSampleException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, LoginSampleException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            //Sessionen kaldes
            HttpSession session = request.getSession();

            // Får fat i hidden             
            String origin = request.getParameter("origin");

            switch (origin) {
                case "showProduct":
                    
                    Order showProducts = new Order();
                    CalculateLegoHouse cal = new CalculateLegoHouse();
                    
                    int length = Integer.parseInt(request.getParameter("length"));
                    int width = Integer.parseInt(request.getParameter("width"));
                    int heigth = Integer.parseInt(request.getParameter("height"));
                    
                    session.setAttribute("length", length);
                    session.setAttribute("width", width);
                    session.setAttribute("heigth", heigth);
                    
                    showProducts.setLængde(length);
                    showProducts.setBredde(width);
                    showProducts.setHøjde(heigth);
                    
//                    BlocksLengthToCalculator udregnetLængde = cal.calculateBlocksLength(length);
//                    BlocksWidthToCalculator udregnetBredde = cal. calculateBlocksWidth(width);
//                    int result = cal.blocksAndLeyers(heigth, udregnetLængde, udregnetBredde);
                    
                    
                    
//                    showProducts.setAllBlocks(result);
//                    request.getRequestDispatcher("customerpage.jsp").forward(request, response);
                    
                    
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (LoginSampleException ex) {
            Logger.getLogger(CustomerControlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (LoginSampleException ex) {
            Logger.getLogger(CustomerControlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
