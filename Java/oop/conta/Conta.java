package conta;

public class Conta {

    private float saldo; // Atributo

    public Conta() { // Método construtor. Devemos fazer atribuições.
        this.saldo = (float) 0.0;
    }

    
    /** 
     * @param valor
     */
    public void deposito(float valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saque(float valor) {

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
}
