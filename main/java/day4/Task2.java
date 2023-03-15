package day4;

import java.util.Random;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[100];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] += random.nextInt(10000) + 1;
        }
        int max = arrays[0];
        int min = arrays[0];
        int countZeroNumber = 0;
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) max = arrays[i];
            if (arrays[i] < min) min = arrays[i];
            if (arrays[i] % 10 == 0) {
                sum += arrays[i];
                countZeroNumber++;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(countZeroNumber);
        System.out.println(sum);
    }
}
