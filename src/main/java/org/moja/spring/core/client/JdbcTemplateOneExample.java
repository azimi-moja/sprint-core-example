package org.moja.spring.core.client;

import org.moja.spring.core.entity.Request;
import org.moja.spring.core.entity.RequestPerson;
import org.moja.spring.core.pojo.City;
import org.moja.spring.core.pojo.Student;
import org.moja.spring.core.pojo.UserDetails;
import org.moja.spring.core.service.impl.RequestPersonServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateOneExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("JdbcTemplateOneContext.xml");

        RequestPersonServiceImpl requestPersonService = context.getBean("requestPersonServiceImpl", RequestPersonServiceImpl.class);

        RequestPerson person = new RequestPerson();
        person.setFirstName("Moja");
        person.setLastName("Azimi Vaghar");

        requestPersonService.saveRequestPerson(person);
    }
}
