package lista.simples.ex002;

public class Main {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        List<Character> list = new List<>('X');
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.addFirst((char) (i + 65));
            System.out.println(list);
        }

        list.remove(10);
        System.out.println(list);
    }
}
