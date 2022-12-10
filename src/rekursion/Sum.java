package rekursion;

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(6);
        integers.add(8);

        iterativeSum(integers);
    }

    public static void iterativeSum(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = a.get(i) + sum;
        }
        System.out.println("Die Summe beträgt " + sum);
    }
}
