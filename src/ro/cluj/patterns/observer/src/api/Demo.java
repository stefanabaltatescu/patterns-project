package api;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        List<Observer> observers = new ArrayList<>();
        
        ISubject subject = new Subject(observers);
        
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        
        subject.addO(observer1);
        subject.addO(observer2);
        
        subject.setState("Some random state");
        
        subject.removeO(observer1);

        subject.setState("Hello World state!");
        
        
    }
}
