package arvore.ex000.my_tree;

class No<T> {

    private T value;
    private No<T> right;
    private No<T> left;

    public No(final T value) {
        this.right = null;
        this.left = null;
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public No<T> getRight() {
        return this.right;
    }

    public No<T> getLeft() {
        return this.left;
    }

    public void setValue(final T value) {
        this.value = value;
    }

    public void setRight(final No<T> noRight) {
        this.right = noRight;
    }

    public void setLeft(final No<T> noLeft) {
        this.left = noLeft;
    }

}
