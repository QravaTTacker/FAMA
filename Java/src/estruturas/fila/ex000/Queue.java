package fila.ex000;

public class Queue {

    private Object[] queue; // Um coleção unidimensional com dados genéricos.
    private int head; // Posição para remover elementos no começo (cabeça).
    private int tail; // Posição para adicionar elementos no final (cauda).
    private int countElements; // Quantidade de elementos.

    public Queue(int size) {
        if (size > 0) {
            this.queue = new Object[size];
            this.head = 0;
            this.tail = 0;
            this.countElements = 0;
        } else {
            throw new IllegalArgumentException("Valor de tamanho inválido");
        }
    }

    public void enQueue(Object element) {
        if (!isFull()) {
            this.countElements++;
            this.queue[this.tail] = element;
            if (++this.tail == length()) {
                this.tail = 0;
            }
        } else {
            throw new IllegalArgumentException("Estouro de memória");
        }
    }

    public Object deQueue() {
        if (!isEmpty()) {
            this.countElements--;
            Object value = this.queue[this.head];
            this.queue[this.head] = null;
            if (++this.head == length()) {
                this.head = 0;
            }
            return value;
        } else {
            throw new IllegalArgumentException("Fila vazia");
        }
    }

    // * lookHead()
    // * lookTail()

    // * Sujeito a otimização :/
    @Override
    public String toString() {
        StringBuilder bodyQueue = new StringBuilder("[");
        // bodyQueue = [1.2.
        for (int i = 0; i < length() - 1; i++) {
            if (index(i) != null) {
                bodyQueue.append(index(i)).append(".");
            }
        }
        // Se o tamanho dele for igual a 2 indica que: "[x." é valido.
        if (bodyQueue.length() > 2) {
            bodyQueue.delete(bodyQueue.length() - 1, bodyQueue.length());
        }
        /*
         * aux recebe a string do bodyQueue com a substituição dos pontos pelo ", "
         * através do método replace()
         */
        final String aux = bodyQueue.toString().replace(".", ", ");
        // Remove todo o conteúdo de bodyQueue.
        bodyQueue.delete(0, bodyQueue.length());
        // Adiciona a string aux ao bodyQueue, mas dessa vez, formatado.
        bodyQueue.append(aux);
        // Add o último índice se ele não for null e a queue não estiver vazia.
        if (!isEmpty() && (index(length() - 1) != null)) {
            // Se temos dois valores na queue e deve-se adicionar um separador.
            if (realLength() > 1) {
                bodyQueue.append(", ");
            }
            bodyQueue.append(index(length() - 1));
        }
        // Por último fecha o bodyQueue com "]" e retorna uma string.
        return bodyQueue.append("]").toString();
    }

    public int length() {
        return (this.queue).length;
    }

    public int realLength() {
        return this.countElements;
    }

    public boolean isEmpty() {
        return this.countElements == 0;
    }

    public boolean isFull() {
        return this.countElements == length();
    }

    private Object index(int i) {
        return this.queue[i];
    }
}
