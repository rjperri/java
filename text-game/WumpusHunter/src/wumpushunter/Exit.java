package wumpushunter;

/**
 *
 * @author rjperri
 */
public class Exit extends Verb {

    public Exit(String name) {
        super(name);
    }

    public Exit() {
        super("exit");
    }
    
    @Override
    public void performAction() {
        System.out.println("Okay have fun!");
    }

}
