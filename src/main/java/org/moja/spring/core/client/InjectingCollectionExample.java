package org.moja.spring.core.client;

import org.moja.spring.core.pojo.OrgInfo;
import org.moja.spring.core.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class InjectingCollectionExample {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionApplicationContext.xml");

        OrgInfo info = (OrgInfo) context.getBean("orgInfo", OrgInfo.class);

        String[] names = info.getNames();
        for (String name : names) {
            System.out.println("Name -> " + name);
        }
        System.out.println("------------------------------");

        List<String> positions = info.getPositions();
        for (String pos : positions) {
            System.out.println("Position -> " + pos);
        }
        System.out.println("------------------------------");

        Set<Integer> ids = info.getIds();
        for (Integer id : ids) {
            System.out.println("ID -> " + id);
        }
        System.out.println("------------------------------");

        Map<Integer, String> levels = info.getLevels();
        for (Integer level : levels.keySet()) {
            System.out.println("LevelsKey -> " + level + ", LevelsValue -> " + levels.get(level));
        }
        System.out.println("------------------------------");

        Properties key = info.getKey();
        System.out.println("PropertyName -> " + key.getProperty("name"));
        System.out.println("PropertyAge -> " + key.getProperty("age"));
        System.out.println("------------------------------");

        Person[] arrPerson = info.getArrPerson();
        for (Person person : arrPerson) {
            System.out.println(person.toString());
        }
        System.out.println("------------------------------");

        List<Person> personList = info.getListOfPersons();
        for (Person person : personList) {
            System.out.println(person.toString());
        }
        System.out.println("------------------------------");

        Set<Person> personSet = info.getSetOfPerson();
        for (Person person : personSet) {
            System.out.println(person.toString());
        }
        System.out.println("------------------------------");

        Map<Integer, Person> personMap = info.getMapOfPerson();
        for (Integer level : personMap.keySet()) {
            System.out.println(personMap.get(level).toString());
        }
        ((AbstractApplicationContext) context).close();
    }
}
