package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bo
 */
public class OrderMapper {
    
    public static void createOrder( Order order ) throws LoginSampleException, SQLException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orderlist (længde, bredde, højde, id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, order.getLængde() );
            ps.setInt( 2, order.getBredde() );
            ps.setInt( 3, order.getHøjde() );
            ps.setInt( 4, order.getCustomerId() );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int orderId = ids.getInt( 1 );
            order.setOrderId( orderId );
            //return orderId;
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    
    public Order getOrderData(int orderID) throws LoginSampleException {

        Order li = null;
        try {
            Connection con = Connector.connection();
            String sql = "SELECT * FROM orderlist WHERE orderid=?";
            PreparedStatement pstmt = con.prepareStatement(sql); 
            pstmt.setInt(1, orderID);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {

                int orderId = rs.getInt("orderid");
                int længde = rs.getInt("længde");
                int bredde = rs.getInt("bredde");
                int højde = rs.getInt("højde");
                int customerId = rs.getInt("id");
                String afsendt = rs.getDate("afsendt").toString();
                

                li = new Order(orderId, længde, bredde, højde, orderId, afsendt);
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
        

        return li;
    }
    
    public static void main(String[] args) throws LoginSampleException {
        
        //Test af createOrder
        OrderMapper or = new OrderMapper();
        Order order = new Order(1, 7, 7, 7);
        //or.
        
        //Test af getOrderData
        System.out.println(or.getOrderData(1));
        
    }
    
}
