package FunctionLayer;

/**
 *
 * @author Bo
 */
public class BlocksWidthToCalculator {
    
    private int block2X4Width;
    private int block2X2Width;
    private int block1X2Width;

    BlocksWidthToCalculator(int block2X4Width, int block2X2Width, int block1X2Width) {
        this.block2X4Width = block2X4Width;
        this.block2X2Width = block2X2Width;
        this.block1X2Width = block1X2Width;
    }

    public BlocksWidthToCalculator() {
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
        return "BlocksWidthToCalculator{" + "block2X4Width=" + block2X4Width + ", block2X2Width=" + block2X2Width + ", block1X2Width=" + block1X2Width + '}';
    }
    
    
    
    
}
