package org.example.observer;

import com.google.inject.Inject;

public class TestObserver {

    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer myTopicSubscriber1 = new MyTopicSubscriber("Obs1");
        Observer myTopicSubscriber2 = new MyTopicSubscriber("Obs2");
        Observer myTopicSubscriber3 = new MyTopicSubscriber("Obs3");

        topic.register(myTopicSubscriber1);
        topic.register(myTopicSubscriber2);
        topic.register(myTopicSubscriber3);

        topic.postMessage("NEW SUBSCRIBER");

    }
}
