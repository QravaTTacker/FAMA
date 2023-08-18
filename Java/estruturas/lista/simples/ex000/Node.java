package lista.simples.ex000;

class Node {

    private Object value;
    private Node next;

    protected Node(Object value, Node next) {
        if (value != null) {
            this.value = value;
            this.next = next;
        } else {
            throw new IllegalArgumentException("Value null :/");
        }
    }

    protected Node() {
        this.value = null;
    }

    protected void setValue(Object value) {
        if (value != null) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value null :/");
        }
    }

    protected void setNext(Node node) {
        this.next = node;
    }

    protected Object getValue() {
        return this.value;
    }

    protected Node getNext() {
        return this.next;
    }
}
