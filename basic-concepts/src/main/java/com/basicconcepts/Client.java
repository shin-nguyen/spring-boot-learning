package com.basicconcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
    @Autowired
    Notification notification;

    public void change(){
        notification.Notify();
    }

    public Client(Notification notification){
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
