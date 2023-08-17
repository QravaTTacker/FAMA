package circulo_gui;

import java.awt.Rectangle;
import java.util.Random;

public class Square {
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Square() {
        size = 60;
        xPosition = 310;
        yPosition = 120;
        color = "red";
        isVisible = false;
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
        moveHorizontal(10);
    }

    public void moveLeft() {
        moveHorizontal(-10);
    }

    public void moveUp() {
        moveVertical(-10);
    }

    public void moveDown() {
        moveVertical(10);
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

    public void changeSize(int newSize) {
        erase();
        size = newSize;
        draw();
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, size, size));
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
