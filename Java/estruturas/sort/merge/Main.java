package sort.merge;

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

    private static void printAndSort(int[] array) {
        System.out.println(Arrays.toString(array));
        merge(array);
        System.out.println(Arrays.toString(array));
    }

    private static void merge(int[] array) {
        merge(array, 0, array.length - 1);
    }

    private static void merge(int[] array, int start, int end) {
        if (start < end) {
            int middle = (end + start) / 2;
            merge(array, start, middle);
            merge(array, middle + 1, end);

            int[] left = new int[middle - start + 1];
            int[] right = new int[end - middle];

            int l = 0;
            int r = 0;

            while (l < left.length) left[l] = array[l++ + start];
            while (r < right.length) right[r] = array[r++ + middle + 1];

            l = r = 0;
            int k = start;
            while (l < left.length && r < right.length)
                array[k++] = left[l] < right[r]
                        ? left[l++]
                        : right[r++];

            while (l < left.length) array[k++] = left[l++];
            while (r < right.length) array[k++] = right[r++];
        }
    }

}
