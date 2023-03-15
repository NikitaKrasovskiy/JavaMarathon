package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j]  += random.nextInt(50);
            }
        }
        for (int[] anArr : matrix) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + "\t");
            }
            System.out.println();
        }
    }
}
