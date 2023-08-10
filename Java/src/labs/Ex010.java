package labs;

import java.util.Scanner;
import java.nio.charset.Charset;

public class Ex010 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("Default console encoding: " + defaultCharset.displayName());
        while (true) {
            try {
                System.out.println("--------------------------------------");
                System.out.print("Digite seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite sua idade: ");
                int idade = Integer.parseInt(scanner.nextLine());
                System.out.print("Digite seu peso: ");
                float peso = Float.parseFloat(scanner.nextLine());
                System.out.print("Digite sua altura: ");
                double altura = Double.parseDouble(scanner.nextLine());
                System.out.print("É fumante? (true/false): ");
                boolean fumante = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("--------------------------------------");
                System.out.format("Seu nome é \u001b[31;1m%s\u001b[0m %n", nome);
                System.out.format("Sua idade é \u001b[32;1m%d\u001b[0m %n", idade);
                System.out.format("Seu peso é \u001b[33;1m%.2f\u001b[0m %n", peso);
                System.out.format("Sua altura é \u001b[34;1m%.2f\u001b[0m %n", altura);
                System.out.format("É fumante? \u001b[35;1m%b\u001b[0m %n", fumante);
                System.out.println("--------------------------------------");
                scanner.close();
                break;
            } catch (NumberFormatException formatErro) {
                // %varS --> var (tamAscii/2) + (tamStr/2);
                // 38/2 + 18/2 = 28
                System.out.println("---------------------------");
                System.out.format("\u001b[31;1m%28s\u001b[m\n", "Erro de formatação");
                System.out.println("Tente Novamente...");
            }
        }
        /*
         * NumberFormatException é uma exceção lançada quando uma operação de conversão
         * de ‘string’ para um tipo numérico é feita, mas a ‘string’ não contém um
         * formato válido
         * para o tipo numérico esperado. Por exemplo, ao usar o método
         * Integer.parseInt() para
         * converter uma ‘string’ que não representa um número inteiro válido, como
         * "abc", a exceção
         * NumberFormatException será lançada.
         * 
         * try{
         * ...
         * } catch (NumberFormatException formatErro){
         * System.out.println("Erro de formatação --> ‘string’ para dado convertido");
         * }
         *
         * InputMismatchException, por outro lado, é uma exceção lançada pelo objeto
         * Scanner
         * quando ele encontra um token de entrada que não corresponde ao (categoria)
         * dado esperado.
         * Por exemplo, se você estiver usando o método nextInt() do Scanner para ler um
         * número inteiro,
         * mas o próximo token de entrada não for um número inteiro válido, a exceção
         * InputMismatchException
         * será lançada.
         * 
         * import java.util.InputMismatchException;
         * try{
         * ...
         * } catch (InputMismatchException valueErro){
         * System.out.println("Erro de conversão --> dado para int");
         * }
         */
    }
}
