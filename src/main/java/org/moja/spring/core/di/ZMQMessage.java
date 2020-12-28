package org.moja.spring.core.di;

public class ZMQMessage implements Messaging{

    public void sendMessage() {
        System.out.print("ZMQ is printing");
    }

}
