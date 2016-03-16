package sandbox.codewars_solutions;

import java.util.Arrays;

/**
 *
 * @author rjperri
 */
public class ShellGame {

    public static Integer findTheBall(Integer position, Integer[][] swaps){
        return Arrays.stream(swaps)
                     .reduce(position, 
                            (Integer pos, Integer[] swap) -> {
                                if (pos.equals(swap[0])) return swap[1];
                                else if (pos.equals(swap[1])) return swap[0];
                                else return pos;
                            }, 
                            (a,b) -> a);
    }
    
}
