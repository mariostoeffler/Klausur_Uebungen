package org.campus02.arrays.vererbung;

import java.util.Collections;
import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer{

    @Override
    public void analyze() {
        String firstName ="";
        String lastName = "";
        HashSet<Integer> salary = new HashSet<>();
        for (Person person : persons) {
            salary.add(person.getSalary());
            firstName = person.getFirstname();
            lastName = person.getLastname();
        }
        System.out.println("Das höchste Gehalt mit " + Collections.max(salary) + " hat " + firstName + " " + lastName);

    }
}
