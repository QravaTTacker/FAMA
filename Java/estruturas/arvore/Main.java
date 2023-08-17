package arvore;

import arvore.my_tree.Tree;

public class Main {
    public static void main(String... args) {
        System.out.print("\033[2J\033[H");

        Tree<Integer> treeInt = new Tree<>(3);
        Tree<String> treeStr = new Tree<>();
        Tree<Double> treeFlt = new Tree<>(2.3, 5.1, 5D, 3.4, 2D);

        System.out.println(treeInt);
        System.out.println(treeFlt);
        System.out.println(treeStr);
    }
}
