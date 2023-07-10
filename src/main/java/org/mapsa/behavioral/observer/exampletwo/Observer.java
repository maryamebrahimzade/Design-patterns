package org.mapsa.behavioral.observer.exampletwo;

public interface Observer {
     void update();    //method to update the observer, used by subject
     void setSubject(Subject sub); //attach with subject to observe
}
