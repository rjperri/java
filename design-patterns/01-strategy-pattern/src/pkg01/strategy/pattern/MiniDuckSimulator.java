
package pkg01.strategy.pattern;

import pkg01.strategy.pattern.duckBehavior.FlyRocketImpl;
import pkg01.strategy.pattern.duckBehavior.QuakRocketImpl;
import pkg01.strategy.pattern.ducks.DecoyDuck;
import pkg01.strategy.pattern.ducks.MallardDuck;
import pkg01.strategy.pattern.ducks.RocketDuck;
import pkg01.strategy.pattern.ducks.Duck;
import pkg01.strategy.pattern.ducks.RockyDuck;

/**
 *
 * @author rjperri
 */
public class MiniDuckSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mallard Duck");
        Duck mallard = new MallardDuck();
        mallard.swim();
        mallard.display();
        mallard.performFlyBehavior();
        mallard.performQuakBehavior();
        System.out.println("-------------------------------------");
        
        System.out.println("Rocky Duck");
        Duck rocky = new RockyDuck();
        rocky.swim();
        rocky.display();
        rocky.performFlyBehavior();
        rocky.performQuakBehavior();
        System.out.println("-------------------------------------");

        System.out.println("Decoy Duck");
        Duck decoy = new DecoyDuck();
        decoy.swim();
        decoy.display();
        decoy.performFlyBehavior();
        decoy.performQuakBehavior();
        System.out.println("-------------------------------------");

        System.out.println("Rocket Duck");
        Duck rocket = new RocketDuck();
        rocket.swim();
        rocket.display();
        rocket.performFlyBehavior();
        rocket.performQuakBehavior();
        System.out.println("----Ignition------");
        rocket.setFlyBehavior(new FlyRocketImpl());
        rocket.setQuackBehavior(new QuakRocketImpl());
        rocket.performQuakBehavior();
        rocket.performFlyBehavior();
        System.out.println("-------------------------------------");
    }
    
}
