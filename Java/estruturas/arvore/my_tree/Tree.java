package arvore.my_tree;

import java.util.ArrayList;
import java.util.Arrays;

public class Tree<T extends Comparable<T>> {

    class Node {
        Integer valor;

        public Node(Integer valor) {
            this.valor = valor;
        }

        public Integer getValor() {
            return this.valor;
        }
    }

    public static final byte INORDER = 0;
    public static final byte PREORDER = 1;
    public static final byte POSTORDER = 2;

    private int length;
    private No<T> root;
    private final ArrayList<T> values;

    public Tree(final T value) {
        this.root = new No<>(value);
        this.values = new ArrayList<>(Arrays.asList(value));
        this.length = 1;
    }

    public Tree() {
        this.root = null;
        this.values = new ArrayList<>();
        this.length = 0;
    }

    @SafeVarargs
    public Tree(final T... args) {
        this.values = new ArrayList<>();
        for (T value : args) {
            if (value == null)
                continue;
            this.insert(value);
        }
    }

    /**
     * @param value
     * @return boolean
     */
    public boolean insert(final T value) {
        if (value == null) {
            return false;
        }
        if (this.root == null) {
            this.root = new No<>(value);
            this.length++;
            return true;
        }
        final No<T> newNo = new No<T>(value);
        No<T> parent = this.root;
        while (parent != null) {
            if (newNo.getValue().compareTo(parent.getValue()) > 0) { // Quando é maior
                if (parent.getRight() != null) {
                    parent = parent.getRight();
                } else {
                    parent.setRight(newNo);
                    this.values.add(newNo.getValue());
                    parent = null;
                }
            } else if (newNo.getValue().compareTo(parent.getValue()) < 0) { // Quando é menor
                if (parent.getLeft() != null) {
                    parent = parent.getLeft();
                } else {
                    parent.setLeft(newNo);
                    this.values.add(newNo.getValue());
                    parent = null;
                }
            } else { // Quando é igual
                parent = null;
                return false;
            }
        }
        this.length++;
        return true;
    }

    public boolean remove(final T value) {
        return this.remove(this.root, value);
    }

    private boolean remove(No<T> noRemove, T value) {
        if (noRemove == null) {
            return false;
        } else {
            No<T> parent = null;
            while (noRemove != null) {
                if (noRemove.getValue().compareTo(value) == 0) {
                    removeThis(noRemove, parent);
                    return true;
                } else if (noRemove.getValue().compareTo(value) > 0) {
                    parent = noRemove;
                    noRemove = noRemove.getLeft();
                } else {
                    parent = noRemove;
                    noRemove = noRemove.getRight();
                }
            }
        }
        return false;
    }

    private No<T> removeThis(No<T> noRemove, No<T> parent) {
        if (parent != null) {
            if (noRemove.getLeft() == null && noRemove.getRight() == null) { // Não possui filhos
                if (parent.getValue().compareTo(noRemove.getValue()) > 0) { // Ele está na esquerda
                    parent.setLeft(null);
                } else { // Ele está na direita
                    parent.setRight(null);
                }
                noRemove = null;
            } else if (noRemove.getRight() != null) { // Possui filho somente à direita
                if (parent.getValue().compareTo(noRemove.getValue()) > 0) { // Ele está à esquerda
                    parent.setLeft(noRemove.getRight());
                } else { // Ele está na direita
                    parent.setRight(noRemove.getRight());
                }
                noRemove = null;
            } else if (noRemove.getLeft() != null) { // Possui filho somente à esquerda
                if (parent.getValue().compareTo(noRemove.getValue()) > 0) { // Ele está na esquerda
                    parent.setLeft(noRemove.getLeft());
                } else { // Ele está na direita
                    parent.setRight(noRemove.getRight());
                }
                noRemove = null;
            } else { // Possui filho em ambos os lados
                No<T> sub = noRemove.getLeft();
                No<T> parentSub = noRemove;
                while (sub.getRight() != null) {
                    parentSub = sub;
                    sub = sub.getRight();
                }
                if (sub.getLeft() == null && sub.getRight() == null) { // Sub não possui filhos
                    if (parent.getValue().compareTo(noRemove.getValue()) < 0) { // Ele está na esquerda

                    } else {

                    }
                }
            }
        }
        return null;
    }

    public boolean contains(final T value) {
        if (this.root == null) {
            return false;
        } else {
            No<T> iterator = this.root;
            while (iterator != null) {
                if (value.compareTo(iterator.getValue()) == 0) {
                    iterator = null;
                    return true;
                } else if (value.compareTo(iterator.getValue()) > 0) {
                    iterator = iterator.getRight();
                } else {
                    iterator = iterator.getLeft();
                }
            }
        }
        return false;
    }

    public T getMin() {
        No<T> iterator = this.root;
        while (iterator.getLeft() != null) {
            iterator = iterator.getLeft();
        }
        return iterator.getValue();
    }

    public T getMax() {
        No<T> iterator = this.root;
        while (iterator.getRight() != null) {
            iterator = iterator.getRight();
        }
        return iterator.getValue();
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        return this.length;
    }

    public void show(final byte option, String end) {
        switch (option) {
            case Tree.INORDER:
                treeInOrder(this.root);
                break;
            case Tree.PREORDER:
                treeInPreOrder(this.root);
                break;
            case Tree.POSTORDER:
                treeInPosOrder(this.root);
                break;
            default:
                treeInOrder(this.root);
        }
        System.out.print(end);

    }

    public void show(final byte option) {
        this.show(option, "\n");
    }

    public void show() {
        this.show(Tree.INORDER);
    }

    @Override
    public String toString() {
        return this.values.toString();
    }

    /**
     * Mostra os valores em ordem.
     * 
     * @param no
     */
    private void treeInOrder(final No<T> no) {
        if (no == null) {
            return;
        }
        this.treeInOrder(no.getLeft());
        System.out.printf("%s ", no.getValue().toString());
        this.treeInOrder(no.getRight());
    }

    /**
     * Mostra os valores antes da ordem.
     * 
     * @param no
     */
    private void treeInPreOrder(final No<T> no) {
        if (no == null) {
            return;
        }
        System.out.printf("%s ", no.getValue().toString());
        this.treeInPreOrder(no.getLeft());
        this.treeInPreOrder(no.getRight());
    }

    /**
     * Mostra os valores após a ordem.
     * 
     * @param no
     */
    private void treeInPosOrder(final No<T> no) {
        if (no == null) {
            return;
        }
        this.treeInPosOrder(no.getLeft());
        this.treeInPosOrder(no.getRight());
        System.out.printf("%s ", no.getValue().toString());
    }
}
