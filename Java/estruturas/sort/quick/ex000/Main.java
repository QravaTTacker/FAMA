package sort.quick.ex000;

import java.util.Arrays;

final class Main {

    private final static int SIZE = 30;

    public static void main(String[] args) {
        System.out.print("\033[2J\033[H");

        int[] array = new int[SIZE];
        String[] ops = { "MIDDLE", "START", "END" };

        int op = 0;
        while (op < 3) {
            for (int i = 0; i < SIZE; i++) {
                array[i] = SIZE - i;// Pior caso
                // array[i] = i; // Já ordenado
                // array[i] = (int) (Math.random() * 20 - 1) + 1; // Randômico
            }
            System.out.printf("========================== %s\n", ops[op]);
            System.out.printf("%s\n", Arrays.toString(array));
            Sort.quicksort(array, op);
            System.out.printf("%s\n\n", Arrays.toString(array));
            op++;
        }
        // int[] a = null;
        // System.out.println(Sort.quicksort(a));
        // int[] ar = {};
        // System.out.println(Sort.quicksort(ar));
        // int[] arr = { 1 };
        // System.out.println(Sort.quicksort(arr));
        // int[] vet = { 2, 1 };
        // System.out.println(Sort.quicksort(vet));
        // System.out.printf("%s\n", Arrays.toString(vet));
    }
}
