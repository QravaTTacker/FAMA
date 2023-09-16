package sort.quick.ex001;

import java.util.Arrays;

final class Main {

    private static final int SIZE = 10;

    public static void main(String... args) {
        System.out.print("\033[2J\033[H");

        int[] array = new int[SIZE];

        System.out.println("\nRANDOM VALUES");
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 10) + 1;

        printAndSort(array);

        System.out.println("\nINCREASING VALUES");
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;

        printAndSort(array);

        System.out.println("\nDECREASING VALUES");
        for (int i = 0; i < array.length; i++)
            array[i] = SIZE - i;

        printAndSort(array);
    }

    private static void quick(int[] array) {
        quick(array, 0, array.length - 1);
    }

    private static void quick(int[] array, int start, int end) {
        while (start < end) {
            swap(array, end, (end + start) / 2);
            int i = start;
            for (int j = start; j < end; j++)
                if (array[j] < array[end])
                    swap(array, j, i++);
            swap(array, i, end);
            quick(array, start, i - 1);
            start = i + 1;
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            array[i] ^= array[j];
            array[j] = array[i] ^ array[j];
            array[i] ^= array[j];
        }
    }

    private static void printAndSort(int[] array) {
        System.out.println(Arrays.toString(array));
        quick(array);
        System.out.println(Arrays.toString(array));
    }

}
