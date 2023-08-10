package veiculo;

public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private short ano;
    private float litros;
    private float kmPercorridos;
    private boolean usado;

    public Veiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 0;
        this.litros = 0.0f;
        this.kmPercorridos = 0.0f;
        this.usado = false;
    }

    public Veiculo() {
        this.placa = null;
        this.marca = null;
        this.modelo = null;
        this.ano = 0;
        this.litros = 0.0f;
        this.kmPercorridos = 0.0f;
        this.usado = false;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public void setMarca(String ma) {
        this.marca = ma;
    }

    public void setModelo(String mo) {
        this.marca = mo;
    }

    public void setAno(short a) {
        this.ano = a;
    }

    public void setLitros(float l) {
        this.litros = l;
    }

    public void setPercorridos(float km) {
        this.kmPercorridos = km;
    }

    public void setUsado(String u) {
        u = u.toLowerCase().trim();
        this.usado = u.equals("sim")
                || u.equals("si")
                || u.equals("s")
                        ? true
                        : false;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public short getAno() {
        return this.ano;
    }

    public float getLitros() {
        return this.litros;
    }

    public float getPercorridos() {
        return this.kmPercorridos;
    }

    public boolean istUsado() {
        return this.usado;
    }

    public void printStatus() {
        System.out.format("Placa: %s\n", getPlaca());
        System.out.format("Marca: %s\n", getMarca());
        System.out.format("Modelo: %s\n", getModelo());
        System.out.format("Ano: %d\n", Short.toUnsignedInt(getAno()));
        System.out.format("Litros: %.2fL\n", getLitros());
        System.out.format("Quilômetros percorridos: %.2fKm\n", getPercorridos());
        System.out.format("É usado? %b\n", istUsado());
    }
}
