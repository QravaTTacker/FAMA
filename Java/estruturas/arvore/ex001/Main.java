package arvore.ex001;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[2J\033[H");

        Tree<Integer> treeDBL = new Tree<>(10, 8, 3, 15);

        treeDBL.print(Tree.IN_ORDER); // Esquerda, meio e direita
        System.out.println("Max: " + treeDBL.getMax());
        System.out.println("Min: " + treeDBL.getMin());
        System.out.println("Size: " + treeDBL.size());

        System.out.println("=".repeat(20));

        treeDBL.insert(7);
        treeDBL.insert(1);
        treeDBL.insert(4);

        treeDBL.print(Tree.IN_ORDER);
        System.out.println("Max: " + treeDBL.getMax());
        System.out.println("Min: " + treeDBL.getMin());
        System.out.println("Size: " + treeDBL.size());

        System.out.println("=".repeat(20));

        treeDBL.remove(1);
        treeDBL.remove(15);
        treeDBL.print(Tree.IN_ORDER);
        System.out.println("Max: " + treeDBL.getMax());
        System.out.println("Min: " + treeDBL.getMin());
        System.out.println("Size: " + treeDBL.size());
    }
}
