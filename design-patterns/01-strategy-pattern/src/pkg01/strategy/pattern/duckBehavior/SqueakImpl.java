package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class SqueakImpl implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("SQEUAK! SQUAEK!");
    }

}
