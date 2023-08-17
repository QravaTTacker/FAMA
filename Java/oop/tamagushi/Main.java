package tamagushi;

public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Tamagushi th = new Tamagushi();
        System.out.println(th.getNome());
        System.out.println(th.getIdade());
        System.out.println(th.getFome());
        System.out.println(th.getSaude());
        System.out.println(th.getHumor());
        th.setSaude(8);
        th.alimentar();
        System.out.println(th.getHumor());
        System.out.println(th.getFome());

    }
}

class Tamagushi {

    private String nome;
    private int fome; // de 1 a 10 -> Nível de Fome (1 sem fome, 10 com muito fome)
    private int saude; // de 1 a 10 -> Nível de Saúde (1 com pouca saúde, 10 com muita saúde)
    private int idade;

    public Tamagushi(String nome, int idade, int fome, int saude) {
        this.nome = nome;
        this.idade = idade;
        this.fome = fome;
        this.saude = saude;
    }

    public Tamagushi(String nome, int idade) {
        this(nome, idade, 5, 5);
    }

    public Tamagushi(String nome) {
        this(nome, 10, 5, 5);
    }

    public Tamagushi() {
        this("Neo Dragon", 500, 5, 5);
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getFome() {
        return this.fome;
    }

    public int getSaude() {
        return this.saude;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFome(int fome) {
        if (0 < fome && fome < 11) { // valor entre 1 e 10
            this.fome = fome;
        }
    }

    public void setSaude(int saude) {
        if (0 < saude && saude < 11) { // valor entre 1 e 10
            this.saude = saude;
        }
    }

    public void alimentar() {
        if (this.fome != 1) {
            this.fome--;
        }
    }

    public String getHumor() {
        if (this.saude == 1) { // 1
            if (this.fome == 1) {
                return "Ruim";
            } else if (this.fome < 5) {
                return "Extremamente Ruim";
            } else if (this.fome < 8) {
                return "Péssimo";
            } else if (this.fome < 10) {
                return "Extremamente Péssimo";
            } else {
                return "Quase morto";
            }
        } else if (this.saude < 6) { // 2, 3, 4, 5
            if (this.fome == 1) {
                return "Ok";
            } else if (this.fome < 5) {
                return "Ruim";
            } else if (this.fome < 8) {
                return "Extremamente Ruim";
            } else if (this.fome < 10) {
                return "Péssimo";
            } else {
                return "Extremamente Péssimo";
            }
        } else if (this.saude < 10) { // 6, 7, 8, 9
            if (this.fome == 1) {
                return "Feliz";
            } else if (this.fome < 5) {
                return "Ok";
            } else if (this.fome < 8) {
                return "Ruim";
            } else if (this.fome < 10) {
                return "Extremamente Ruim";
            } else {
                return "Péssimo";
            }
        } else { // 10
            if (this.fome == 1) {
                return "Extremamente Feliz";
            } else if (this.fome < 5) {
                return "Feliz";
            } else if (this.fome < 8) {
                return "Ok";
            } else if (this.fome < 10) {
                return "Ruim";
            } else {
                return "Extremamente Ruim";
            }
        }

    }

}
