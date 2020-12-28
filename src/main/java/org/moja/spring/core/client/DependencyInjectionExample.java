package org.moja.spring.core.client;

import org.moja.spring.core.di.Communication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Communication communication = (Communication) context.getBean("communication", Communication.class);
        communication.comminucate();
        ((AbstractApplicationContext) context).close();
    }
}
