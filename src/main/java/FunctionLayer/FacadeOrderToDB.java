package FunctionLayer;

import DBAccess.OrderMapper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bo
 */
public class FacadeOrderToDB {
    
    public static Order createOrder( int customerId, int length, int width, int layers ) throws LoginSampleException {
        Order order = new Order(customerId, length, width, layers);
        try {
            OrderMapper.createOrder(order);
        } catch (SQLException ex) {
            Logger.getLogger(FacadeOrderToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return order;
    }
    
}
