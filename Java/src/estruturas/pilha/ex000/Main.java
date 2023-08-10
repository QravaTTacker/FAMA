package pilha.ex000;

import java.util.Random;

public class Main {

    static Random random = new Random();
    static int valor = 0;

    public static void main(String[] args) throws Exception {
        popVsPeek();
        popLoop();
        showStack();
    }

    private static void showStack() {
        Stack filaD = new Stack(5);
        while (!filaD.isFull()) {
            System.out.println(filaD.toString());
            filaD.push(random.nextInt(1, 10));
        }
        while (!filaD.isEmpty()) {
            System.out.println(filaD.toString());
            filaD.pop();
        }
        System.out.println(filaD.toString());
    }

    private static void popVsPeek() {

        Stack pilhaA = new Stack(4);

        pilhaA.push(1);
        System.out.println(pilhaA.pop());
        pilhaA.push(2);
        System.out.println(pilhaA.pop());
        pilhaA.push(3);
        System.out.println(pilhaA.pop());
        pilhaA.push(4);
        System.out.println(pilhaA.pop());
        System.out.println("Size: " + pilhaA.realLength());

        System.out.println("-".repeat(15));
        Stack pilhaB = new Stack(4);

        pilhaB.push(1);
        System.out.println(pilhaB.peek());
        pilhaB.push(2);
        System.out.println(pilhaB.peek());
        pilhaB.push(3);
        System.out.println(pilhaB.peek());
        pilhaB.push(4);
        System.out.println(pilhaB.peek());
        System.out.println("Size: " + pilhaB.realLength());

        System.out.println("=".repeat(50));
    }

    private static void popLoop() {

        Stack pilhaC = new Stack(4);
        System.out.println(pilhaC.peek());

        // Loop infinito
        while (!pilhaC.isFull()) {
            valor = random.nextInt(1, 9);
            pilhaC.push(valor);
            System.out.format("pilhaC.push(%d) -> size = %d || pilhaC.pop() = %d -> size = %d \n",
                    valor,
                    pilhaC.realLength(),
                    pilhaC.peek(), // Fica retirando o tempo inteiro um elemento (método ideal: peek())
                    pilhaC.realLength());
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                throw new IllegalArgumentException(ex);
            }
        }
        System.out.println("pilhaC.isFull(): " + pilhaC.isFull());
        System.out.println(pilhaC.toString());
        System.out.println("=".repeat(50));
    }
}
