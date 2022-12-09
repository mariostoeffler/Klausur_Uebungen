package org.campus02.arrays.vererbung;

import com.sun.jdi.Value;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{

    HashMap<String, Integer> result = new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        int countAUT = 0;
        int countDE = 0;
        int countCH = 0;
        int countSI = 0;
        for (Person person : persons) {
            if (person.getCountry().equals("AT"))
                countAUT++;
                result.put("AT", countAUT);
            if (person.getCountry().equals("DE"))
                countDE++;
                result.put("DE", countDE);
            if (person.getCountry().equals("CH"))
                countCH++;
                result.put("CH", countCH);
            if (person.getCountry().equals("SI"))
                countSI++;
                result.put("SI", countSI);
        }
        System.out.println(result.toString());
    }
}
