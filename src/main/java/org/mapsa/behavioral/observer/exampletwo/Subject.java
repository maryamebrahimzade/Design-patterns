package org.mapsa.behavioral.observer.exampletwo;

public interface Subject {
    void register(Observer obj); //methods to register and unregister observers
    void unregister(Observer obj);
    void notifyObservers(); //method to notify observers of change
    Object getUpdate(Observer obj); //method to get updates from subject
}
