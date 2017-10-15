package FunctionLayer;

/**
 *
 * @author Bo
 */
public class BlockToCalculator {
    
    private int amountBlock2X4Length;
    private int amountBlock2x2Length;
    private int amountBlock1x2Length;
    private int block2X4Width;
    private int block2X2Width;
    private int block1X2Width;
    
    //https://www.javaworld.com/article/2979739/learn-java/java-101-classes-and-objects-in-java.html?page=2

    public BlockToCalculator(int amountBlock2X4Length, int amountBlock2x2Length, int amountBlock1x2Length, int block2X4Width, int block2X2Width, int block1X2Width) {
        this.amountBlock2X4Length = amountBlock2X4Length;
        this.amountBlock2x2Length = amountBlock2x2Length;
        this.amountBlock1x2Length = amountBlock1x2Length;
        this.block2X4Width = block2X4Width;
        this.block2X2Width = block2X2Width;
        this.block1X2Width = block1X2Width;
    }

    public BlockToCalculator(int amountBlock2X4Length, int amountBlock2x2Length, int amountBlock1x2Length) {
        this.amountBlock2X4Length = amountBlock2X4Length;
        this.amountBlock2x2Length = amountBlock2x2Length;
        this.amountBlock1x2Length = amountBlock1x2Length;
    }

   public BlockToCalculator() {
        
    }

    public int getAmountBlock2X4Length() {
        return amountBlock2X4Length;
    }

    public void setAmountBlock2X4Length(int amountBlock2X4Length) {
        this.amountBlock2X4Length = amountBlock2X4Length;
    }

    public int getAmountBlock2x2Length() {
        return amountBlock2x2Length;
    }

    public void setAmountBlock2x2Length(int amountBlock2x2Length) {
        this.amountBlock2x2Length = amountBlock2x2Length;
    }

    public int getAmountBlock1x2Length() {
        return amountBlock1x2Length;
    }

    public void setAmountBlock1x2Length(int amountBlock1x2Length) {
        this.amountBlock1x2Length = amountBlock1x2Length;
    }

    public int getBlock2X4Width() {
        return block2X4Width;
    }

    public void setBlock2X4Width(int block2X4Width) {
        this.block2X4Width = block2X4Width;
    }

    public int getBlock2X2Width() {
        return block2X2Width;
    }

    public void setBlock2X2Width(int block2X2Width) {
        this.block2X2Width = block2X2Width;
    }

    public int getBlock1X2Width() {
        return block1X2Width;
    }

    public void setBlock1X2Width(int block1X2Width) {
        this.block1X2Width = block1X2Width;
    }

    @Override
    public String toString() {
        return "BlockToCalculator{" + "amountBlock2X4Length=" + amountBlock2X4Length + ", amountBlock2x2Length=" + amountBlock2x2Length + ", amountBlock1x2Length=" + amountBlock1x2Length + ", block2X4Width=" + block2X4Width + ", block2X2Width=" + block2X2Width + ", block1X2Width=" + block1X2Width + '}';
    }
    
    
    
}
