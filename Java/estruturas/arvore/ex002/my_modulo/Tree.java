package my_modulo;

public class Tree<T extends Comparable<T>> {

    private Node<T> root;
    private int size;

    public static final int IN_ORDER = 0;
    public static final int PRE_ORDER = 1;
    public static final int POS_ORDER = 2;

    public Tree() {
        this.size = 0;
        this.root = null;
    }

    public Tree(T value) {
        this.size = 0;
        this.insert(value);
    }

    @SafeVarargs
    public Tree(T... values) {
        this.size = 0;
        for (T value : values) {
            this.insert(value);
        }
    }

    public boolean insert(T value) {
        return insert(this.root, value);
    }

    private boolean insert(Node<T> no, T value) {
        if (value == null) {
            return false;
        }
        if (this.root == null) {
            this.root = new Node<T>(value);
            this.size++;
            return true;
        } else {
            Node<T> newNode = new Node<T>(value);
            Node<T> iterator = no;
            while (true) {
                if (newNode.getValue().compareTo(iterator.getValue()) > 0) { // Direita
                    if (iterator.getRight() == null) {
                        iterator.setRight(newNode);
                        this.size++;
                        return true;
                    } else {
                        iterator = iterator.getRight();
                    }
                } else if (newNode.getValue().compareTo(iterator.getValue()) < 0) { // Esquerda
                    if (iterator.getLeft() == null) {
                        iterator.setLeft(newNode);
                        this.size++;
                        return true;
                    } else {
                        iterator = iterator.getLeft();
                    }
                } else {
                    return false;
                }
            }
        }
    }

    public void print() {
        this.print(Tree.IN_ORDER, "\n");
    }

    public void print(final int option) {
        this.print(option, "\n");
    }

    public void print(final int option, final String end) {
        System.out.print("[ ");
        switch (option % 3) {
            case Tree.IN_ORDER:
                printInOrder(this.root);
                break;
            case Tree.PRE_ORDER:
                printPreOrder(this.root);
                break;
            case Tree.POS_ORDER:
                printPosOrder(this.root);
                break;
        }
        System.out.printf("]%s", end);
    }

    private void printInOrder(Node<T> no) {
        if (no != null) {
            this.printInOrder(no.getLeft());
            System.out.printf("%s ", no.getValue().toString());
            this.printInOrder(no.getRight());
        }
    }

    private void printPreOrder(Node<T> no) {
        if (no != null) {
            System.out.printf("%s ", no.getValue().toString());
            this.printPreOrder(no.getLeft());
            this.printPreOrder(no.getRight());
        }
    }

    private void printPosOrder(Node<T> no) {
        if (no != null) {
            this.printPosOrder(no.getLeft());
            this.printPosOrder(no.getRight());
            System.out.printf("%s ", no.getValue().toString());
        }
    }

    public int size() {
        return this.size;
    }

}
