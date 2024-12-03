package org.example.observer;

import java.util.ArrayList;

public class MyTopic implements Subject {
    public String message;
    public Boolean change;
    public final Object MUTEX = new Object();
    public ArrayList<Observer> observers = new ArrayList<>();

    public MyTopic() {}

    public void register(Observer o) {

        synchronized (MUTEX) {
            if (!observers.contains(o)) {
                o.setSubject(this);
                observers.add(o);
            }
        }
    }
    public void unregister(Observer o) {
        synchronized (MUTEX) {
            observers.remove(o);
            o.setSubject(null);
        }
    }
    public void notifyObservers() {
        synchronized (MUTEX) {
            if (!change)
            {
                return;
            }
            for (Observer o : observers) {
                System.out.println("Notifying observer: " + message);

            }
            this.change = false;
        }
    }
    public Object getUpdate(Observer o) {
        return message;
    }
    public void postMessage(String message) {
        change = true;
        this.message = message;
        notifyObservers();
    }
}
