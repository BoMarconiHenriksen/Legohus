package FunctionLayer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bo
 */
public class CalculateLegoHouse {

    public BlockToCalculator calculateAmountBlocks(int length, int width) throws LoginSampleException { 

        int remainder = length % 4;
        
        //TODO Hvis length er mindre end 4 (minimum 5 lang)
        
        switch (remainder) {
            case 3: {
                //Antallet af 4x2 klodser på længden
                //Gange med 2 for at få for begge sider
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 1 * 2;
                int amountBlock1x2Length = 1 * 2;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            case 2: {
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 1 * 2;
                int amountBlock1x2Length = 0;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            case 1: {
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 0;
                int amountBlock1x2Length = 1 * 2;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            case 0: {
                int amountBlock2x4Length = (length / 4) * 2;
                int amountBlock2x2Length = 0;
                int amountBlock1x2Length = 0;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            default:
                String msg = "Error in calculater";
                throw new LoginSampleException(msg);
        }

    }

    //Udregning af antal klodser for begge de 2 sider
    public BlocksWidthToCalculator calculateBlocksWidth(int bredde) throws LoginSampleException { //

        int nyBredde = bredde - 4;
        int remainderTo = nyBredde % 4;

        //TODO hvis bredde er mindre end 4 ??? Minimum 5 bred
        switch (remainderTo) {
            case 3: {
                //Antallet af 4x2 klodser på Bredden
                //Gange med 2 for at få for begge sider
                int block2x4Width = (nyBredde / 4) * 2;
                int block2x2Width = 1 * 2;
                int block1x2Width = 1 * 2;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);

            }
            case 2: {
                int block2x4Width = (nyBredde / 4) * 2;
                int block2x2Width = 1 * 2;
                int block1x2Width = 0;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);

            }
            case 1: {
                int block2x4Width = (nyBredde / 4) * 2;
                int block2x2Width = 0;
                int block1x2Width = 1 * 2;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);

            }
            case 0: {
                int block2x4Width = (nyBredde / 4) * 2;
                int block2x2Width = 0;
                int block1x2Width = 0;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);

            }
            default:
                String msg = "Error in calculater";
                throw new LoginSampleException(msg);
        }

    }

    //Udregning af et lag, og derefter ganges med x antal lag.
    public int blocksAndLeyers(int højde, BlocksLengthToCalculator længde, BlocksWidthToCalculator bredde) {

        int blocksFirstLayer = (længde.getAmountBlock2X4Length() + længde.getAmountBlock2x2Length() + længde.getAmountBlock1x2Length())
                + (bredde.getBlock2X4Width() + bredde.getBlock2X2Width() + bredde.getBlock1X2Width());

        int amountBlocksAllLayers = blocksFirstLayer * højde;

        return amountBlocksAllLayers;
    }
    
    public static void main(String[] args) {
        CalculateLegoHouse cal = new CalculateLegoHouse();
        
        //Test af ovenstående metoder
        int længde = 13;
        int bred = 9;
        int høj = 4;
        try {
            BlocksLengthToCalculator result = cal.calculateBlocksLength(længde);
            System.out.println("calculateBlocksLength()");
            System.out.println(result);
            System.out.println("calculateBlocksWidth");
            BlocksWidthToCalculator resultTo = cal.calculateBlocksWidth(bred);
            System.out.println(resultTo);
            System.out.println("blocksAndLeyers");
            int resultTre = cal.blocksAndLeyers(høj, result, resultTo);
            System.out.println(resultTre);
        } catch (LoginSampleException ex) {
            Logger.getLogger(CalculateLegoHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
