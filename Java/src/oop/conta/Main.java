package conta;

public class Main {
    public static void main(String[] args) throws Exception {

        Conta conta = new Conta();
        conta.deposito(100);
        conta.deposito(550);
        System.out.println("Posso sacar? " + conta.saque(500));
        System.out.println("Posso sacar? " + conta.saque(150));
        System.out.println("Posso sacar? " + conta.saque(1));

    }
}
