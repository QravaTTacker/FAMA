package fibonacci;

import java.util.List;
import java.util.Random;

public final class Main {

    
    /** 
     * @param args
     */
    public static void main(String... args) {
        System.out.print("\033[2J\033[H");

        Fibonacci f = new Fibonacci();
        Random r = new Random();

        final String NULL = "\033[m";
        final int SIZE = 10;
        int aux = SIZE;

        for (int i = 0; i < SIZE * 2 - 1; i++) {
            f.setValues(SIZE - Math.abs(--aux));
            System.out.printf("\033[3%d;1m%s%s\n", r.nextInt(1, 7), f, NULL);
        }
        List<Long> valores = Fibonacci.getValores();
        valores.add(13L);
        System.out.print(valores);
    }
}
