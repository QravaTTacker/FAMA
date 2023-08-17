package lista.simples.ex002;

public class No<T> {

    private T value;
    private No<T> next;

    public No(T value, No<T> next) {
        this.value = value;
        this.next = next;
    }

    public No(No<T> next) {
        this(null, next);
    }

    public No(T value) {
        this(value, null);
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public No<T> getNext() {
        return this.next;
    }
}
