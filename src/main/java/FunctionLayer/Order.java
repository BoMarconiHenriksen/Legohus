package FunctionLayer;

/**
 *
 * @author Bo
 */
public class Order {
    
    private int id;
    private int længde;
    private int bredde;
    private int højde;
    private int orderId;
    private int date;
    private int allBlocks;

    public Order(int id, int længde, int bredde, int højde, int orderId, int date, int allBlocks) {
        this.id = id;
        this.længde = længde;
        this.bredde = bredde;
        this.højde = højde;
        this.orderId = orderId;
        this.date = date;
        this.allBlocks = allBlocks;
    }
    
    public Order() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    public int getHøjde() {
        return højde;
    }

    public void setHøjde(int højde) {
        this.højde = højde;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAllBlocks() {
        return allBlocks;
    }

    public void setAllBlocks(int allBlocks) {
        this.allBlocks = allBlocks;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", l\u00e6ngde=" + længde + ", bredde=" + bredde + ", h\u00f8jde=" + højde + ", orderId=" + orderId + ", date=" + date + ", allBlocks=" + allBlocks + '}';
    }

    
    
    
    
    
}
