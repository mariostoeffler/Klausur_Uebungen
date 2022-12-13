package org.campus02.komplett1.arrays;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        int[] intsOdd = {2, 1, 3, 4};
        int[] ints2 = {2, 1, 2, 4, -6, 2};

       // System.out.println(isSortedArray(ints));
      //  System.out.println(isSortedArray(intsOdd));
        System.out.println(Arrays.toString(ints2));

        removeDuplicates(ints2);




    }

    public static boolean isSortedArray(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] < 0)
                continue;

                for (int j = i+1; j < numbers.length ; j++) {
                    if (numbers[i]==numbers[j]) {
                        numbers[j] = -1;
                    }
                }


        }
        return numbers;
    }
}
