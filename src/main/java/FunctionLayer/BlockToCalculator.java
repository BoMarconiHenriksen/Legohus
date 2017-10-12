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

    public BlockToCalculator(int amountBlock2X4Length, int amountBlock2x2Length, int amountBlock1x2Length, int block2X4Width, int block2X2Width, int block1X2Width) {
        this.amountBlock2X4Length = amountBlock2X4Length;
        this.amountBlock2x2Length = amountBlock2x2Length;
        this.amountBlock1x2Length = amountBlock1x2Length;
        this.block2X4Width = block2X4Width;
        this.block2X2Width = block2X2Width;
        this.block1X2Width = block1X2Width;
    }

    public BlockToCalculator() {
        
    }
    
}
