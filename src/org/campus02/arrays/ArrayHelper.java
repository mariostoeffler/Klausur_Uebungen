package org.campus02.arrays;

public class ArrayHelper {

    public static void arrangeOrder (int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0)
                continue;
            while (numbers[i - 1] > numbers[i]) {
                    temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
            }
            numbers[i] = numbers[i];
        }
    }
}
