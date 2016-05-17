package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class FlyNoWayImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
    
}
