package lista.simples.ex002;

/**
 * <p>
 * {@link #add(Object, int)}
 * <p>
 * {@link #addFirst(Object)}
 * <p>
 * {@link #addLast(Object)}
 * <p>
 * {@link #remove(int)}
 * <p>
 * {@link #removeFirst()}
 * <p>
 * {@link #removeLast()}
 * <p>
 * {@link #get(int)}
 * <p>
 * {@link #size()}
 * <p>
 * {@link #isEmpty()}
 */
public class List<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int size;

    public List(T element) {
        No<T> newNo = new No<>(element);
        this.inicio = newNo;
        this.ultimo = newNo;
        this.size = 1;
    }

    public List() {
        this.inicio = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T element, int index) {
        if (index == 0) {
            this.addFirst(element);
        } else if (index == this.size - 1) {
            this.addLast(element);
        } else if (0 < index && index < this.size - 1) {
            No<T> newNo = new No<>(element, null);
            No<T> atual = this.inicio;
            for (int i = 0; i != (index - 1); i++) {
                atual = atual.getNext();
            }
            newNo.setNext(atual.getNext());
            atual.setNext(newNo);
            this.size++;
        }
    }

    public void addFirst(T element) {
        No<T> newNo = new No<>(element, null);
        if (this.isEmpty()) {
            this.inicio = newNo;
            this.ultimo = newNo;
        } else {
            newNo.setNext(this.inicio);
            this.inicio = newNo;
        }
        this.size++;
    }

    public void addLast(T element) {
        No<T> newNo = new No<>(element, null);
        if (this.isEmpty()) {
            this.inicio = newNo;
            this.ultimo = newNo;
        } else {
            this.ultimo.setNext(newNo);
            this.ultimo = newNo;
        }
        this.size++;
    }

    public void remove(int index) {
        if (index == 0) {
            this.removeFirst();
        } else if (index == this.size - 1) {
            this.removeLast();
        } else if (0 < index && index < this.size - 1) {
            No<T> atual = this.inicio;
            for (int i = 0; i < (index - 1); i++) {
                atual = atual.getNext();
            }
            atual.setNext(atual.getNext().getNext());
            this.size--;
        }
    }

    public void removeFirst() {
        if (!this.isEmpty()) {
            if (this.inicio.getNext() == null) { // this.size == 1
                this.inicio = null;
                this.ultimo = null;
            } else {
                this.inicio = this.inicio.getNext();
            }
            this.size--;
        }
    }

    public void removeLast() {
        if (this.size == 1) {
            this.removeFirst();
        } else if (!this.isEmpty()) {
            No<T> atual = this.inicio;
            for (int i = 0; i < (this.size - 2); i++) {
                atual = atual.getNext();
            }
            atual.setNext(null);
            this.ultimo = atual;
            this.size--;
        }
    }

    public T get(int index) {
        if (-1 < index && index < this.size) { // de 0 até size -1
            if (index == this.size - 1) // Se for o último índice, retorna this.último
                return this.ultimo.getValue();
            No<T> atual = this.inicio;
            for (int i = 0; i != index; i++)
                atual = atual.getNext();
            return atual.getValue();
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> current = this.inicio;
        while (current != null) {
            sb.append(current.getValue()).append(" -> ");
            current = current.getNext();
        }
        return sb.append("null").toString();
    }
}
