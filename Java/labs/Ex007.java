package labs;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um valor: ");
            int valor = scan.nextInt();
            System.out.printf("Você digitou %d", valor);
        } catch (Exception valueErrException) {
            System.out.println("Digite um valor inteiro!");
        }
    }
}
