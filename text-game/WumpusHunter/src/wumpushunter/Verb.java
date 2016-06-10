package wumpushunter;

/**
 *
 * @author rjperri
 */
public abstract class Verb {
    
    private String name;

    public Verb(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void performAction();
    
}
