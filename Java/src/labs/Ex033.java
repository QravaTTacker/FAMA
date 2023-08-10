package labs;

public class Ex033 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        for (;;) {
            Long[] ob = new Long[1__000_000];
            System.out.printf("Memória %,dMB\n",
                    (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
        }
    }
}
