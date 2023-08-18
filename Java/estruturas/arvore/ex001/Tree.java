package arvore.ex001;

public final class Tree<T extends Comparable<T>> {

    private static final class Node<T> {
        private T value;
        private Node<T> left;
        private Node<T> right;

        private Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static final int IN_ORDER = 0;
    public static final int PRE_ORDER = 1;
    public static final int POS_ORDER = 2;

    private Node<T> root;
    private int size;

    public Tree() {
        this.root = null;
        this.size = 0;
    }

    public Tree(final T value) {
        this.insert(value);
        this.size = 1;
    }

    @SafeVarargs
    public Tree(final T... values) {
        for (T value : values) {
            if (value == null)
                continue;
            this.insert(value);
        }
    }

    public boolean insert(final T value) {
        return this.insert(this.root, value);
    }

    private boolean insert(final Node<T> no, final T value) {
        Node<T> newNode = new Node<>(value);
        if (value == null) {
            return false;
        }
        if (no == null) {
            this.root = newNode;
            this.size++;
        } else {
            Node<T> iterator = this.root;
            while (true) {
                if (value.compareTo(iterator.value) < 0) { // Quando o valor é menor.
                    if (iterator.left == null) { // Não tem ninguém à esquerda.
                        iterator.left = newNode;
                        this.size++;
                        break;
                    } else { // Quando tem alguém à esquerda.
                        iterator = iterator.left;
                    }
                } else if (value.compareTo(iterator.value) > 0) { // Quando o valor é maior.
                    if (iterator.right == null) { // Não tem ninguém à direita.
                        iterator.right = newNode;
                        this.size++;
                        break;
                    } else { // Quando tem alguém à direita.
                        iterator = iterator.right;
                    }
                } else { // Quando o valor é igual.
                    return false;
                }
            }
        }
        return true;
    }

    public boolean remove(final T value) {
        return this.remove(this.root, value);
    }

    private boolean remove(Node<T> elementToRemove, final T value) {
        if (value == null) {
            return false;
        }
        if (elementToRemove == null) {
            return false;
        } else {
            Node<T> parentOfElementToRemove = null;
            if (value.compareTo(elementToRemove.value) == 0) {
                // O elemento que quero remover é a root.
                return this.remove(elementToRemove, parentOfElementToRemove);
            } else {
                // Busca o pai do elemento que será removido.
                parentOfElementToRemove = searchParent(value);
                if (value.compareTo(parentOfElementToRemove.value) > 0) {
                    // O elemento que quero remover está à direita do pai.
                    elementToRemove = parentOfElementToRemove.right;
                } else {
                    // O elemento que quero remover está à esquerda do pai.
                    elementToRemove = parentOfElementToRemove.left;
                }
                return this.remove(elementToRemove, parentOfElementToRemove);
            }
        }
    }

    private Node<T> searchParent(final T value) {
        Node<T> parent = null;
        Node<T> iterator = this.root;
        while (value.compareTo(iterator.value) != 0) {
            if (value.compareTo(iterator.value) > 0) { // Quando o valor é maior.
                parent = iterator;
                iterator = iterator.right;
            } else { // Quando o valor é menor.
                parent = iterator;
                iterator = iterator.left;
            }
        }
        return parent;
    }

    private boolean remove(Node<T> elementToRemove, Node<T> parent) {
        // Não remove se o pai a root
        if (parent != null) {
            // Não possui filhos.
            if (elementToRemove.left == null && elementToRemove.right == null) {
                if (elementToRemove.value.compareTo(parent.value) > 0) {
                    parent.right = null;
                } else {
                    parent.left = null;
                }
                this.size--;
                return true;
            } else if (elementToRemove.left != null) { // Possui filho apenas à esquerda.
                if (elementToRemove.value.compareTo(parent.value) > 0) {
                    parent.right = elementToRemove.left;
                } else {
                    parent.left = elementToRemove.left;
                }
                this.size--;
                return true;
            } else if (elementToRemove.right != null) { // Possui filho apenas à direita.
                if (elementToRemove.value.compareTo(parent.value) > 0) {
                    parent.right = elementToRemove.right;
                } else {
                    parent.left = elementToRemove.right;
                }
                this.size--;
                return true;
            } else { // Quando o elemento possui dois filhos.
                // Node<T> parentSub = elementToRemove;
                // Node<T> sub = elementToRemove.left;
                // while (sub.right != null) {
                // parentSub = sub;
                // sub = sub.right;
                // }
            }
        }
        return false;
    }

    public boolean contains(final T value) {
        return this.contains(this.root, value);
    }

    private boolean contains(Node<T> no, final T value) {
        if (value == null) {
            return true;
        }
        if (no == null) {
            return false;
        } else {
            while (no != null) {
                if (value.compareTo(no.value) > 0) { // Quando o valor é maior
                    no = no.right;
                } else if (no.value.compareTo(value) < 0) { // Quando o valor é menor
                    no = no.left;
                } else { // Quando o valor é igual
                    return true;
                }
            }
        }
        return false;
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
                this.showIn(this.root);
                break;
            case Tree.PRE_ORDER:
                this.showPre(this.root);
                break;
            case Tree.POS_ORDER:
                this.showPos(this.root);
                break;
        }
        System.out.printf("]%s", end);
    }

    private void showIn(Node<T> iterator) {
        if (iterator != null) {
            this.showIn(iterator.left);
            System.out.printf("%s ", iterator.value.toString());
            this.showIn(iterator.right);
        }
    }

    private void showPre(Node<T> iterator) {
        if (iterator != null) {
            System.out.printf("%s ", iterator.value.toString());
            this.showIn(iterator.left);
            this.showIn(iterator.right);
        }
    }

    private void showPos(Node<T> iterator) {
        if (iterator != null) {
            this.showIn(iterator.left);
            this.showIn(iterator.right);
            System.out.printf("%s ", iterator.value.toString());
        }
    }

    public T getMin() {
        Node<T> iterator = this.root;
        while (iterator.left != null) {
            iterator = iterator.left;
        }
        return iterator.value;
    }

    public T getMax() {
        Node<T> iterator = this.root;
        while (iterator.right != null) {
            iterator = iterator.right;
        }
        return iterator.value;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        this.print();
        return "";
    }

}
