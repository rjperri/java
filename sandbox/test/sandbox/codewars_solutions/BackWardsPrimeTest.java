
package sandbox.codewars_solutions;

import sandbox.codewars_solutions.BackWardsPrime;
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
public class BackWardsPrimeTest {
    
    @Test
    public void backWardsPrime13() {        
        assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrime(1, 100));
    }
    @Test
    public void backWardsPrime21() {        
        assertEquals("9923 9931 9941 9967", BackWardsPrime.backwardsPrime(9900, 10000));
    }
        @Test
    public void backWardsPrime24() {        
        assertEquals("701 709 733 739 743 751 761 769", BackWardsPrime.backwardsPrime(701, 800));
    }
}
