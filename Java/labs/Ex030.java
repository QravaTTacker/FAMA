package labs;

import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        System.out.print("\033[2J\033[H");

        Scanner s = new Scanner(System.in);

        float litros = 0F;
        float km = 0F;
        float media = 0F;
        float mediaTotal = 0F;
        byte vezes = (byte) 0;

        do {
            try {
                System.out.print("Entre com os litros consumidos (-1 para finalizar): ");
                litros = Float.parseFloat(s.nextLine().replace(" ", ""));
                if (litros == -1) {
                    break;
                }
                System.out.print("Entre com os km percorridos: ");
                km = Float.parseFloat(s.nextLine().replace(" ", ""));
                media = km / litros;
                mediaTotal += media;
                vezes++;
                System.out.printf("taxa km/litro para esse tanque foi %,.2f\n\n", media);
            } catch (Exception e) {
                System.out.print("\033[2J\033[H");
                System.out.printf("Erro: %s\n", e.getMessage());
            }
        } while ((int) litros != -1);

        System.out.printf("A taxa total de km/litro foi: %,.2f\n", mediaTotal / vezes);
        s.close();
    }
}
