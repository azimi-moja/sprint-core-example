package org.moja.spring.core.client;

import org.moja.spring.core.pojo.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsContextExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationContext.xml");

        Message message = context.getBean("message", Message.class);

        System.out.println(message.toString());

    }
}
