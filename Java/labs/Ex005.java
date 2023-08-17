package labs;

public class Ex005 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                String code = Integer.toString(i * 16 + j);
                System.out.format("\u001b[38;5;%sm #", code);
            }
            System.out.println("\u001b[m");
        }
        System.out.println();
        System.out.format("\033[30mColor[null]\033[m\n\n");
        System.out.format("\033[31;1mColor[1]\033[m\n\n");
        System.out.format("\033[32;1;4mColor[1;4]\033[m\n\n");
        System.out.format("\033[33;1;4;7mColor[1;4;7]\033[m\n\n");
        System.out.format("\033[34;7mColor[7]\033[m\n\n");
        System.out.format("\033[35;4;7mColor[4;7]\033[m\n\n");
        System.out.format("\033[36;1;4;7mColor[1;4;7]\033[m\n\n");
        System.out.format("\033[37;4mColor[4]\033[m\n\n");
        System.out.format("\033[38;4;7mColor[4;7]\033[m\n\n");
        System.out.format("\033[39;1;4;7mColor[1;4;7]\033[m\n\n");
    }
}
