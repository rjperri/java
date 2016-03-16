
package sandbox.strategy_pattern;

/**
 *
 * @author rjperri
 */
public class Sedan extends Car {
    
    public Sedan() {
        this.brakeBehavior = new Brake();
    }
    
}
