package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class QuakRocketImpl implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("BAMMMMMMM!!!!");
    }

}
