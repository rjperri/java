package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class FlyRocketImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("BLAST OFF!!!!");
    }

}
