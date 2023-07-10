package org.mapsa.behavioral.observer.exampleone;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers=new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObserver() {
       for(Observer observer:observers){
           observer.update();
       }
    }
}
