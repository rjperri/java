package wumpushunter.language;

/**
 *
 * @author rjperri
 */
public class ExitAction implements Action {

    @Override
    public void performAction(Noun noun) {
        System.out.println("Okay, we'll see ya latron");
    }

}
