package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bo
 */
public class OrderMapper {

    //TODO Tilføj dato
    public static void createOrder(Order order) throws LoginSampleException, SQLException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orderlist (id, length, width, layers, shipped) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, order.getId());
            ps.setInt(2, order.getLength());
            ps.setInt(3, order.getWidth());
            ps.setInt(4, order.getLayers());
            ps.setString(5, order.getShipped());

            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int orderId = ids.getInt(1);
            order.setOrderId(orderId);
            //return orderId;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
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
                int customerId = rs.getInt("id");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int layers = rs.getInt("layers");
                String shipped = rs.getString("shipped"); //Hvis date i db String shipped = rs.getDate("shipped").toString();

                li = new Order(customerId, orderId, length, width, layers, shipped);
            } else {
                throw new LoginSampleException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return li;
    }

    public List<Order> getAllOrders() throws LoginSampleException {
        List<Order> orderList = new ArrayList();

        Order order = null;
        try {
            Connection con = Connector.connection();
            String sql = "SELECT orderid, id, length, width, layers, shipped FROM orderlist";
            PreparedStatement pstmt = con.prepareStatement(sql);
            //pstmt.setInt(1, orderID);

            ResultSet rs = pstmt.executeQuery();
            int lastId = -1;
            //Order id = null;
            while (rs.next()) {
                int order_id = rs.getInt("orderid");
                if (order_id != lastId) {

                    int orderId = rs.getInt("orderid");
                    int id = rs.getInt("id");
                    int length = rs.getInt("length");
                    int width = rs.getInt("width");
                    int layers = rs.getInt("layers");
                    String shipped = rs.getString("shipped"); //Hvis date i db String shipped = rs.getDate("shipped").toString();

                    order = new Order(id, orderId, length, width, layers, shipped);
                    orderList.add(order);
                    
                }

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return orderList;
    }

    public List<Order> getAllOrdersFromId(int OrderId) throws LoginSampleException {
        List<Order> orderList = new ArrayList();

        Order order = null;
        try {
            Connection con = Connector.connection();
            String sql = "SELECT orderid, id, length, width, layers, shipped FROM orderlist where id=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, OrderId);

            ResultSet rs = pstmt.executeQuery();
            int lastId = -1;
            //Order id = null;
            while (rs.next()) {
                int order_id = rs.getInt("orderid");
                if (order_id != lastId) {

                    int orderId = rs.getInt("orderid");
                    int id = rs.getInt("id");
                    int length = rs.getInt("length");
                    int width = rs.getInt("width");
                    int layers = rs.getInt("layers");
                    String shipped = rs.getString("shipped"); //Hvis date i db String shipped = rs.getDate("shipped").toString();

                    order = new Order(id, orderId, length, width, layers, shipped);
                    orderList.add(order);
                    
                }

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return orderList;
    }
    
    public static void main(String[] args) throws LoginSampleException, SQLException {

        //Test af createOrder
        OrderMapper or = new OrderMapper();
//        Order order = new Order(3, 7, 7, 7, "2017-12-12");
//        OrderMapper.createOrder(order);

        //Test af getOrderData
        //System.out.println(or.getOrderData(2));
//        System.out.println(or.getAllOrders());
    }

}
