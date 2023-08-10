package labs;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex008 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        try {
            int numeroInteiro = scanner.nextInt();
            System.out.println("O inteiro digitado foi: " + numeroInteiro);
            scanner.close();
        } catch (InputMismatchException valueErro) {
            System.out.println("Você digitou um dado diferente de um número inteiro :/");
            System.out.println("Erro: " + valueErro);
        }
    }
}
