package pkg01.strategy.pattern.ducks;

import pkg01.strategy.pattern.duckBehavior.FlyWithWingsImpl;
import pkg01.strategy.pattern.duckBehavior.QuakImpl;

/**
 *
 * @author rjperri
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super.setFlyBehavior(new FlyWithWingsImpl());
        super.setQuackBehavior(new QuakImpl());
    }
    
    @Override
    public void display() {
        System.out.println("Looks like a Mallard Duck");
    }

}
