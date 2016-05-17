
package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class FlyWithWingsImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
    
}
