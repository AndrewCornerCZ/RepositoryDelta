package org.example.observer;

import javax.security.auth.Subject;

public interface Observer {

    public void update();
    public void setSubject(MyTopic myTopic);

}



