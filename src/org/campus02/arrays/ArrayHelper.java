package org.campus02.arrays;

public class ArrayHelper {

    public static void arrangeOrder (int[] numbers) {
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[-1])
                continue;
            if (numbers[i] > numbers[i-1])
                numbers[i] = numbers[i-1];
        }
    }
}
