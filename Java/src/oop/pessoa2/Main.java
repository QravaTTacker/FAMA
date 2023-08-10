package pessoa2;

public class Main {
    public static void main(String[] args) {
        Pessoa ps = new Pessoa("João Nascimento", 20, 85.6, 1.81);
        System.out.println(ps);
        ps.envelhercer();
        System.out.println(ps);
        ps.crescer(5);
        System.out.println(ps);
        ps.engordar(5.5);
        System.out.println(ps);
        ps.envelhercer();
        System.out.println(ps);
    }
}

class Pessoa {

    private String nome;
    private Short idade;
    private Double peso;
    private Double altura;

    public Pessoa(String nome, int idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = (short) idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhercer() {
        if (this.idade < 21)
            this.altura += 0.05;
        this.idade++;
    }

    public void engordar(Double massa) {
        this.peso += massa;
    }

    public void emagrecer(Double massa) {
        this.peso -= massa;
    }

    public void crescer(int centimetros) {
        this.altura += (double) centimetros / 100;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.nome)
                .append("; ").append(this.idade).append(" anos")
                .append("; ").append(String.format("%.2f", this.altura)).append(" metros")
                .append("; ").append(this.peso).append(" kg")
                .toString();
    }

}
