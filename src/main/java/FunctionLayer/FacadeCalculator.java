package FunctionLayer;

/**
 *
 * @author Bo
 */
public class FacadeCalculator  {
    
public static BlockToCalculator calculateBlocksLength(int length) throws LoginSampleException {
    return CalculateLegoHouse.calculateBlocksLength(length);
}

public static BlockToCalculator calculateBlokWidth(int width) throws LoginSampleException {
    return CalculateLegoHouse.calculateBlocksWidth(width);
}

public static int totalBlock(int layers, BlockToCalculator length, BlockToCalculator width) {
    return CalculateLegoHouse.totalBlocks(layers, length, width);
}
    
    //Kun til test
    public static void main(String[] args) throws LoginSampleException {
        int length = 13;
        int width = 9;
        int layers = 4;
        
        //Test af calculateBlocksLength metoden
        BlockToCalculator hs = calculateBlocksLength(length);
        System.out.println(hs);
        
        //Test af calculateBlokWidth metoden
        BlockToCalculator bs = calculateBlokWidth(width);
        System.out.println(bs);
        
        //Test af hvor mange klodser i alt
        int amountBlok = totalBlock(layers, hs, bs);
        System.out.println(amountBlok);
        
        
    }
    
}
