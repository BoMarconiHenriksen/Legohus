package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bo
 */
public class BlocksLengthToCalculator {
    
    private int amountBlock2X4Length;
    private int amountBlock2x2Length;
    private int amountBlock1x2Length;
    //private List<BlocksLengthToCalculator> blockList = new ArrayList();
    
    
    //BlocksLengthToCalculator block = new BlocksLengthToCalculator();
    //ArrayList <BlocksLengthToCalculator>blockList;
    List<BlocksLengthToCalculator> blockList2 = new ArrayList();
    List<Integer> blockList = new ArrayList();
    
    public BlocksLengthToCalculator(int amountBlock2X4Length, int amountBlock2x2Length, int amountBlock1x2Length) {
        this.amountBlock2X4Length = amountBlock2X4Length;
        this.amountBlock2x2Length = amountBlock2x2Length;
        this.amountBlock1x2Length = amountBlock1x2Length;
    }

//    public BlocksLengthToCalculator(int amountBlock2X4Length, int amountBlock2x2Length, int amountBlock1x2Length, ArrayList<BlocksLengthToCalculator> blockList) {
//        this.amountBlock2X4Length = amountBlock2X4Length;
//        this.amountBlock2x2Length = amountBlock2x2Length;
//        this.amountBlock1x2Length = amountBlock1x2Length;
//        this.blockList = blockList;
//    }
    
    
    
    
    
   public BlocksLengthToCalculator () {
       
   }
   
   public List getAllBlockLength() {
       
       for (int i = 0; i < blockList.size(); i++) {
           blockList.add(amountBlock2X4Length);
           blockList.add(amountBlock2x2Length);
           blockList.add(amountBlock1x2Length);
       }
       return blockList2;
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

    @Override
    public String toString() {
        return "BlocksToCalculator{" + "amountBlock2X4Length=" + amountBlock2X4Length + ", amountBlock2x2Length=" + amountBlock2x2Length + ", amountBlock1x2Length=" + amountBlock1x2Length + '}';
    }
    
    
    
}
