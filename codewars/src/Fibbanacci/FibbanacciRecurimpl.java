package Fibbanacci;

import java.math.BigInteger;

/**
 *
 * @author rjperri
 */
public class FibbanacciRecurimpl implements Fibbanacci{

    @Override
    public  BigInteger getFib(Integer n) {
        if (n.equals(0)) return BigInteger.ZERO;
        if (n.equals(1)) return BigInteger.ONE;
        return getFib(n - 1).add(getFib(n - 2));    
    }
    
}
