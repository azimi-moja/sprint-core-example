package org.moja.spring.core.client;

import org.moja.spring.core.pojo.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsContextExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationContext.xml");

        City city = context.getBean("city", City.class);
        System.out.println(city.toString());

        if (city.getProvince() != null) {
            System.out.println(city.getProvince().toString());
        }
    }
}
