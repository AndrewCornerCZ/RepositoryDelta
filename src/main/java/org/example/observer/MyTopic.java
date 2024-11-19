package org.example.observer;

public class MyTopic implements Subject {
    public String message;
    public Boolean change;
    public Object MUTEX = new Object();

    public MyTopic() {}

    public void register(Observer o) {
        MUTEX = o;
        change = true;
    }
    public void unregister(Observer o) {
        MUTEX = null;
        change = false;
    }
    public void notifyObservers() {
        MUTEX = null;
    }
    public Object getUpdate(Observer o) {
        return MUTEX;
    }
    public void postMessage(String message) {
        this.message = message;
    }
}
