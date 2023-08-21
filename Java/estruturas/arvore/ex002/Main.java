import my_modulo.Tree;

public final class Main {
    public static void main(String[] args) {
        System.out.print("\033[2J\033[H");
        Tree<Integer> treeInt = new Tree<>(4, 5, 2, 9, 7);
        treeInt.print(Tree.IN_ORDER);
        System.out.println(treeInt.size());

        System.out.println("-".repeat(30));

        treeInt.insert(10);
        treeInt.print(Tree.IN_ORDER);
        System.out.println(treeInt.size());

        System.out.println("-".repeat(30));

        treeInt.print(Tree.IN_ORDER);
        System.out.println(treeInt.size());
    }
}
