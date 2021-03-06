package org.moja.spring.core.client;

import org.moja.spring.core.pojo.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PNamespaceApplicationContextExample {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("PNamespaceContext.xml");

        Message message = (Message) context.getBean("message", Message.class);
        System.out.println(message.toString());
        ((AbstractApplicationContext) context).close();
    }
}
