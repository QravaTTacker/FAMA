package lista.simples.ex000;

class Main {

    private static final String R = "\033[31;1m";
    private static final String G = "\033[32;1m";
    private static final String Y = "\033[33;1m";
    private static final String B = "\033[34;1m";
    private static final String C = "\033[35;1m";
    private static final String P = "\033[36;1m";
    private static final String NUL = "\033[m";

    public static void main(String[] args) throws Exception {
        List myList = new List("Assembly");
        myList.showList();
        myList.add(P + "Java" + NUL);
        myList.showList();
        myList.add(R + "Python" + NUL);
        myList.showList();
        myList.add(G + "C" + NUL);
        myList.showList();
        myList.add(Y + "C++" + NUL);
        myList.showList();
        myList.add(B + "C#" + NUL);
        myList.showList();
        myList.add(C + "Kotlin" + NUL);
        myList.showList();
        // Remove
        myList.remove();
        myList.showList();
        myList.remove();
        myList.showList();
        myList.remove();
        myList.showList();
        myList.remove();
        myList.showList();
        myList.remove();
        myList.showList();
        myList.remove();
        myList.showList();
        myList.remove(); // Lista ligada já vazia
        myList.showList();
        System.out.println("\nFIM:" + myList.getFimValue());
    }
    // private static void show(LinkedList L) {
    // System.out.println("Primeiro elemento: " + L.getFirst());
    // System.out.println("Primeiro valor: " + L.getValue());
    // System.out.println("size: " + L.getSize());
    // }
}
