package circulo_gui;

import java.awt.*;
import java.util.*;
import java.util.List;
import javax.swing.*;

public class Canvas {

    private int r, g, b;
    private static Canvas canvasSingleton;

    public static Canvas getCanvas() {
        if (canvasSingleton == null) {
            canvasSingleton = new Canvas("FAMA - Orientação a Objetos", 500, 500,
                    Color.white);
        }
        canvasSingleton.setVisible(true);
        return canvasSingleton;
    }

    private JFrame frame;
    private CanvasPane canvas;
    public Graphics2D graphic;
    private Color backgroundColor;
    private Image canvasImage;
    private List<Object> objects;
    private HashMap<Object, ShapeDescription> shapes;

    private Canvas(String title, int width, int height, Color bgColor) {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        frame.setLocation(30, 30);
        canvas.setPreferredSize(new Dimension(500, 500));
        backgroundColor = new Color(0, 0, 0);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        objects = new ArrayList<Object>();
        shapes = new HashMap<Object, ShapeDescription>();
    }

    public void setVisible(boolean visible) {
        if (graphic == null) {
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(500, 500);
            graphic = (Graphics2D) canvasImage.getGraphics();
            graphic.setColor(backgroundColor);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);
        }
        frame.setVisible(visible);
    }

    public void draw(Object referenceObject, String color, Shape shape) {
        objects.remove(referenceObject);
        objects.add(referenceObject);
        shapes.put(referenceObject, new ShapeDescription(shape, color));
        redraw();
    }

    public void erase(Object referenceObject) {
        objects.remove(referenceObject);
        shapes.remove(referenceObject);
        redraw();
    }

    public void setForegroundColor(String colorString) {
        Random random = new Random();
        r = random.nextInt(0, 256);
        g = random.nextInt(0, 256);
        b = random.nextInt(0, 256);
        graphic.setColor(new Color(r, g, b));
        backgroundColor = new Color(r % 256, g % 256, b % 256);

    }

    public void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
        }
    }

    private void redraw() {
        erase();
        for (Object shape : objects) {
            shapes.get(shape).draw(graphic);
        }
        canvas.repaint();
    }

    private void erase() {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
    }

    private class CanvasPane extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }

    private class ShapeDescription {
        private Shape shape;
        private String colorString;

        public ShapeDescription(Shape shape, String color) {
            this.shape = shape;
            colorString = color;
        }

        public void draw(Graphics2D graphic) {
            setForegroundColor(colorString);
            graphic.fill(shape);
        }
    }
}
