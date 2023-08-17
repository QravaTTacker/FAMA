package labs;

import java.util.Random;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) throws Exception  {
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Tamanho do vetor: ");
                int[] vet = new int[Math.abs(scan.nextInt())];
                Random rand = new Random();
                for (int i = 0; i < vet.length; i++) {
                    vet[i] = rand.nextInt(50);
                    System.out.printf("vet[%d] = %d\n", i, vet[i]);
                }
                scan.close();
                break;
            } catch (Exception valueErroException) {
                System.out.println("Digite um valor inteiro :/\n");
            }
        }
        System.out.print("Fim de execução!");
    }
}
