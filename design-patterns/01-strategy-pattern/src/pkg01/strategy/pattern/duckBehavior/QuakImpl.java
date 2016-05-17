package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class QuakImpl implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("QUAK!");
    }

}
