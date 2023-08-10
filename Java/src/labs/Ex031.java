package labs;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            var valor = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < valor; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
