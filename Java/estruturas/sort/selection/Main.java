package sort.selection;

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
            array[i] = i + 1;

        printAndSort(array);

        System.out.println("\nDECREASING VALUES");
        for (int i = 0; i < array.length; i++)
            array[i] = SIZE - i;

        printAndSort(array);

    }

    private static void selection(int[] array) {
        int lessIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            lessIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[lessIndex])
                    lessIndex = j;
            if (lessIndex != i)
                swap(array, i, lessIndex);
        }
    }

    private static void swap(int[] array, final int A, final int B) {
        array[A] = array[A] ^ array[B];
        array[B] = array[A] ^ array[B];
        array[A] = array[A] ^ array[B];
    }

    private static void printAndSort(int[] array) {
        System.out.println(Arrays.toString(array));
        selection(array);
        System.out.println(Arrays.toString(array));
    }

}
