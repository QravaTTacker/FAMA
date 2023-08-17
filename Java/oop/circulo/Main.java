package circulo;

public class Main {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Circulo cir1 = new Circulo();
        Circulo cir2 = new Circulo(
                10,
                50,
                30,
                "vermelho",
                "sim");

        cir1.getStatus(true);
        cir2.getStatus(true);

        new Circulo(
                1100,
                1920,
                1080,
                "roxo",
                "não").getStatus(true);

        new Circulo(
                1,
                180,
                360,
                "verde",
                "sim").getStatus(false);
    }
}
