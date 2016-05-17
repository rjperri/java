package pkg01.strategy.pattern.ducks;

import pkg01.strategy.pattern.duckBehavior.FlyNoWayImpl;
import pkg01.strategy.pattern.duckBehavior.MuteImpl;

/**
 *
 * @author rjperri
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super.setFlyBehavior(new FlyNoWayImpl());
        super.setQuackBehavior(new MuteImpl());
    }
    
    @Override
    public void display() {
        System.out.println("Looks like a bloack of wood");
    }

}
