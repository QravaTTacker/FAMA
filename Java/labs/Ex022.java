package labs;

import java.util.Random;

public class Ex022 {

    public static void main(String[] args) throws Exception {

        Random random = new Random();

        final int SIZE = 3;

        int[][] arr1 = new int[SIZE][SIZE];
        int[][] arr2 = new int[SIZE][SIZE];
        int[][] soma = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                arr1[i][j] = random.nextInt(9);
                arr2[i][j] = random.nextInt(9);
                soma[i][j] = arr1[i][j] + arr2[i][j];
            }

            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", arr1[i][j]);
            }
            System.out.print(i == (int) SIZE / 2 ? "   + " : "     ");

            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", arr2[i][j]);
            }
            System.out.print(i == (int) SIZE / 2 ? "   = " : "     ");

            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", soma[i][j]);
            }
            System.out.println();
        }
    }
}
