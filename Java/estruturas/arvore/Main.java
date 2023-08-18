package arvore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import arvore.my_tree.Tree;

public class Main {

    public static void main(String... args) {
        System.out.print("\033[2J\033[H");

        // Tree<Integer> treeInt = new Tree<>(3);
        // Tree<String> treeStr = new Tree<>();
        Tree<Double> treeFlt = new Tree<>(2.3, null, 5D, 3.4, 2D, 2.1, 2D, 3D, 8D, -2D, 0D);

        

        // System.out.println(treeInt);
        // System.out.println(treeStr);
       
        treeFlt.show(Tree.INORDER);
        treeFlt.show(Tree.INORDER);
        
        treeFlt.remove(0D);
        treeFlt.show();

        treeFlt.remove(treeFlt.getMin());
        treeFlt.show();

    }
}
