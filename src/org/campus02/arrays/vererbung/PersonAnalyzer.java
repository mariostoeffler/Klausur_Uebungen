package org.campus02.arrays.vererbung;

import java.util.ArrayList;

public abstract class  PersonAnalyzer {
    ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public abstract void analyze();
}
