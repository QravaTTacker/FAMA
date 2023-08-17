package fibonacci;

import java.util.ArrayList;
import java.util.List;

public final class Fibonacci {

    // Valores da sequência de Fibonacci.
    private static long termFib;
    private static long termA;
    private static long termB;

    // Metainformações da classe.
    private static int size;
    private static int aux;

    // Estrutura para armazenar os valores da sequência de Fibonacci.
    private static List<Long> valores;

    // Método construtor com tamanho definido.
    public Fibonacci(final int SIZE) {
        Fibonacci.valores = new ArrayList<>();
        Fibonacci.setTermA(1);
        Fibonacci.setTermB(1);
        Fibonacci.setAux(0);
        this.setValues(SIZE);
    }
    
    // Método construtor com tamanho pré-definido.
    public Fibonacci() { this(2); }
    
    
    /** 
     * @param SIZE
     * @return int
     */
    // Métodos publics: Mostram o tamanho da sequência, último termo e uma lista dos valores, respectivamente.
    public int length() { return Fibonacci.valores.size(); }
    public long getLastTerm() { return this.length() > 0 ? Fibonacci.valores.get(this.length() - 1) : 0; }
    public static List<Long> getValores() { return valores; }
    
    // Métodos privados: Apenas para acesso e modificação dos valores da classe.
    private static int getSize() { return Fibonacci.size; }
    private static int getAux() { return Fibonacci.aux; }
    private static long getTermA() { return Fibonacci.termA; }
    private static long getTermB() { return Fibonacci.termB; }
    private static long getTermFib() { return Fibonacci.termFib; }
    private static void setSize(final int VALUE) { Fibonacci.size = VALUE; }
    private static void setAux(final int VALUE) { Fibonacci.aux = VALUE; }
    private static void setTermA(final long VALUE) { Fibonacci.termA = VALUE; }
    private static void setTermB(final long VALUE) { Fibonacci.termB = VALUE; }
    private static void setTermFib(final long VALUE) { Fibonacci.termFib = VALUE; }
    
    // Define o tamanho da sequência de Fibonacci.
    public boolean setValues(final int SIZE) {
        // Restaura todos os valores.
        if (SIZE == 0) {
            Fibonacci.setSize(SIZE);
            Fibonacci.setAux(SIZE);
            Fibonacci.setTermA(1);
            Fibonacci.setTermB(1);
            Fibonacci.valores.removeAll(Fibonacci.valores);
            return true;
        }
        if (SIZE <= 100) {
            Fibonacci.size = SIZE;
            Fibonacci.calcule();
            return true;
        }
        return false;
    }

    // Define a sequência de valores: Permite aumentar e diminuir conforme a entrada de valores.
    private static void calcule() {
        while (Fibonacci.getSize() > Fibonacci.getAux()) {
            Fibonacci.valores.add(Fibonacci.getTermA());
            Fibonacci.setTermFib(Fibonacci.getTermA() + Fibonacci.getTermB());
            Fibonacci.setTermA(Fibonacci.getTermB());
            Fibonacci.setTermB(Fibonacci.getTermFib());
            Fibonacci.aux++;
        }
        while (Fibonacci.getSize() < Fibonacci.getAux() && Fibonacci.valores.size() > 1) {
            Fibonacci.valores.remove(Fibonacci.valores.size() - 1);
            Fibonacci.setTermFib(Fibonacci.getTermA());
            Fibonacci.setTermA(Fibonacci.getTermB() - Fibonacci.getTermFib());
            Fibonacci.setTermB(Fibonacci.getTermFib());
            Fibonacci.aux--;
        }
    }

    // Método para exibição do objeto Fibonacci.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(valores.toString());
        sb.append(String.format(" -> len(%d) : %,d", this.length(), this.getLastTerm()));
        return sb.toString();
    }
    
}
