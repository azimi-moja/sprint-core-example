package org.moja.spring.core.client;

import org.moja.spring.core.di.factory.ATM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodInjectionContextExample {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("FactoryMethodContext.xml");

        ATM atm = context.getBean("atm" , ATM.class);

        atm.printedBalancedInformation("123456");
        ((AbstractApplicationContext) context).close();
    }
}
