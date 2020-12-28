package org.moja.spring.core.di;

public class ActiveMQMessage implements Messaging{

    public void sendMessage() {
        System.out.print("ActiveMQ is printing");
    }

}
