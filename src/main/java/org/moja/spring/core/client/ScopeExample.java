package org.moja.spring.core.client;

import org.moja.spring.core.pojo.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Message message = (Message) context.getBean("message", Message.class);
        message.setId(1001);
        message.setMessage("Hello!!");
        System.out.println(message.getId() + " - " + message.getMessage());

        Message message1 = (Message) context.getBean("message", Message.class);
        System.out.println(message1.getId() + " - " + message1.getMessage());
        ((AbstractApplicationContext) context).close();
    }
}
