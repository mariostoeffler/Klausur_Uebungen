package rekursion;

public class PalindromChecker {

    public static void main(String[] args) {
        System.out.println(fakultaet(4));

        System.out.println();
        System.out.println(check("1rotor"));
    }

 public static boolean check(String palindrom) {
        palindrom = palindrom.toLowerCase();
        char firstChar = palindrom.charAt(0);
        char lastChar = palindrom.charAt(palindrom.length()-1);

        if (palindrom.length()<=1) {
            return true;
        }

        if (!Character.isLetter(firstChar)) {
            String newPalindrom = palindrom.substring(1);
            return check(newPalindrom);
        }

        if(!Character.isLetter(lastChar)) {
            String newPalindrom = palindrom.substring(palindrom.length()-1);
            return check(newPalindrom);
        }

        if (firstChar==lastChar) {
            String newPalindrom = palindrom.substring(1,palindrom.length()-1);
            return check(newPalindrom);
        }
        return false;
 }

    public static int fakultaet(int zahl) {
        if(zahl == 1) {
            return zahl;

        } else
        return zahl * fakultaet(zahl -1);
    }
}
