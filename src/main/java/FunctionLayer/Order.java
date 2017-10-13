package FunctionLayer;

/**
 *
 * @author Bo
 */
public class Order {
    
    private int customerId;
    private int længde;
    private int bredde;
    private int højde;
    private int orderId;
    private String afsendt; //TODO Timestamp
    private int allBlocks;

    public Order(int customerId, int længde, int bredde, int højde, int orderId, String afsendt, int allBlocks) {
        this.customerId = customerId;
        this.længde = længde;
        this.bredde = bredde;
        this.højde = højde;
        this.orderId = orderId;
        this.afsendt = afsendt;
        this.allBlocks = allBlocks;
    }

    public Order(int customerId, int længde, int bredde, int højde, int orderId, String afsendt) {
        this.customerId = customerId;
        this.længde = længde;
        this.bredde = bredde;
        this.højde = højde;
        this.orderId = orderId;
        this.afsendt = afsendt;
    }
    
    //TODO Tilføj afsendt når timestamp er lavet på ordren. Husk at rette i orderMapper createOrder
    public Order(int customerId, int længde, int bredde, int højde) {
        this.customerId = customerId;
        this.længde = længde;
        this.bredde = bredde;
        this.højde = højde;
    }
    
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getAfsendt() {
        return afsendt;
    }

    public void setAfsendt(String afsendt) {
        this.afsendt = afsendt;
    }

    public int getAllBlocks() {
        return allBlocks;
    }

    public void setAllBlocks(int allBlocks) {
        this.allBlocks = allBlocks;
    }

    @Override
    public String toString() {
        return "Order{" + "customerId=" + customerId + ", l\u00e6ngde=" + længde + ", bredde=" + bredde + ", h\u00f8jde=" + højde + ", orderId=" + orderId + ", afsendt=" + afsendt + ", allBlocks=" + allBlocks + '}';
    }

}
