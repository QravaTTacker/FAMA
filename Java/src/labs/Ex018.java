package labs;

public class Ex018 {
    public static void main(String[] args) throws Exception {

        String[] ipSplit = "1 3.1a3.asd.12#".replace(".", "").split("\\.");

        for (String octeto : ipSplit) {
            System.out.println("Analisando: " + octeto + "\n");
            for (char bit : octeto.toCharArray()) {
                if (Character.isDigit(bit)) {
                    System.out.println(bit + " é um número!");
                } else {
                    System.out.println(bit + " é um letra");
                }
            }
        }
    }
}
