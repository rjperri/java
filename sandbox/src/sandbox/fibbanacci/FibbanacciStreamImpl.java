
package sandbox.fibbanacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author rjperri
 */
public class FibbanacciStreamImpl implements Fibbanacci{

    @Override
    public BigInteger getFib(Integer n) {
        Tuple<BigInteger, BigInteger> fibStart = new Tuple<>(BigInteger.ZERO, BigInteger.ONE);
        
        UnaryOperator<Tuple<BigInteger, BigInteger>> f = x -> new Tuple<>(x._2, x._1.add(x._2));
        
        BigInteger fib = Stream.iterate(fibStart, f)
                               .map(i -> i._1)
                               .limit(n + 1)
                               .collect(Collectors.toList())
                               .get(n);
        
        return fib;
    }


    
//    @Override
//    public Long getFib(Long n) {
//        
//        IntStream.generate((0, 1) ->  )
//    }
    
}
