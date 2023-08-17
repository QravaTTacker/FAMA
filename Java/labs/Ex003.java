package labs;

public class Ex003 {
    public static void main(String[] args) throws Exception {
        Integer var = 5;
        System.out.printf("var = %d\n", var);
        System.out.format("var = %d\n", ++var);
        System.out.format("var = %s\n", --var);
        System.out.printf("var = %s\n", --var);
        System.out.println("Fim!");

        // System.out.printf("var = %i\n", var++);
        // Com o %i dá erro de formatação.
    }
}
