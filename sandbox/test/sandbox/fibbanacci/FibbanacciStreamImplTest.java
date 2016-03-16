
package sandbox.fibbanacci;

import sandbox.fibbanacci.Fibbanacci;
import sandbox.fibbanacci.FibbanacciStreamImpl;
import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rjperri
 */
public class FibbanacciStreamImplTest {
    
    private Fibbanacci fib = new FibbanacciStreamImpl();
    
    @Test
    public void testGetFibWith0() {
        assertEquals(BigInteger.ZERO, fib.getFib(0));
    }
    
    @Test
    public void testGetFibWith1() {
        assertEquals(BigInteger.ONE, fib.getFib(1));
    }
    
    @Test
    public void testGetFibWith2() {
        assertEquals(BigInteger.ONE, fib.getFib(2));
    }

    @Test
    public void testGetFibWith3() {
        assertEquals(new BigInteger("2"), fib.getFib(3));
    }
    
    @Test
    public void testGetFibWith10() {
        assertEquals(new BigInteger("55"), fib.getFib(10));
    }
    
    @Test
    public void testGetFibWith30() {
        assertEquals(new BigInteger("832040"), fib.getFib(30));
    }
    
    @Test
    public void testGetFibWith50() {
        assertEquals(new BigInteger("12586269025"), fib.getFib(50));
    }
    
    @Test
    public void testGetFibWith100() {
        assertEquals(new BigInteger("354224848179261915075"), fib.getFib(100));
    }    
}
