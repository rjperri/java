package pkg01.strategy.pattern.ducks;

import pkg01.strategy.pattern.duckBehavior.FlyNoWayImpl;
import pkg01.strategy.pattern.duckBehavior.MuteImpl;

/**
 *
 * @author rjperri
 */
public class RocketDuck extends Duck {

    public RocketDuck() {
        super.setFlyBehavior(new FlyNoWayImpl());
        super.setQuackBehavior(new MuteImpl());
    }

    @Override
    public void display() {
        System.out.println("I look like a rocket with a beak");
    }

}
