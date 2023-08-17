package circulo_gui;

import java.awt.geom.*;
import java.util.Random;

public class Circle {

    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Circle() {
        diameter = 80;
        xPosition = 200;
        yPosition = 200;
        color = "red";
    }

    public void makeVisible() {
        isVisible = true;
        draw();
    }

    public void makeInvisible() {
        erase();
        isVisible = false;
    }

    public void moveRight() {
        moveHorizontal(25);
        rgb();
    }

    public void moveLeft() {
        moveHorizontal(-25);
        rgb();
    }

    public void moveUp() {
        moveVertical(-25);
        rgb();
    }

    public void moveDown() {
        moveVertical(25);
        rgb();
    }

    
    /** 
     * @param distance
     */
    public void moveHorizontal(int distance) {
        erase();
        xPosition += distance;
        draw();
    }

    public void moveVertical(int distance) {
        erase();
        yPosition += distance;
        draw();
    }

    public void rgb() {
        color = "random";
    }

    public void slowMoveHorizontal(int distance) {
        int delta;
        if (distance < 0) {
            delta = -1;
            distance = -distance;
        } else {
            delta = 1;
        }
        for (int i = 0; i < distance; i++) {
            xPosition += delta;
            draw();
        }
    }

    public void slowMoveVertical(int distance) {
        int delta;
        if (distance < 0) {
            delta = -1;
            distance = -distance;
        } else {
            delta = 1;
        }
        for (int i = 0; i < distance; i++) {
            yPosition += delta;
            draw();
        }
    }

    public void changeSize(int newDiameter) {
        erase();
        diameter = newDiameter;
        draw();
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition,
                    diameter, diameter));
            canvas.wait(10);
        }
    }

    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

    public void aleatoryMove() {
        Random rand = new Random();
        int m = rand.nextInt(1, 5);
        System.out.println(m);
        if (m == 1 && yPosition > 100) {
            this.moveUp();
        } else if (m == 2 && yPosition < (400)) {
            this.moveDown();
        } else if (m == 3 && xPosition < (400)) {
            this.moveRight();
        } else if (m == 4 && xPosition > 100) {
            this.moveLeft();
        }
    }
}
