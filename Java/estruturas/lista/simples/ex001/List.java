package lista.simples.ex001;

public class List<T> {

    private int size;
    private Node<T> head;

    public List() {
        this.size = 0;
        this.head = null;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(this.head);
        this.head = newNode;
        this.size++;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value); // * Next já é null
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> lastIndex = this.head;
            while (lastIndex.getNext() != null) {
                lastIndex = lastIndex.getNext();
            }
            lastIndex.setNext(newNode);
        }
        this.size++;
    }

    // T -> N1 -> N2 -> N3 -> null
    // T -> N2 -> N3 -> N4 -> null
    // N1 continua pontando para N2 :/
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T value = this.head.getElement();
        this.head = this.head.getNext();
        this.size--;
        return value;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = this.head;
        while (current != null) {
            sb.append(current.getElement());
            current = current.getNext();
            if (current != null) {
                sb.append(" -> ");
            }
        }
        return sb.append(this.head == null ? "null" : " -> null").toString();
    }
}
