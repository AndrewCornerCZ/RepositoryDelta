package org.example.observer;

import com.google.inject.Singleton;

import javax.security.auth.Subject;

public class MyTopicSubscriber implements Observer {
    public String name;
    public MyTopic topic;
    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("MyTopicSubscriber " + name);
    }

    @Override
    public void setSubject(MyTopic myTopic) {
        this.topic = myTopic;
    }
}
