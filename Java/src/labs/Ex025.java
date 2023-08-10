package labs;

public class Ex025 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(a >> 1);
        a += (a >> 1); // +50%
        System.out.println(a);
        // 10 = 0000.1010
        // 10 >> 1 = 0000.0101 = 5
    }
}
