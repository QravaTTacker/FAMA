package veiculo;

public class Main {
    public static void main(String[] args) throws Exception {

        Veiculo carroA = new Veiculo("HCP40", "BMW", "SÉRIE 1 M");
        carroA.setAno((short) 2020);
        carroA.printStatus();

        System.out.println("=".repeat(50));
        Veiculo carroB = new Veiculo();
        carroB.setPlaca("PHP127");
        carroB.setMarca("DODGE");
        carroB.setModelo("DURANGO");
        carroB.setUsado("sim");
        carroB.setLitros(12.0f);
        carroB.setPercorridos(240.67f);
        carroB.setAno((short) 2013);
        carroB.printStatus();
    }
}
