package arvore.my_tree;

import java.util.ArrayList;
import java.util.Arrays;

public class Tree<T extends Comparable<T>> {

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
        this.root = new No<>(args[0]);
        this.values = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            this.insert(args[i]);
        }
        this.length = args.length;
    }

    /**
     * @param value
     * @return boolean
     */
    public boolean insert(final T value) {
        if (this.root == null) {
            this.root = new No<>(value);
            this.length++;
            return true;
        } else {
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
            length++;
            return true;
        }
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

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        return this.length;
    }

    public void show(final byte option) {
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
