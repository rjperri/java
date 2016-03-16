package sandbox.codewars_solutions;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 *
 * @author rjperri
 */
public class BackWardsPrime {

    private static Predicate<Long> isPrime = (Long num) -> {
        if (num < 2) return false;
        if ((num == 2) || (num == 3)) return true;
        if ((num%2 == 0) || (num%3 == 0)) return false;
        Long max = (long) Math.sqrt(num) + 1;
        for (Long i = 6L; i <= max; i+= 6) {
            if((num%(i-1) == 0) || (num%(i+1) == 0)) return false;
        }
        return true;
    };
    
    private static Function<Long, Long> reverseNum = (Long num) -> {
        StringBuilder revString = (new StringBuilder(num.toString())).reverse();
        return Long.valueOf(revString.toString());
    };
    
    private static Predicate<Long> isNotAPalindrome = (Long num) -> num != (reverseNum.apply(num)).longValue();
    
    private static Predicate<Long> isReversePrime = (Long num) -> isPrime.test(reverseNum.apply(num));
    
    public static String backwardsPrime(long start, long end) {
        
        return LongStream.rangeClosed(start, end)
                .boxed()
                .filter(isPrime)
                .filter(isNotAPalindrome)
                .filter(isReversePrime)
                .map((num) -> num.toString())
                .collect(Collectors.joining(" "));
        
    }
    
}
