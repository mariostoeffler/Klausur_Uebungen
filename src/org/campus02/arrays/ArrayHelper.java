package org.campus02.arrays;

public class ArrayHelper {

    public static void arrangeOrder (int[] numbers) {
        boolean nextLoopNecessary = true;
        while (nextLoopNecessary) {
            nextLoopNecessary = false;
        for (int i = 0; i < numbers.length-1; i++) {
            int left = numbers[i];
            int right = numbers[i+1];
                if(left > right) {
                    numbers[i] = right;
                    numbers[i + 1] = left;
                    nextLoopNecessary = true;
                }
            }
        }
    }
}
