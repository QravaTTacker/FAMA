package lista.simples.ex000;

public class List {

    private Node first;
    private Node fim;
    private int size;

    public List() {
        this.size = 0;
        this.first = null;
        this.fim = null;
    }

    public List(Object value) {
        Node aux = new Node(value, null);
        this.first = aux;
        this.fim = aux;
        this.size = 1;
    }

    // list -> [null]
    // list -> [4] -> [null]
    // list -> [0] -> [4] -> [null]
    // list -> [7] -> [0] -> [4] -> [null]
    public void add(Object value) {
        Node aux = new Node(value, this.first);
        if (this.first == null) {
            this.fim = aux;
        }
        this.first = aux;
        this.size++;
    }

    // list -> [7] -> [0] -> [4] -> [null]
    // list -> [0] -> [4] -> [null]
    // list -> [4] -> [null]
    // list -> [null]
    public void remove() {
        if (this.first != null) {
            this.first = this.first.getNext();
            this.size--;
        } else {
            System.out.println("Lista vazia :/ vai remover o que?");
        }
    }

    public Object getFimValue() {
        return this.fim.getValue();
    }

    // list -> [0] -> [4] -> [null]
    // list -> [0] -> [4] -> [2] -> [null]
    public void addFim(Object value) {
        Node aux = this.first;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
    }

    public Object removeReturn() {
        if (this.first != null) {
            this.size--;
            Object aux = this.first.getValue();
            this.first = this.first.getNext();
            return aux;
        } else {
            System.out.println("Lista vazia :/ vai remover o que?");
            return null;
        }
    }

    public void showList() {
        Node aux = this.first;
        while (aux != null) {
            System.out.print(aux.getValue() + " -> ");
            aux = aux.getNext();
        }
        System.out.print("\033[38;2;255;50;210;1m" + aux + "\033[m");
        System.out.println(" [" + this.length() + "]");
    }

    public int length() {
        int size = 0;
        Node aux = this.first;
        while (aux != null) {
            aux = aux.getNext();
            size++;
        }
        return size;
    }

    public Node getFirst() {
        return this.first;
    }

    public Object getValue() {
        if (this.first != null)
            return this.first.getValue();
        return null;
    }

    public int getSize() {
        return this.size;
    }
}
