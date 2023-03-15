package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 >= number2) {
            System.out.println("Некорректный ввод");
        }
        number1 += 1;
        while (number1 < number2) {
            if (number1 % 5 == 0 && number1 % 10 != 0) {
                System.out.print(number1 + " ");
            }
            number1++;
        }
    }
}
