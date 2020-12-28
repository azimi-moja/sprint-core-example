package org.moja.spring.core.client;

import org.moja.spring.core.pojo.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringExample {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringContext.xml");

        City city = (City) context.getBean("city", City.class);

        System.out.println(city.toString());

        if (city.getProvince() != null) {
            System.out.println(city.getProvince().toString());
        }


        ((AbstractApplicationContext) context).close();
    }
}
