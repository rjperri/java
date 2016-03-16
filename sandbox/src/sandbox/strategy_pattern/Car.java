
package sandbox.strategy_pattern;

/**
 *
 * @author rjperri
 */
public abstract class Car {
    
    protected IBrakeBehavior brakeBehavior;
    
    public void applyBrake() {
        brakeBehavior.brake();
    }
    
    public void setBrakeBehavior(IBrakeBehavior brakeBehavior) {
        this.brakeBehavior = brakeBehavior;
    }
    
}
