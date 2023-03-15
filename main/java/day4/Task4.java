package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrays = new int[100];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] += random.nextInt(10000) + 1;
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < arrays.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arrays[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;

            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
