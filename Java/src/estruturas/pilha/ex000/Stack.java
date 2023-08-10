package pilha.ex000;

public class Stack {

    // * Dados de uma pilha
    private Object[] stack; // Um coleção unidimensional com dados genéricos.
    private final int size; // Tamanho da pilha.
    private int top; // Posição do top da pilha (responsável por adicionar ou remover elementos).
                     // Além disso, ela é sada como contagem de elementos.

    /**
     ** Cria uma Pilha baseada em um vetor de tamanho fixo. O objeto possui os
     ** seguintes métodos:
     ** 
     ** <p>
     * <b>{@link #push(Object)}: Adiciona um elemento no topo da pilha.
     ** <p>
     * <b>{@link #pop()}: Remove e retorna o valor que está no topo da pilha.
     ** <p>
     * <b>{@link #peek()}: Retorna o valor que está no topo da pilha.
     ** <p>
     * <b>{@link #toString()}: Mostra todos os elementos da pilha sem remove-los.
     ** <p>
     * <b>{@link #getSize() ()}: Verifica se a pilha está vazia.
     ** <p>
     * <b>{@link #isEmpty()}: Verifica se a pilha está vazia.
     ** <p>
     * <b>{@link #isFull()}: Verifica se a pilha está cheia.
     ** <p>
     * <b>{@link #length()}: Retorna o tamanho da pilha quando ela foi criada.
     ** <p>
     * <b>{@link #realLength()}: Retorna o número de elementos.
     ** 
     * @param size é tamanho fixo da pilha.
     ** 
     */
    public Stack(int size) {
        // * Se o tamanho for um natural positivo e não nulo irá criar a stack
        if (size > 0) {
            this.stack = new Object[size];
            this.size = size;
            this.top = 0;
        } else {
            throw new IllegalArgumentException("Valor de tamanho inválido");
        }
    }

    // * Empilha um dado genérico na pilha (push)
    public void push(Object element) {
        // * Se não estiver cheia irá empilhar
        if (!isFull()) {
            this.stack[this.top] = element;
            this.top++;
        } else {
            throw new IllegalArgumentException("Estouro de memória");
        }
    }

    // * Desempilha e "remove" um dado genérico da pilha (pop)
    public Object pop() {
        // * Se não estiver vazia irá desempilhar
        if (!isEmpty()) {
            this.top--;
            Object valueAux = this.stack[this.top];
            this.stack[this.top] = null;
            return valueAux;
        } else {
            throw new IllegalArgumentException("Pilha vazia");
        }
    }

    // * Retorna o elemento que está no top da pilha
    public Object peek() {
        if (!isEmpty()) {
            return this.stack[this.top - 1];
        }
        // * Se a pilha estiver vazia, irá retornar um valor nulo
        return this.stack[0];
    }

    /*
     * Sobrescreve ao método toString() para que, em vez de mostrar o nome da classe
     * e a referência, mostre uma estrutura contendo os elementos distribuídos pelo
     * método de adição/empilhar (push).
     */
    @Override
    public String toString() {
        StringBuilder body = new StringBuilder("[");
        for (int i = 0; i < realLength() - 1; i++) {
            body.append(index(i)).append(", ");
        }
        // * Se a pilha estiver vazia, irá concatenar "" em vez do primeiro elemento
        body.append(!isEmpty() ? index(realLength() - 1) : "");
        return body.append("]").toString();
    }

    // * Retorna o tamanho da pilha conforme foi passado na criação dela
    public int getSize() {
        return this.size;
    }

    // * Verifica se a pilha está vazia
    public boolean isEmpty() {
        return this.top == 0;
    }

    // * Verifica se a pilha está cheia
    public boolean isFull() {
        return this.top == length(); // Ou this.top = this.size;
    }

    // * Verifica o tamanho da pilha
    public int length() {
        return (this.stack).length; // Ou this.size;
    }

    // * Verifica o tamanho real da pilha conforme o número de elementos
    public int realLength() {
        return this.top;
    }

    /*
     * Acessa qualquer posição. Isso foge do comportamento de uma pilha, mas é
     * permitido, pois está usando um vetor como base (só esse classe tem acesso).
     */
    private Object index(int i) {
        return this.stack[i];
    }
}
