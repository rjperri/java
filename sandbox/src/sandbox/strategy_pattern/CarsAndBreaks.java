
package sandbox.strategy_pattern;

/**
 *
 * @author rjperri
 */
public class CarsAndBreaks {

    public static void stopTheCars() {
        Car sedanCar = new Sedan();
        sedanCar.applyBrake(); 
        
        Car suvCar = new SUV();
        suvCar.applyBrake();
        
        //set break dynamically
        suvCar.setBrakeBehavior(new Brake());
        suvCar.applyBrake();
    }
    
}
