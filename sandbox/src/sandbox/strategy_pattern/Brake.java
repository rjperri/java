package sandbox.strategy_pattern;

/**
 *
 * @author rjperri
 */
public class Brake implements IBrakeBehavior {

    @Override
    public void brake() {
        System.out.println("Screech >slip< >glide<, dang these normal breaks suck, better pump it!");
    }
    
}
