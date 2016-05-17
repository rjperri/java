package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class MuteImpl implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silent But Deadly");
    }

}
