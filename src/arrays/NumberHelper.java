package arrays;

import java.util.Arrays;

public class NumberHelper {

    public static boolean isSortedArray(int[] numbers) {


            if (numbers[1] > numbers[0] && numbers[numbers.length] > numbers[1])
                return true;
            else return false;
    }

   /* public static int[] removeDuplicates(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] != numbers. {
                newNumbers[i] = numbers[i];
            }
            else  {
                newNumbers[i] = -1;
            }
        }
        return newNumbers;
    }*/
}
