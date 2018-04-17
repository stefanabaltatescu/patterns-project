package api;

public interface ISubject {
    void addO(Observer o);
    void removeO(Observer o);
    void notifyObservers();
    void setState(String state);
    String getState();
}
