
package pkg01.strategy.pattern.ducks;

import pkg01.strategy.pattern.duckBehavior.FlyBehavior;
import pkg01.strategy.pattern.duckBehavior.QuackBehavior;

/**
 *
 * @author rjperri
 */
public abstract class Duck {
    
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("swimming");
    }
    
    public abstract void display();

    public void performFlyBehavior() {
        this.flyBehavior.fly();
    }

    public void performQuakBehavior() {
        this.quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    
    
}
