package org.campus02.arrays.vererbung;

public class GenderAnalyzer extends PersonAnalyzer{
    
    public void analyze() {
        int countM = 0;
        int countW = 0;
        int heightM = 0;
        int heightW = 0;
        for (Person person : getPersons()) {
            if (person.getGender() == 'M') {
                countM++;
                heightM = heightM + person.getSize();
            }
            if (person.getGender()=='F') {
                countW++;
                heightW = heightW + person.getSize();
            }
        }
        System.out.println("There are " + countM + " men with a average height of " + (heightM/countM) + " cm");
        System.out.println("There are " + countW + " women with a average height of " + (heightM/countW) + " cm");
    }


}
