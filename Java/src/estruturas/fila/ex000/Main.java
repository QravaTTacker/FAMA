package fila.ex000;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue fila = new Queue(3);
        System.out.println(fila.toString());
        fila.enQueue(1); // Adiciona 1
        System.out.println(fila.toString());
        fila.enQueue(2); // Adiciona 2
        System.out.println(fila.toString());
        fila.enQueue(3); // Adiciona 3
        System.out.println(fila.toString());
        fila.deQueue(); // Remove 1
        System.out.println(fila.toString());
        fila.deQueue(); // Remove 2
        System.out.println(fila.toString());
        fila.deQueue(); // Remove 3
        System.out.println(fila.toString());
        // fila = []
        System.out.println("=".repeat(30));
        fila.enQueue(4); // Adiciona 4
        System.out.println(fila.toString());
        fila.enQueue(5); // Adiciona 5
        System.out.println(fila.toString());
        fila.deQueue(); // Remove 4
        System.out.println(fila.toString());
        fila.enQueue(6); // Adiciona 6
        System.out.println(fila.toString());
        System.out.println("=".repeat(50));
        showStack();
    }

    private static void showStack() {
        Random random = new Random();
        Queue filaD = new Queue(5);
        while (!filaD.isFull()) {
            System.out.println(filaD.toString());
            filaD.enQueue(random.nextInt(1, 10));
        }
        while (!filaD.isEmpty()) {
            System.out.println(filaD.toString());
            filaD.deQueue();
        }
        System.out.println(filaD.toString());
    }
}
