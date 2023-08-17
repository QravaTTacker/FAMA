package atividades.prova1;

import java.util.Random;

public class Quest01 {
    public static void main(String[] args) throws Exception {
        Array vetor = new Array(15);
        System.out.println("Menor: " + vetor.getMenor());
        System.out.println("Maior: " + vetor.getMaior());
        System.out.println("Soma: " + vetor.getSoma());
        System.out.println("Media: " + vetor.getMedia());
        vetor.show();
    }
}

class Array {

    private final String R = "\033[31;1m";
    private final String G = "\033[32;1m";
    private final String N = "\033[m";
    private final int MIN = 1;
    private final int MAX = 950;

    private int[] array;
    private int size;
    private int menor;
    private int maior;
    private int soma;
    private double media;

    public Array(int size) {
        if (size > 0) {
            Random rand = new Random();
            this.array = new int[size];
            this.setSize(size);
            for (int i = 0; i < this.size; i++) {
                this.array[i] = rand.nextInt(MIN, MAX + 1);
            }
            this.setMenor();
            this.setMaior();
            this.setSoma();
            this.setMedia();
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

    private void setMenor() {
        this.menor = Integer.MAX_VALUE;
        for (int i : this.array)
            if (this.menor > i)
                this.menor = i;
    }

    private void setMaior() {
        this.maior = Integer.MIN_VALUE;
        for (int i : this.array)
            if (this.maior < i)
                this.maior = i;
    }

    private void setSoma() {
        this.soma = 0;
        for (int i : this.array)
            this.soma += i;
    }

    private void setMedia() {
        this.media = (double) this.soma / this.array.length;
    }

    public int getMenor() {
        return this.menor;
    }

    public int getMaior() {
        return this.maior;
    }

    public int getSoma() {
        return this.soma;
    }

    public double getMedia() {
        return this.media;
    }

    public int getSize() {
        return this.size;
    }
}
