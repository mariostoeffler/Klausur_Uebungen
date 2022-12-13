package UE_Strings;

public class UE1 {

    public static void main(String[] args) {

    }

    public static void changeString(String given) {
        String temp;
        char[] c = given.toCharArray();
        char[] d = new char[c.length];

        for (int i = 0; i < given.length(); i++) {
            if (c[i] == ' ') {
                d[i] = ' ';
                d[i+1] = Character.toUpperCase(c[i+1]);
                i++;

            } else {
                d[i] = c[i];
            }
        }
        temp = String.valueOf(d);
        System.out.println(temp);
    }
}