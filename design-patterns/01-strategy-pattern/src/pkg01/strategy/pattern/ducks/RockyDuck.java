package pkg01.strategy.pattern.ducks;

import pkg01.strategy.pattern.duckBehavior.DingImpl;
import pkg01.strategy.pattern.duckBehavior.FlyGonnaFlyImpl;

/**
 *
 * @author rjperri
 */
public class RockyDuck extends Duck {

    public RockyDuck() {
        super.setFlyBehavior(new FlyGonnaFlyImpl());
        super.setQuackBehavior(new DingImpl());
    }

    @Override
    public void display() {
        System.out.println("Why does its face look like that?");
    }
    

}
