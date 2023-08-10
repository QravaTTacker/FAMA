package quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado test = new Quadrado(4.5);
        System.out.println(test.getSize());
        System.out.println(test.getArea());
        test.setSize(10.0);
        System.out.println(test.getSize());
        System.out.println(test.getArea());
    }
}

class Quadrado {

    private Double sizeSide;

    public Quadrado(Double side) {
        this.sizeSide = side;
    }

    public Double getSize() {
        return this.sizeSide;
    }

    public void setSize(Double size) {
        this.sizeSide = size;
    }

    public Double getArea() {
        return Math.pow(this.getSize(), 2);
    }

}
