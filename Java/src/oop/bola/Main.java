package bola;

public class Main {
    public static void main(String[] args) {
        Bola test = new Bola("Verde", 10.5, "Borracha");
        System.out.println(test);
        System.out.println(test.mostrarCor());
        test.trocarCor("Amarelo");
        System.out.println(test);
        System.out.println(test.mostrarCor());
    }
}

class Bola {

    private String cor;
    private String material;
    private Double circunferencia;

    public Bola(String cor, Double circunferencia, String material) {
        this.cor = cor;
        this.material = material;
        this.circunferencia = circunferencia;
    }

    public void trocarCor(String novaCor) {
        this.cor = novaCor;
    }

    public String mostrarCor() {
        return this.cor;
    }

    public Double getCircunferencia() {
        return this.circunferencia;
    }

    public String getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName() + Integer.toHexString(hashCode()));
        sb.append(", cor: " + this.mostrarCor());
        sb.append(", material: " + this.material);
        sb.append(", circunferência: " + this.circunferencia);
        return sb.toString();
    }

}
