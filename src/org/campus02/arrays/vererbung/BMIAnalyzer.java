package org.campus02.arrays.vererbung;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {

    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    private double calcBMI(Person p) {
        Double bmi = (p.getWeight() / ((p.getSize() / 100.0) * (p.getSize() / 100.0)));
        return bmi;
    }

    public void analyze() {
        for (Person person : persons) {
            double bmi = calcBMI(person);
            System.out.println("person = " + person + " " + calcBMI(person));
            //Pair<Person, Double> personDoublePair = new Pair<person, bmi>();
            result.add(new Pair<>(person, bmi));
        }
    }

}
