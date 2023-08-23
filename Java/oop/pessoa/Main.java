package pessoa;

public class Main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Cristian",
                "123.123.123.12",
                20,
                74.5f,
                true);
        pessoa1.status();
        System.out.println("-".repeat(10));
        pessoa2.status();
    }

}
