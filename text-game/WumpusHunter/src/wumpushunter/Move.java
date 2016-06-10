package wumpushunter;

/**
 *
 * @author rjperri
 */
public class Move extends Verb {

    public Move(String name) {
        super(name);
    }
    
    public Move() {
        super("move");
    }

    @Override
    public void performAction() {
        System.out.println("Thal hast moveth thy self around");
    }

}
