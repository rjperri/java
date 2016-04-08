package sandbox.AndOrConfusion;

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
public class AndOrTest {

    /**
     * Test of LogicalAnd method, of class AndOr.
     */
    @Test
    public void testLogicalAnd() {
        assertTrue(AndOr.LogicalAnd(true, true));
        assertFalse(AndOr.LogicalAnd(true, false));
        assertFalse(AndOr.LogicalAnd(false, true));
    }

    /**
     * Test of LogicalOr method, of class AndOr.
     */
    @Test
    public void testLogicalOr() {
        assertTrue(AndOr.LogicalOr(true, false));
    }
    
    public void testBitwiseAnd() {
        assertEquals(4, AndOr.bitwiseAnd(5, 12));
    }

    public void testBitwiseOr() {
        assertEquals(15, AndOr.bitwiseOr(5, 12));
    }

    public void testBooleanAnd() {
        assertEquals("Inside: 4", AndOr.booleanAnd(true, 4, 3));
        assertEquals("Outside: 4", AndOr.booleanAnd(false, 4, 3));
    }

    public void testBooleanOr() {
        assertEquals("Inside: 4", AndOr.booleanOr(true, 4, 3));
        assertEquals("Inside: 4", AndOr.booleanOr(false, 4, 3));
        assertEquals("Ouside: 5", AndOr.booleanOr(false, 4, 4));
    }
    
}
