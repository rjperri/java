package pkg02.observer.pattern;

/**
 *
 * @author rjperri
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
