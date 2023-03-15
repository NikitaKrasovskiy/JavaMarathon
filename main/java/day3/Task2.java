package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            double number = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number2 == 0) {
                break;
            }
            System.out.println(number / number2);
        }
    }
}
