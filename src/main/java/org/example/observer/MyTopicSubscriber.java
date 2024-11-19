package org.example.observer;

import javax.security.auth.Subject;

public class MyTopicSubscriber implements Observer {
    public String name;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("MyTopicSubscriber " + name);
    }

    @Override
    public void setSubject(Subject subject) {
        System.out.println("MyTopicSubscriber " + name);
    }
}
