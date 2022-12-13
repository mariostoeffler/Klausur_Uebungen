package UE_Strings;

public class CSVParser {

    private String konstr;
    private String csvline;

    public CSVParser(String konstr) {
        this.konstr = konstr;
        csvline = konstr;
    }

    public int countComma() {
        int count=0;

        for (int i = 0; i < csvline.length() ; i++) {
            if (csvline.charAt(i)==',')
                count++;
        }
        return count;

    }

    public String[] parse() {
        for (int i = 0; i < csvline.length() ; i++) {

        }
    }



}
