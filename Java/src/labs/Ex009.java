package labs;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) throws Exception {
        // Testando tipos em Java...
        try {
            Scanner inputInt = new Scanner(System.in);
            Scanner inputStr = new Scanner(System.in);
            Scanner inputFloat = new Scanner(System.in);
            Scanner inputBool = new Scanner(System.in);

            System.out.print("Nome: ");
            String nome = inputStr.nextLine();

            System.out.print("Idade: ");
            int idade = inputInt.nextInt();

            System.out.print("Peso (kg): ");
            float peso = inputFloat.nextFloat();

            System.out.print("Casado? [true or false]: ");
            boolean casado = inputBool.nextBoolean();

            System.out.format("| %d | %s | %.2fkg | %b |", idade, nome, peso, casado);

            inputInt.close();
            inputStr.close();
            inputFloat.close();
            inputBool.close();

        } catch (Exception valueError) {
            System.out.println("\033[31mErro de conversão :/\033[m");
        }
    }
}
