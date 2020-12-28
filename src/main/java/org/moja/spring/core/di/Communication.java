package org.moja.spring.core.di;

public class Communication {

    private Messaging messaging;

//    public Communication(Messaging messaging) {
//        this.messaging = messaging;
//    }

    public void setMessaging(Messaging messaging) {
        this.messaging = messaging;
    }

    public void comminucate() {
        messaging.sendMessage();
    }
}
