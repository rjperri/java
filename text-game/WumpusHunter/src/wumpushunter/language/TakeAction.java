package wumpushunter.language;

/**
 *
 * @author rjperri
 */
public class TakeAction implements Action {

    @Override
    public void performAction(Noun noun) {
        System.out.println("Thal hast taketh ye " + noun.getIdentity());
    }

}
