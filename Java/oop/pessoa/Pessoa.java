package pessoa;

public class Pessoa {
    private String name;
    private String cpf;
    private int idade;
    private float peso;
    private boolean vivo;

    // Customizado
    public Pessoa(String name, String cpf, int idade, float peso, boolean vivo) {
        this.name = name;
        this.cpf = cpf;
        this.idade = idade;
        this.peso = peso;
        this.vivo = vivo;
    }

    // Default Settings
    public Pessoa() {
        this.name = "SEM";
        this.cpf = "000.000.000-00";
        this.idade = 0;
        this.peso = 0.0f;
        this.vivo = false;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return this.name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getPeso() {
        return this.peso;
    }

    public boolean getVivo() {
        return this.vivo;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setCpf(String c) {
        this.cpf = c;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setPeso(float p) {
        this.peso = p;
    }

    public void isVivo(boolean v) {
        this.vivo = v;
    }

    public void status() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Vivo? " + this.vivo);
    }
}
