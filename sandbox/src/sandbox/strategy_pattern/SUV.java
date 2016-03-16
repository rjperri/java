
package sandbox.strategy_pattern;

/**
 *
 * @author rjperri
 */
public class SUV extends Car {
    
    public SUV() {
        this.brakeBehavior = new BrakeABS();
    }
    
}
