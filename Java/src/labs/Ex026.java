package labs;

import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        float age = sc.nextFloat();
        // String name2 = sc.nextLine();
        // System.out.printf("Nome 1: %s\nNome 2: %s\nIdade: %d\n", name, name2, age);
        // System.out.printf("Nome 1: %s\nIdade: %f\n", name, age);
        System.out.printf("Idade: %f\n", age);

        // float height = sc.nextFloat();
        sc.close();
    }
}
