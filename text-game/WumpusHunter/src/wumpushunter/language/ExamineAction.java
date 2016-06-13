package wumpushunter.language;

/**
 *
 * @author rjperri
 */
public class ExamineAction implements Action {

    @Override
    public void performAction(Noun noun) {
        System.out.println("Thal hast examined ye " + noun.getIdentity() + " with great concern.");
    }

}
