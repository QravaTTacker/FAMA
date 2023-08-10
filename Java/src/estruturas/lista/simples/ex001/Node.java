package lista.simples.ex001;

public class Node<T> {

    private T element;
    private Node<T> next;

    public Node(T value) {
        this.element = value;
        this.next = null;
    }

    public Node(T value, Node<T> next) {
        this.element = value;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
