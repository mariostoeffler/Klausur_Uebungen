package org.campus02.arrays.vererbung;

import java.util.ArrayList;

public class PersonManager {

    @Override
    public String toString() {
        return "PersonManager{" +
                "persons=" + persons +
                '}';
    }

    ArrayList<Person> persons = new ArrayList<>();

    public PersonManager() {
    }

    public void addPerson(Person p) {
        persons.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        a.setPersons(persons);
        a.analyze();
    }
}
