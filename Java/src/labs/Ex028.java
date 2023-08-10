package labs;

public class Ex028 {

    private static final int SIZE = 8;

    public static void main(String[] args) {

        System.out.print("\033[2J\033[H");
        fibonacci(SIZE);
    }

    private static void fibonacci(final int size) {

        int t1 = 0;
        int t2 = 1;
        int fib = 0;

        for (int i = 0; i < size; i++) {
            fib = t1 + t2;
            System.out.printf("%d ", fib);
            t1 = t2;
            t2 = fib;
        }
    }
}
