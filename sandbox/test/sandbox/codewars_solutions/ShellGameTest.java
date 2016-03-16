package sandbox.codewars_solutions;

import sandbox.codewars_solutions.ShellGame;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rjperri
 */
public class ShellGameTest {

    /**
     * Test of findTheBall method, of class TheShellGame.
     */
    @Test
    public void testFindTheBallEmptyNoSwaps() {
        assertEquals(new Integer(5), ShellGame.findTheBall(5, new Integer[0][2]));
    }
    
    @Test
    public void testFindTheBall0and2() {
        Integer[][] swaps = {{0,1}, {2,1}, {0,1}};
        assertEquals(new Integer(2), ShellGame.findTheBall(0, swaps));
    }   
    
    @Test
    public void testFindTheBall3and5() {
        Integer[][] swaps = {{3,9}, {7,8}, {5,9}};
        assertEquals(new Integer(5), ShellGame.findTheBall(3, swaps));
    } 
    
    @Test
    public void testFindTheBall5and5() {
        Integer[][] swaps = {{5,6}, {5,6}, {6,5}, {6,5}};
        assertEquals(new Integer(5), ShellGame.findTheBall(5, swaps));
    }  
    
    @Test
    public void testFindTheBall50and743() {
        Integer[][] swaps = {{50, 30}, {50, 999}, {999, 75}, {75, 30}, 
                             {75, 103}, {65, 1}, {1, 999}, {999, 67}, 
                             {103, 65}, {103, 47}, {47, 65}, {47, 65},
                             {47, 65}, {65, 64}, {65, 3}, {3, 2}, {1, 5},{47, 1}, 
                             {1, 90}, {90, 1}, {1, 90}, {5, 7}, {7, 5}, 
                             {63, 90}, {1001, 63}, {933, 1001}, {36, 933}, {36, 25}, 
                             {25, 743}, {25, 67}, {67, 45}, {742, 745}, {50, 9}};
        assertEquals(new Integer(743), ShellGame.findTheBall(50, swaps));
    }
    
    @Test
    public void testFindTheBall54and29() {
        Integer[][] swaps = {{50, 30}, {50, 999}, {999, 75}, {75, 30}, 
                             {75, 103}, {65, 1}, {1, 999}, {999, 67}, 
                             {103, 65}, {103, 47}, {47, 65}, {47, 65},
                             {47, 65}, {65, 64}, {65, 3}, {3, 2}, {1, 5},{47, 1},{54, 29},
                             {1, 90}, {90, 1}, {1, 90}, {5, 7}, {7, 5}, 
                             {63, 90}, {1001, 63}, {933, 1001}, {36, 933}, {36, 25}, 
                             {25, 743}, {25, 67}, {67, 45}, {742, 745}, {50, 9}};
        assertEquals(new Integer(29), ShellGame.findTheBall(54, swaps));
    }
}
