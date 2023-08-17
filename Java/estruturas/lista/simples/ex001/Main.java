package lista.simples.ex001;

public class Main {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        List<Integer> queue = new List<>();
        for (int i = 10; i > 0; queue.add(i--)) {
            System.out.println(queue);
        }
        System.out.println(queue);
    }
}
