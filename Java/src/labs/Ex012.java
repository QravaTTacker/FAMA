package labs;

import java.util.Random;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String tam;
        do {
            System.out.print("Número de posições: ");
            tam = scanner.nextLine().trim();
            try {
                int[] vet = new int[Math.abs(Integer.parseInt(tam))];
                int maior = 0, menor = 0, soma = 0;
                maior = menor = soma = 0;
                for (int i = 0; i < vet.length; i++) {
                    vet[i] = rand.nextInt(1, 101);
                    System.out.format("vet[%d] = %d\n", i, vet[i]);
                    maior = (maior < vet[i] || i == 0) ? vet[i] : maior;
                    menor = (menor > vet[i] || i == 0) ? vet[i] : menor;
                    soma += vet[i];
                }
                System.out.println("-".repeat(20));
                System.out.format("Soma: %d\nMédia: %.2f", soma, (float) soma / vet.length);
                System.out.format("\nMaior: %d\nMenor: %d", maior, menor);
                System.out.format("\nTamanho do vetor: %d\n", vet.length);
                System.out.println("-".repeat(20));
                scanner.close();
                break;
            } catch (NumberFormatException valueErro) {
                System.out.println("-".repeat(20));
                System.out.format("É inválido o dado:\n\n\033[31;1m\"%s\"\033[m\n\n", tam);
                System.out.println("-".repeat(20));
            }
        } while (true);
    }
}
