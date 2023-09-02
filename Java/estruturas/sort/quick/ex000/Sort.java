package sort.quick.ex000;

class Sort {

    private static int index_pivo;
    private static int aux;

    public final static int MIDDLE = 0;
    public final static int START = 1;
    public final static int END = 2;

    private Sort() {
    }

    public static boolean quicksort(int[] array, int op) {
        if (array == null)
            return false;
        if (array.length <= 1)
            return false;

        switch (op % 3) {
            case Sort.MIDDLE:
                Sort.quicksort_middle(array, 0, array.length - 1);
                break;
            case Sort.START:
                Sort.quicksort_start(array, 0, array.length - 1);
                break;
            case Sort.END:
                Sort.quicksort_end(array, 0, array.length - 1);
                break;
        }
        return true;
    }

    private static void quicksort_middle(int[] array, int start, int end) {
        if (start < end) {
            Sort.index_pivo = partition_middle(array, start, end);
            Sort.quicksort_middle(array, start, index_pivo - 1);
            Sort.quicksort_middle(array, index_pivo + 1, end);
        }
    }

    private static void quicksort_start(int[] array, int start, int end) {
        if (start < end) {
            index_pivo = partition_start(array, start, end);
            Sort.quicksort_start(array, start, index_pivo - 1);
            Sort.quicksort_start(array, index_pivo + 1, end);
        }
    }

    private static void quicksort_end(int[] array, int start, int end) {
        if (start < end) {
            index_pivo = partition_end(array, start, end);
            Sort.quicksort_end(array, start, index_pivo - 1);
            Sort.quicksort_end(array, index_pivo + 1, end);
        }
    }

    private static int partition_middle(int[] array, int start, int end) {
        int i = start;
        int middle = (end + start) / 2;
        Sort.swap(array, end, middle);
        for (int j = start; j < end; j++)
            if (array[j] < array[end])
                Sort.swap(array, i++, j);
        Sort.swap(array, i, end);
        return i;
    }

    private static int partition_start(int[] array, int start, int end) {
        int i = end;
        int pivo = array[start];
        for (int j = end; j > start; j--)
            if (array[j] > pivo)
                Sort.swap(array, i--, j);
        Sort.swap(array, i, start);
        return i;
    }

    private static int partition_end(int[] array, int start, int end) {
        int i = start;
        int pivo = array[end];
        for (int j = start; j < end; j++)
            if (array[j] < pivo)
                Sort.swap(array, i++, j);
        Sort.swap(array, i, end);
        return i;
    }

    private static void swap(int[] array, int a, int b) {
        Sort.aux = array[a];
        array[a] = array[b];
        array[b] = Sort.aux;
    }

}
