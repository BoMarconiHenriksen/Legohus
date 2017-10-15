package FunctionLayer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bo
 */
public class CalculateLegoHouse {
    
    public static BlockToCalculator calculateBlocksLength(int length) throws LoginSampleException { 

        int remainderLength = length % 4;
        
        switch (remainderLength) {
            case 3: {
                //Antallet af 4x2 klodser på længden
                //Gange med 2 for at få for begge sider
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 1 * 2;
                int amountBlock1x2Length = 1 * 2;

                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);
                
            }
            case 2: {
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 1 * 2;
                int amountBlock1x2Length = 0;

                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            case 1: {
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 0;
                int amountBlock1x2Length = 1 * 2;

                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            case 0: {
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 0;
                int amountBlock1x2Length = 0;

                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            default:
                String msg = "Error in calculater";
                throw new LoginSampleException(msg);
        }

    }

    //Udregning af antal klodser for begge de 2 sider
    public static BlockToCalculator calculateBlocksWidth(int width) throws LoginSampleException { //
        BlockToCalculator bl = new BlockToCalculator();
        
        int newWidth = width - 4;
        int remainderWidth = newWidth % 4;

        //TODO hvis width er mindre end 4 ??? Minimum 5 bred
        switch (remainderWidth) {
            case 3: {
                //Antallet af 4x2 klodser på Bredden
                //Gange med 2 for at få for begge sider
                int block2x4Width = (newWidth / 4) * 2;
                int block2x2Width = 1 * 2;
                int block1x2Width = 1 * 2;
                int amountBlock2x4Length = bl.getAmountBlock2X4Length();
                int amountBlock2x2Length = bl.getAmountBlock2x2Length();
                int amountBlock1x2Length = bl.getAmountBlock1x2Length();
//                
                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length, block2x4Width, block2x2Width, block1x2Width);

            }
            case 2: {
                int block2x4Width = (newWidth / 4) * 2;
                int block2x2Width = 1 * 2;
                int block1x2Width = 0;
                int amountBlock2x4Length = bl.getAmountBlock2X4Length();
                int amountBlock2x2Length = bl.getAmountBlock2x2Length();
                int amountBlock1x2Length = bl.getAmountBlock1x2Length();
//               
                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length, block2x4Width, block2x2Width, block1x2Width);

            }
            case 1: {
                int block2x4Width = (newWidth / 4) * 2;
                int block2x2Width = 0;
                int block1x2Width = 1 * 2;
                int amountBlock2x4Length = bl.getAmountBlock2X4Length();
                int amountBlock2x2Length = bl.getAmountBlock2x2Length();
                int amountBlock1x2Length = bl.getAmountBlock1x2Length();
//                
                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length, block2x4Width, block2x2Width, block1x2Width);

            }
            case 0: {
                int block2x4Width = (newWidth / 4) * 2;
                int block2x2Width = 0;
                int block1x2Width = 0;
                int amountBlock2x4Length = bl.getAmountBlock2X4Length();
                int amountBlock2x2Length = bl.getAmountBlock2x2Length();
                int amountBlock1x2Length = bl.getAmountBlock1x2Length();
//                
                return new BlockToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length, block2x4Width, block2x2Width, block1x2Width);

            }
            default:
                String msg = "Error in calculater";
                throw new LoginSampleException(msg);
        }

    }

    //Udregning af et lag, og derefter ganges med x antal lag.
    public static int totalBlocks(int layers, BlockToCalculator length, BlockToCalculator width) {

        int blocksFirstLayer = (length.getAmountBlock2X4Length() + length.getAmountBlock2x2Length() + length.getAmountBlock1x2Length())
                + (width.getBlock2X4Width() + width.getAmountBlock2x2Length() + width.getBlock1X2Width());

        int totalBlocks = blocksFirstLayer * layers;

        return totalBlocks;
    }
    
    public static void main(String[] args) {
        CalculateLegoHouse cal = new CalculateLegoHouse();
        
        //Test af ovenstående metoder
        int length = 13;
        int width = 9;
        int layers = 4;
        try {
                      
            BlockToCalculator result = cal.calculateBlocksLength(length);
            System.out.println("calculateBlocksLength()");
            System.out.println(result);
            
            //Test width
            System.out.println("");
            System.out.println("calculateBlocksWidth");
            BlockToCalculator resultTo = cal.calculateBlocksWidth(width);
            System.out.println(resultTo);
            
            //Test Hvor mange klodser er der?
            System.out.println("");
            System.out.println("Antal klodser i alt:");
            System.out.println("blocksAndLeyers");
            
            int resultTre = cal.totalBlocks(layers, result, resultTo);
            System.out.println(resultTre);
        } catch (LoginSampleException ex) {
            Logger.getLogger(CalculateLegoHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
