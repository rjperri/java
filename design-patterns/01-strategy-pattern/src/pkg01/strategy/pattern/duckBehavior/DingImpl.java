package pkg01.strategy.pattern.duckBehavior;

/**
 *
 * @author rjperri
 */
public class DingImpl implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Wha, yous, wann wring da bell. hDing, Ding. >It's the eye of the tiger...<");
    }

}
