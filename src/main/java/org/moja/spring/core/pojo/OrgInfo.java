package org.moja.spring.core.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class OrgInfo {

    private String[] names = new String[3];
    private List<String> positions;
    private Set<Integer> ids;
    private Map<Integer, String> levels;
    private Properties key;

    private Person[] arrPerson = new Person[3];
    private List<Person> listOfPersons;
    private Set<Person> setOfPerson;
    private Map<Integer, Person> mapOfPerson;


    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

    public Set<Integer> getIds() {
        return ids;
    }

    public void setIds(Set<Integer> ids) {
        this.ids = ids;
    }

    public Map<Integer, String> getLevels() {
        return levels;
    }

    public void setLevels(Map<Integer, String> levels) {
        this.levels = levels;
    }

    public Properties getKey() {
        return key;
    }

    public void setKey(Properties key) {
        this.key = key;
    }

    public Person[] getArrPerson() {
        return arrPerson;
    }

    public void setArrPerson(Person[] arrPerson) {
        this.arrPerson = arrPerson;
    }

    public List<Person> getListOfPersons() {
        return listOfPersons;
    }

    public void setListOfPersons(List<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }

    public Set<Person> getSetOfPerson() {
        return setOfPerson;
    }

    public void setSetOfPerson(Set<Person> setOfPerson) {
        this.setOfPerson = setOfPerson;
    }

    public Map<Integer, Person> getMapOfPerson() {
        return mapOfPerson;
    }

    public void setMapOfPerson(Map<Integer, Person> mapOfPerson) {
        this.mapOfPerson = mapOfPerson;
    }
}
