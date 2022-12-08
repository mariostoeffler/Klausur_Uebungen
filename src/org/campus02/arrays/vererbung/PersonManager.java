package org.campus02.arrays.vererbung;

import java.util.ArrayList;

public class PersonManager {

    ArrayList<Person> persons = new ArrayList<>();

    public PersonManager() {
    }

    public void add(Person p) {
        persons.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        a.setPersons(persons);
        a.analyze();
    }
}
