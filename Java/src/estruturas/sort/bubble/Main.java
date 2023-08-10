package sort.bubble;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String RED = "\033[38;2;255;30;0;1m";
    private static final String ORANGE = "\033[38;2;255;130;0;1m";
    private static final String GREEN = "\033[38;2;30;230;0;1m";
    private static final String LIGHT_GREEN = "\033[38;2;30;150;0;1m";
    private static final String YELLOW = "\033[38;2;255;202;133;1m";
    private static final String NULL = "\033[m";

    private static final int SIZE = 15_000;
    private static final int FATOR_ITERADOR = 10;

    private static long inicio = 0l;
    private static long fim = 0l;
    private static long tempo = 0l;
    private static long compara = 0l;
    private static long troca = 0l;
    private static long comparaTotal = 0l;
    private static long trocaTotal = 0l;
    private static long tempoTotal = 0l;

    public static void main(String[] args) throws Exception {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        byte op = 3;
        String exit = "";
        String resp = "";
        String respLogs = "";
        boolean enableLogs = false;
        do {
            limparTela();
            do {
                System.out.print("-".repeat(29)
                        + '\n' +
                        String.format("%-28s", "| Pior Caso.........[1]") + "|\n" +
                        String.format("%-28s", "| Melhor caso.......[2]") + "|\n" +
                        String.format("%-28s", "| Randômico.........[outro]") + "|\n" +
                        "-".repeat(29) +
                        "\n>>> ");
                try {
                    op = Byte.parseByte(exit = scanner.nextLine().trim());
                    System.out.print("Mostrar logs de cada iteração? [sim/não] \n>>> ");
                    respLogs = scanner.nextLine().trim();
                    enableLogs = (respLogs.equalsIgnoreCase("s")
                            || respLogs.equalsIgnoreCase("si")
                            || respLogs.equalsIgnoreCase("sim"))
                                    ? true
                                    : false;
                    break;
                } catch (NumberFormatException n) {
                    limparTela();
                    if (exit.equalsIgnoreCase("exit")) {
                        System.exit(0);
                    }
                    System.out.println("Erro : " + n.getMessage() + '\n' + "=".repeat(50));
                }
            } while (true);

            limparTela();

            System.out.println("=".repeat(50));
            exemploBubble(random, op, enableLogs); // Normal
            System.out.println("=".repeat(50));
            exemploUlt(random, op, enableLogs); // Último
            System.out.println("=".repeat(50));
            exemploFlag(random, op, enableLogs); // Flag

            try {
                System.out.print("\nSair? ");
                resp = scanner.nextLine().trim();
            } catch (Exception e) {
                System.out.println("Erro : " + e.getMessage() + '\n');
            }

        } while (!(resp.equalsIgnoreCase("s")
                || resp.equalsIgnoreCase("si")
                || resp.equalsIgnoreCase("sim")));
        scanner.close();
        limparTela();
    }

    private static void exemploBubble(Random random, byte op, boolean enableLogs) {
        int[] array = new int[SIZE];
        mostraTitulo(enableLogs, "<<< Bubble >>>");
        anularValores();
        for (int i = 0; i < FATOR_ITERADOR; i++) {
            resetArray(array, random, op);
            inicio = System.currentTimeMillis();
            bubble(array);
            fim = System.currentTimeMillis();
            tempoTotal += (tempo = fim - inicio);
            comparaTotal += compara;
            trocaTotal += troca;
            mostrarIterador(enableLogs, i, tempo, compara, troca);
        }
        if (!enableLogs)
            System.out.printf("\r[%s]\n", "#".repeat(48));
        mostrarResultados(array, enableLogs, tempoTotal, comparaTotal, trocaTotal, "<<< Bubble >>>");
    }

    private static void exemploUlt(Random random, byte op, boolean enableLogs) {
        int[] array = new int[SIZE];
        mostraTitulo(enableLogs, "<<< BubbleUlt >>>");
        anularValores();
        for (int i = 0; i < FATOR_ITERADOR; i++) {
            resetArray(array, random, op);
            inicio = System.currentTimeMillis();
            bubbleUlt(array);
            fim = System.currentTimeMillis();
            tempoTotal += (tempo = fim - inicio);
            comparaTotal += compara;
            trocaTotal += troca;
            mostrarIterador(enableLogs, i, tempo, compara, troca);
        }
        if (!enableLogs)
            System.out.printf("\r[%s]\n", "#".repeat(48));
        mostrarResultados(array, enableLogs, tempoTotal, comparaTotal, trocaTotal, "<<< BubbleUlt >>>");
    }

    private static void exemploFlag(Random random, byte op, boolean enableLogs) {
        int[] array = new int[SIZE];
        mostraTitulo(enableLogs, "<<< BubbleFlag >>>");
        anularValores();
        for (int i = 0; i < FATOR_ITERADOR; i++) {
            resetArray(array, random, op);
            inicio = System.currentTimeMillis();
            bubbleFlag(array);
            fim = System.currentTimeMillis();
            tempoTotal += (tempo = fim - inicio);
            comparaTotal += compara;
            trocaTotal += troca;
            mostrarIterador(enableLogs, i, tempo, compara, troca);
        }
        if (!enableLogs)
            System.out.printf("\r[%s]\n", "#".repeat(48));
        mostrarResultados(array, enableLogs, tempoTotal, comparaTotal, trocaTotal, "<<< BubbleFlag >>>");
    }

    private static void mostraTitulo(boolean enableLogs, String title) {
        if (enableLogs)
            System.out.println(GREEN + title + NULL);
        else
            System.out.print("[" + " ".repeat(48) + "]");
    }

    private static void mostrarIterador(boolean enableLogs, int i, long _tempo, long _compara, long _troca) {
        if (enableLogs) {
            System.out.println("=".repeat(15) + LIGHT_GREEN + " Iteração -> " + (i + 1) + NULL);
            System.out.printf("comparações: %,d\n", _compara);
            System.out.printf("trocas: %,d\n", _troca);
            int segundos = 0;
            if ((segundos = (int) _tempo / 1000) > 0) {
                int milissegundos = (int) _tempo % 1000;
                System.out.printf("tempo: %ds e %dms\n", segundos, milissegundos);
            } else {
                System.out.printf("tempo: %d ms\n", _tempo);
            }
        } else {
            System.out.printf("\r[%s%s]", "#".repeat((48 / FATOR_ITERADOR) * (i + 1)),
                    " ".repeat(48 - (48 / FATOR_ITERADOR * (i + 1))));
        }
    }

    private static void mostrarResultados(int[] array, boolean enableLogs, long _tempo, long _compara, long _troca,
            final String title) {

        _tempo /= FATOR_ITERADOR;
        _compara /= FATOR_ITERADOR;
        _troca /= FATOR_ITERADOR;

        System.out.println("=".repeat(30) + " " + GREEN + title + NULL);
        if (enableLogs) {
            int i = 1;
            for (int key : array) {
                System.out.printf("%4d %c", key, (i++ % 20 == 0 ? '\n' : '\0'));
                if (i == 601)
                    break;
            }
            System.out.println('\0');
        }
        System.out.println(NULL + "=".repeat(30));

        System.out.format("Size: %,d\n", array.length);
        System.out.format("O(n²): %,d\n", (long) Math.pow(array.length, 2));
        System.out.format("Média de comparações: %s%,d%s\n", RED, _compara, NULL);
        System.out.format("Média de trocas: %s%,d%s\n", ORANGE, _troca, NULL);
        int segundos = 0;
        if ((segundos = (int) _tempo / 1000) > 0) {
            int milissegundos = (int) tempo % 1000;
            System.out.printf("Tempo: %s%ds e %dms%s\n", YELLOW, segundos, milissegundos, NULL);
        } else {
            System.out.printf("Tempo: %s%d ms%s\n", YELLOW, _tempo, NULL);
        }
    }

    private static void resetArray(int[] array, Random random, byte op) {
        for (int i = 0; i < SIZE; i++) {
            array[i] = 0 < op && op < 3
                    ? Math.abs((op == 1 ? (SIZE - 1) : 0) - i)
                    : random.nextInt(SIZE);
            // if (i < 10)
            // System.out.printf("%4d %c", array[i], (i++ % 20 == 0 ? '\n' : '\0'));
        }
    }

    private static void anularValores() {
        inicio = 0l;
        fim = 0l;
        tempo = 0l;
        compara = 0l;
        troca = 0l;
        tempoTotal = 0l;
        comparaTotal = 0l;
        trocaTotal = 0l;
    }

    private static void bubble(int[] array) {
        compara = 0l;
        troca = 0l;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                compara++;
                if (array[j] > array[j + 1]) {
                    troca++;
                    swap(array, j, (j + 1));
                }
            }
        }
    }

    private static void bubbleUlt(int[] array) {
        compara = 0l;
        troca = 0l;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                compara++;
                if (array[j] > array[j + 1]) {
                    troca++;
                    swap(array, j, (j + 1));
                }
            }
        }
    }

    private static void bubbleFlag(int[] array) {
        compara = 0l;
        troca = 0l;
        boolean swap = true;
        for (int i = 1; i < array.length; i++) {
            swap = false;
            for (int j = 0; j < array.length - i; j++) {
                compara++;
                if (array[j] > array[j + 1]) {
                    troca++;
                    swap(array, j, (j + 1));
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int aux;
        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    private static void limparTela() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
