package labs;

import java.util.Scanner;

class Ex006 {
    public static void main(String[] args) throws Exception {
        int a = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter your lucky number");
            a = scan.nextInt();
        }
        System.out.println("Your lucky number is: " + a);
    }
}
