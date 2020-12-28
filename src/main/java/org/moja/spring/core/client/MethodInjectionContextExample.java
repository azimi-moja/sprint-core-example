package org.moja.spring.core.client;

import org.moja.spring.core.di.method.Ticket;
import org.moja.spring.core.di.method.TicketVendingMachine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInjectionContextExample {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("MethodInjectionContext.xml");

        TicketVendingMachine tvm = context.getBean("ticketVendingMachine", TicketVendingMachine.class);
        Ticket ticket = tvm.generateTicket();
        System.out.println(ticket.printTicket());
        ((AbstractApplicationContext) context).close();
    }
}
