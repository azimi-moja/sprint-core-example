package org.moja.spring.core.client;

import org.moja.spring.core.di.Communication;
import org.moja.spring.core.pojo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceExample {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Employee employee = (Employee) context.getBean("employee", Employee.class);
        System.out.print(employee.toString());
        ((AbstractApplicationContext) context).close();
    }
}
