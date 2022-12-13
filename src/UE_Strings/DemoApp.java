package UE_Strings;

public class DemoApp {

    public static void main(String[] args) {
        String neu1 = "das ist ein test";

        UE1.changeString(neu1);

        CSVParser csvParser = new CSVParser("das,ist,doch,ein,test,verdammt!");

        System.out.println(csvParser.countComma());



    }
}
