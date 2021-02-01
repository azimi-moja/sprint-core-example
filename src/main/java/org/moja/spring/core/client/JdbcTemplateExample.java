package org.moja.spring.core.client;

import org.moja.spring.core.entity.Request;
import org.moja.spring.core.entity.RequestPerson;
import org.moja.spring.core.pojo.City;
import org.moja.spring.core.pojo.Student;
import org.moja.spring.core.pojo.UserDetails;
import org.moja.spring.core.service.impl.RequestPersonServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("JdbcTemplateOneContext.xml");

        RequestPersonServiceImpl requestPersonService = context.getBean("requestPersonServiceImpl", RequestPersonServiceImpl.class);

        //Add request person into mysql
        /*
        RequestPerson person = new RequestPerson();
        person.setFirstName("Moja");
        person.setLastName("Azimi Vaghar");

        requestPersonService.saveRequestPerson(person);
        */

        //Fetch one Person
        RequestPerson requestPersonById = requestPersonService.getRequestPersonById(1);
        System.out.println(requestPersonById.toString());

        //Fetch all Persons
        List<RequestPerson> allRequestPersons = requestPersonService.getAllRequestPersons();
        System.out.println("List of all request Person : ");
        for (RequestPerson person : allRequestPersons) {
            System.out.println(person.toString());
        }
    }
}
