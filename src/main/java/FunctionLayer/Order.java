package FunctionLayer;

/**
 *
 * @author Bo
 */
public class Order {
    
    private int id;
    private int length;
    private int width;
    private int layers;
    private int orderId;
    private String shipped; //TODO Timestamp
    private int allBlocks;

    public Order(int id, int length, int width, int layers, int orderId, String shipped, int allBlocks) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.layers = layers;
        this.orderId = orderId;
        this.shipped = shipped;
        this.allBlocks = allBlocks;
    }

    public Order(int id, int length, int width, int layers, String shipped) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.layers = layers;
        this.shipped = shipped;
    }

    public Order(int id, int orderId, int length, int width, int layers, String shipped) {
        this.id = id;
        this.orderId = orderId;
        this.length = length;
        this.width = width;
        this.layers = layers;
        this.shipped = shipped;
    }

    public Order(int id, int length, int width, int layers) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.layers = layers;
    }
    
    public Order(int length, int width, int layers) {
        this.length = length;
        this.width = width;
        this.layers = layers;
    }

    public Order() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getShipped() {
        return shipped;
    }

    public void setShipped(String shipped) {
        this.shipped = shipped;
    }

    public int getAllBlocks() {
        return allBlocks;
    }

    public void setAllBlocks(int allBlocks) {
        this.allBlocks = allBlocks;
    }

    @Override
    public String toString() {
        return "Order{" + "customerId=" + id + ", length=" + length + ", width=" + width + ", layers=" + layers + ", orderId=" + orderId + ", shipped=" + shipped + ", allBlocks=" + allBlocks + '}';
    }

}
