package org.moja.spring.core.client;

import org.moja.spring.core.entity.RequestPerson;
import org.moja.spring.core.service.impl.RequestPersonServiceImpl;
import org.moja.spring.core.service.impl.RequestPersonServiceImplWithHibernate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HibernateTemplateExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("HibernateTemplateContext.xml");

        RequestPersonServiceImplWithHibernate requestPersonService = context.getBean("requestPersonService", RequestPersonServiceImplWithHibernate.class);

        //Add request person into mysql
        RequestPerson newPerson = new RequestPerson();
        newPerson.setFirstName("Moja");
        newPerson.setLastName("Azimi Vaghar");

        requestPersonService.saveRequestPerson(newPerson);

        //Fetch all Persons
        List<RequestPerson> allRequestPersons = requestPersonService.getAllRequestPersons();
        System.out.println("List of all request Person : ");
        for (RequestPerson person : allRequestPersons) {
            System.out.println(person.toString());
        }
    }
}
