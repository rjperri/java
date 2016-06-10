package wumpushunter;

/**
 *
 * @author rjperri
 */
public class Take extends Verb {

    public Take(String name) {
        super(name);
    }

    public Take() {
        super("take");
    }

    @Override
    public void performAction() {
        System.out.println("Ye have taketh thy object");
    }

}
