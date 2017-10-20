package FunctionLayer;

/**
 *
 * @author Bo
 */
public class CalculateLegoHouse {

    //https://stackoverflow.com/questions/2832472/how-to-return-2-values-from-a-java-method
    //http://jonskeet.uk/java/passing.html
    public static BlocksLengthToCalculator calculateBlocksLength(int length) throws LoginSampleException {
        int remainderLength = length % 4;

        switch (remainderLength) {
            case 3: {
                int amountBlock2x4Length = (length / 4);
                int amountBlock2x2Length = 1;
                int amountBlock1x2Length = 1;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);
            }
            case 2: {
                int amountBlock2x4Length = (length / 4);
                int amountBlock2x2Length = 1;
                int amountBlock1x2Length = 0;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);
            }
            case 1: {
                int amountBlock2x4Length = (length / 4);
                int amountBlock2x2Length = 0;
                int amountBlock1x2Length = 1;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);

            }
            case 0: {
                int amountBlock2x4Length = (length / 4);
                int amountBlock2x2Length = 0;
                int amountBlock1x2Length = 0;

                return new BlocksLengthToCalculator(amountBlock2x4Length, amountBlock2x2Length, amountBlock1x2Length);
            }
            default:
                String msg = "Error in calculater Length";
                throw new LoginSampleException(msg);
        }

    }

    //Udregning af antal klodser for bredden
    public static BlocksWidthToCalculator calculateBlocksWidth(int width) throws LoginSampleException { //

        BlocksWidthToCalculator blockWidth = new BlocksWidthToCalculator();
        int newWidth = width - 4;
        int remainderWidth = newWidth % 4;

        switch (remainderWidth) {
            case 3: {
                //Antallet af 4x2 klodser på Bredden
                int block2x4Width = (newWidth / 4);
                int block2x2Width = 1;
                int block1x2Width = 1;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);
            }
            case 2: {
                int block2x4Width = (newWidth / 4);
                int block2x2Width = 1;
                int block1x2Width = 0;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);

            }
            case 1: {
                int block2x4Width = (newWidth / 4);
                int block2x2Width = 0;
                int block1x2Width = 1;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);

            }
            case 0: {
                int block2x4Width = (newWidth / 4);
                int block2x2Width = 0;
                int block1x2Width = 0;

                return new BlocksWidthToCalculator(block2x4Width, block2x2Width, block1x2Width);

            }
            default:
                String msg = "Error in calculater width";
                throw new LoginSampleException(msg);
        }

    }

    //Udregning af et lag, og derefter ganges med x antal lag.
    public static int totalBlocks(int layers, BlocksLengthToCalculator length, BlocksWidthToCalculator width) {

        int blocksFirstLayer = (length.getAmountBlock2X4Length()
                + length.getAmountBlock2x2Length()
                + length.getAmountBlock1x2Length())
                + (width.getBlock2X4Width()
                + width.getBlock2X2Width()
                + width.getBlock1X2Width());

        //Gange med 2 for at få alle 4 sider med
        int totalBlocks = (blocksFirstLayer * 2) * layers;
        Order order = new Order();
        order.setAllBlocks(totalBlocks);

        return totalBlocks;
    }

    public static void main(String[] args) throws LoginSampleException {
        CalculateLegoHouse cal = new CalculateLegoHouse();

        //Test af ovenstående metoder
        int length = 13;
        int width = 9;
        int layers = 4;

        BlocksLengthToCalculator blockLength = calculateBlocksLength(length);

        //Test udregning length
        BlocksLengthToCalculator result = cal.calculateBlocksLength(length);
        System.out.println("calculateBlocksLength()");
        System.out.println(result);

        //Test width
        System.out.println("");
        System.out.println("calculateBlocksWidth");
        BlocksWidthToCalculator resultTo = cal.calculateBlocksWidth(width);
        System.out.println(resultTo);

        //Test Hvor mange klodser er der?
        System.out.println("");
        System.out.println("Antal klodser i alt:");
        System.out.println("blocksAndLeyers");

        int resultTre = cal.totalBlocks(layers, result, resultTo);
        System.out.println(resultTre);

        //Test af objektet
        int lengthBlock = blockLength.getAmountBlock2X4Length();
        System.out.println(lengthBlock);

    }

}
