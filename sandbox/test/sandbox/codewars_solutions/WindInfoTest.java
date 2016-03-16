/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.codewars_solutions;

import sandbox.codewars_solutions.WindInfo;
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
public class WindInfoTest {
    
    /**
     * Test of message method, of class WindInfo.
     */
    @Test
    public void testMessage() {
        assertEquals("Headwind 15 knots. Crosswind 3 knots from your left.", WindInfo.message("18L", 170, 15));
        assertEquals("Headwind 10 knots. Crosswind 17 knots from your left.", WindInfo.message("22", 160, 20));
    }
    
    @Test
    public void testExtractHeadingOffsetWith18L() {
        assertEquals(180, WindInfo.extractHeading("18L"));
    }
    
    @Test
    public void testExtractHeadingOffsetWith22() {
        assertEquals(220, WindInfo.extractHeading("22"));
    }
    
}
