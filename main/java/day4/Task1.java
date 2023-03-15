package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
          int len =   scanner.nextInt();
            int[] arrays = new int[len];

            for (int i = 0; i < arrays.length; i++) {
                arrays[i] += scanner.nextInt();
            }
            int count8 = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int sum = 0;
            System.out.println(arrays.length);
            for (int array : arrays) {
               if (array > 8) count8 += 1;
               if (array == 1) count1 += 1;
               if (array % 2 == 0) count2 += 1;
               else count3 += 1;
               sum += array;
            }
            System.out.println("Длина массива: " + arrays.length);
            System.out.println("Количество чисел больше 8:" + count8);
            System.out.println("Количество чисел равных 1: " + count1);
            System.out.println("Количество четных чисел: " + count2);
            System.out.println("Количество нечетных чисел: " + count3);
            System.out.println("Сумма всех элементов массива: " + sum);
        }

    }
}
