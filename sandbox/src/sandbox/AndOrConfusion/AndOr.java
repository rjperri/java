package sandbox.AndOrConfusion;

/**
 *
 * @author rjperri
 */
public class AndOr {

    public static boolean LogicalAnd(boolean a, boolean b) {
        return a && b;
    }
    
    public static boolean LogicalOr(boolean a, boolean b) {
        return a || b;
    }
    
    public static int bitwiseAnd(int a, int b) {
        return a & b;
    }
    
    public static int bitwiseOr(int a, int b) {
        return a | b;
    }

    public static String booleanAnd(boolean a, int x, int y) {
        if(a & (x == y++)) {
            return "Inside: " + y;
        } 
        return "Outside: " + y;
    }
    
    public static String booleanOr(boolean a, int x, int y) {
        if(a | (x == y++)) {
            return "Inside: " + y;
        } 
        return "Outside: " + y;
    }   
    
}
