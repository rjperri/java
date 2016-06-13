package wumpushunter.language;

/**
 *
 * @author rjperri
 */
public class Verb {
    
    private String identity;
    
    private Action action;

    public Verb(String name, Action action) {
        this.identity = name;
        this.action = action;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
    
    public void performAction(Noun noun) {
        action.performAction(noun);
    }
    
}
