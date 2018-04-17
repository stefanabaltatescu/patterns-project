package api;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    List<Observer> observers;
    String state;

    public Subject() {
        observers = new ArrayList<>();
    }

    public Subject(List<Observer> observers) {
        this.observers = observers;
    }

    public Subject(List<Observer> observers, String state) {
        this.observers = observers;
        this.state = state;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addO(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeO(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observers){
            obs.update();
        }
    }
}
