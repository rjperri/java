
package sandbox.strategy_pattern;

/**
 *
 * @author rjperri
 */
public class BrakeABS implements IBrakeBehavior {

    @Override
    public void brake() {
        System.out.println("Chugga Chugga Chugga, >grip< What the heck was that? Oh it was my ABS kicking in!");
    }
    
}
