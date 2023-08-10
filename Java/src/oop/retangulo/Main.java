package retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Double comprimento = 0.0;
        Double largura = 0.0;
        Double comprimentoPiso = 0.0;
        Double larguraPiso = 0.0;
        Double rodape = 0.0;
        Integer quantidadeRodape = 0;

        clrscr();

        while (true) {
            try {
                System.out.print("Comprimento (m): ");
                comprimento = Math.abs(Double.parseDouble(
                        scanner.nextLine().replace(" ", "")));

                System.out.print("Largura (m): ");
                largura = Math.abs(Double.parseDouble(
                        scanner.nextLine().replace(" ", "")));

                System.out.println("-".repeat(20));

                System.out.print("Comprimento do piso (cm): ");
                comprimentoPiso = Math.abs(Double.parseDouble(
                        scanner.nextLine().replace(" ", ""))) / 100;

                System.out.print("Largura do piso (cm): ");
                larguraPiso = Math.abs(Double.parseDouble(
                        scanner.nextLine().replace(" ", ""))) / 100;

                System.out.println("-".repeat(20));

                System.out.print("Altura do rodapé (cm): ");
                rodape = Math.abs(Double.parseDouble(
                        scanner.nextLine().replace(" ", ""))) / 100;

                quantidadeRodape = (int) Math.ceil(larguraPiso / rodape);

                scanner.close();
                break;
            } catch (Exception e) {
                clrscr();
                System.out.println("Error: " + e.getMessage());
            }
        }

        Retangulo sala = new Retangulo(comprimento, largura);
        Retangulo piso = new Retangulo(comprimentoPiso, larguraPiso);

        System.out.println("-".repeat(20));
        System.out.format("Área da sala: %.2fm²\n", sala.calcularArear());
        System.out.format("Área do piso: %.2fm²\n", piso.calcularArear());
        System.out.println("Unidades de piso: " + (int) Math.ceil(sala.calcularArear() / piso.calcularArear()));
        System.out.println("Quantidade de rodapé por piso: " + quantidadeRodape);
        System.out.println("Quantidade de rodapé para a sala: " +
                (int) (sala.calcularPerimetro() / comprimentoPiso));
        System.out.println("Quantidade de pisos destinados para os rodapés: "
                + (int) (sala.calcularPerimetro() / comprimentoPiso) / quantidadeRodape);
        System.out.println("-".repeat(20));

        System.out.println("Total de unidades de piso: " +
                (int) Math.ceil(sala.calcularArear() / piso.calcularArear()
                        + (int) (sala.calcularPerimetro() / comprimentoPiso) / quantidadeRodape));

    }

    private static void clrscr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Retangulo {

    private Double comprimento;
    private Double largura;

    public Retangulo(Double comprimento, Double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarValor(Double comprimento, Double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public String getLados() {
        return this.comprimento + "x" + this.largura;
    }

    public Double calcularArear() {
        return this.comprimento * this.largura;
    }

    public Double calcularPerimetro() {
        return 2 * this.comprimento + 2 * this.largura;
    }

}
