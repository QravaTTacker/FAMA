package conta_corrente;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("0234", "Cristian Antônio");
        System.out.println(cc);
        System.out.println(cc.depositar(100.0));
        System.out.println(cc);
        System.out.println(cc.sacar(100.01));
        System.out.println(cc);
    }
    
}

class ContaCorrente {

    private String number;
    private String nomeCorrentista;
    private Double saldo;
    private Short movimenta = 0;

    public ContaCorrente(String number, String nomeCorrentista, Double saldo) {
        this.number = number;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
        this.movimenta = 0;
    }

    public ContaCorrente(String number, String nomeCorrentista) {
        this(number, nomeCorrentista, 0.0);
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public boolean depositar(Double valor) {
        if (valor <= 0.0)
            return false;
        this.saldo += valor;
        this.movimenta++;
        return true;
    }

    public boolean sacar(Double valor) {
        if (this.saldo - valor < 0.0)
            return false;
        this.saldo -= valor;
        this.movimenta++;
        return true;
    }

    public String getNumber() {
        return this.number;
    }

    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Correntista: ")
                .append(this.nomeCorrentista)
                .append(String.format(" Nº{%s} ", this.number))
                .append("\nMovimentações: ")
                .append(this.movimenta)
                .append(String.format("\nSaldo: %.2f", this.saldo));
        return sb.toString();
    }

}
