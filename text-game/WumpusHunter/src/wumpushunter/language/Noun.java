package wumpushunter.language;

/**
 *
 * @author rjperri
 */
public class Noun {
    
    private String identity;

    public Noun(String name) {
        this.identity = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

}
