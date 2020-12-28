package org.moja.spring.core.client;

import org.moja.spring.core.pojo.History;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingExample {


    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("EventHandlingContext.xml");

        context.start();
        History history1 = context.getBean("history1", History.class);
        System.out.println(history1.toString());

        context.refresh();
        History history2 = (History) context.getBean("history2", History.class);
        System.out.println(history2.toString());

        context.stop();

        context.close();
    }
}
