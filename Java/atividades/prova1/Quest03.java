package atividades.prova1;

public class Quest03 {
    public static void main(String[] args) {
        Stack pilha = new Stack(3);
        pilha.push(1);
        System.out.println();
        pilha.push(2);
        pilha.push(3);
        pilha.pop();
        pilha.pop();
        System.out.println("Mostrando: " + pilha.peek());
        pilha.pop();
    }
}

class Stack {

    private Object[] stack;
    private int size;
    private int top;

    public Stack(int size) {
        if (size > 0) {
            this.stack = new Object[size];
            this.size = size;
            this.top = 0;
        } else {
            throw new IllegalArgumentException("VALOR INVÁLIDO");
        }
    }

    public void push(Object value) {
        if (!this.isFull()) {
            this.stack[this.top++] = value;
        } else {
            throw new IllegalArgumentException("PILHA CHEIA");
        }
    }

    public Object pop() {
        if (!this.isEmpty()) {
            Object aux = this.stack[--this.top];
            this.stack[this.top] = null;
            return aux;
        } else {
            throw new IllegalArgumentException("PILHA VAZIA");
        }
    }

    public Object peek() {
        if (!this.isEmpty()) {
            return this.stack[this.top - 1];
        } else {
            throw new IllegalArgumentException("PILHA VAZIA");
        }
    }

    public int getCapacity() {
        return this.size;
    }

    public int getSize() {
        return this.top;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isFull() {
        return this.top == this.size;
    }

    @Override
    public String toString() {
        StringBuilder body = new StringBuilder("[");
        for (int i = this.top - 1; i > 0; i--)
            body.append(this.stack[i] + ", ");
        body.append((this.isEmpty() ? "" : this.stack[0]) + "]");
        return body.toString();
    }

    public void show() {
        System.out.println(this.toString());
        System.out.println("Capacity: " + this.size);
        System.out.println("Elements: " + this.top);
        System.out.println("isFull: " + this.isFull());
        System.out.println("isEmpty: " + this.isEmpty());
    }
}
