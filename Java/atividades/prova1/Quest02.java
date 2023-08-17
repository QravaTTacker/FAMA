package atividades.prova1;

import java.util.Random;

public class Quest02 {
    public static void main(String[] args) {
        ArrayDiv vetor = new ArrayDiv(10);
        vetor.show();
        vetor.pares();
        vetor.impares();
        vetor.div(3);
        vetor.div(7);
        vetor.primos();
    }
}

class ArrayDiv {

    private final String R = "\033[31;1m";
    private final String G = "\033[32;1m";
    private final String N = "\033[m";
    private final int MIN = 1;
    private final int MAX = 900;

    private int[] array;
    private int size;

    public ArrayDiv(int size) {
        if (size > 0) {
            Random rand = new Random();
            this.array = new int[size];
            this.setSize(size);
            for (int i = 0; i < this.size; i++) {
                this.array[i] = rand.nextInt(MIN, MAX + 1);
            }
            System.out.println(G + "Create Array" + N);
        } else {
            throw new IllegalArgumentException(R + "Tamanho inválido :/" + N);
        }
    }

    public void show() {
        String body = "[";
        for (int i = 0; i < this.size - 1; i++)
            body += (Integer.toString(this.array[i]) + ", ");
        body += Integer.toString(this.array[this.size - 1]) + "]";
        System.out.println(body);
    }

    private void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void pares() {
        this.div(2);
    }

    public void impares() {
        this.notDiv(2);
    }

    public void div(int value) {
        System.out.println("------------------- Divisíveis por " + value);
        String div = "[";
        for (int i : this.array)
            if (i % value == 0)
                div += (i + ", ");
        if (div.length() > 1)
            div = div.substring(0, div.length() - 2);
        div += "]";
        System.out.println(div);
    }

    public void notDiv(int value) {
        System.out.println("------------------- Não divisíveis por " + value);
        String div = "[";
        for (int i : this.array)
            if (i % value != 0)
                div += (i + ", ");
        if (div.length() > 1)
            div = div.substring(0, div.length() - 2);
        div += "]";
        System.out.println(div);
    }

    public void primos() {
        System.out.println("------------------- Primos");
        String div = "[";
        for (int i : this.array)
            if (this.ehPrimo(i))
                div += (i + ", ");
        if (div.length() > 1)
            div = div.substring(0, div.length() - 2);
        div += "]";
        System.out.println(div);
    }

    private boolean ehPrimo(int value) {
        for (int i = 2; i < value; i++)
            if (value % i == 0)
                return false;
        return true;
    }
}
