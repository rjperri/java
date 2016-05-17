package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class FlyGonnaFlyImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Gonna Fly Now!");
    }

}
