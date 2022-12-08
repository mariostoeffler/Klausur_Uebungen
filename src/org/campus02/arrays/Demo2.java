package org.campus02.arrays;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {
        int[] help = {1,3,2,6,7,9,2,11,26,13,15,10};

        ArrayHelper.arrangeOrder(help);
        System.out.println(Arrays.toString(help));
    }
}
