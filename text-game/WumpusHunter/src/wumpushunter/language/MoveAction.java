package wumpushunter.language;

/**
 *
 * @author rjperri
 */
public class MoveAction implements Action {

    @Override
    public void performAction(Noun noun) {
        System.out.println("Thal hast moveth thyselfth " + noun.getIdentity());
    }

}
