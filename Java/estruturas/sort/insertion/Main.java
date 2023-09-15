package sort.insertion;

import java.util.Arrays;

public class Main {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        System.out.print("\033[2J\033[H");

        int[] array = new int[SIZE];

        System.out.println("\nRANDOM VALUES");
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 10) + 1;

        printAndSort(array);

        System.out.println("\nINCREASING VALUES");
        for (int i = 0; i < array.length; i++)
            array[i] = SIZE - i;

        printAndSort(array);

        System.out.println("\nDECREASING VALUES");
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;

        printAndSort(array);

    }

    private static void insertion(int[] array) {
        int j = 0;
        int key = 0;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i;
            while (--j >= 0 && array[j] > key)
                array[j + 1] = array[j];
            array[j + 1] = key;
        }
    }

    private static void printAndSort(int[] array) {
        System.out.println(Arrays.toString(array));
        insertion(array);
        System.out.println(Arrays.toString(array));
    }
}
