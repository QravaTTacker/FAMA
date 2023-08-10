package circulo;

public class Circulo {

    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean visible;

    public Circulo() {
        setDiameter(0);
        setXPosition(0);
        setYPosition(0);
        setColor("Sem");
        setVisible("no");
    }

    public Circulo(int diameter, int xPosition, int yPosition, String color, String visible) {
        setDiameter(diameter);
        setXPosition(xPosition);
        setYPosition(yPosition);
        setColor(color);
        setVisible(visible);
    }

    public void getStatus(boolean end) {
        System.out.println("Diâmetro: " + getDiameter());
        System.out.println("Posição X: " + getXPosition());
        System.out.println("Posição Y: " + getYPosition());
        System.out.println("Cor: " + getColor());
        System.out.println("É visível: " + isVisible());
        if (end) {
            System.out.println();
        }
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setXPosition(int position) {
        this.xPosition = position;
    }

    public void setYPosition(int position) {
        this.yPosition = position;
    }

    public void setColor(String color) {

        var cor = "";
        if (color.equalsIgnoreCase("vermelho")) {
            cor = "\033[31;1m";
        } else if (color.equalsIgnoreCase("verde")) {
            cor = "\033[32;1m";
        } else if (color.equalsIgnoreCase("amarelo")) {
            cor = "\033[33;1m";
        } else if (color.equalsIgnoreCase("azul")) {
            cor = "\033[34;1m";
        } else if (color.equalsIgnoreCase("roxo")) {
            cor = "\033[35;1m";
        } else if (color.equalsIgnoreCase("ciano")) {
            cor = "\033[36;1m";
        }

        var str1 = color.substring(0, 1).toUpperCase();
        var str2 = (color.substring(1, color.length())).toLowerCase();

        this.color = cor + (str1 + str2) + "\033[m";
    }

    public int getDiameter() {
        return this.diameter;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public String getColor() {
        return this.color;
    }

    public void setVisible(String parameter) {
        if (parameter.trim().equalsIgnoreCase("sim")) {
            this.visible = true;
        } else {
            this.visible = false;
        }
    }

    public boolean isVisible() {
        return this.visible;
    }
}
