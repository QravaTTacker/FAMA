package labs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Ex021 {
    public static void main(String[] args) throws Exception {

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        ImageIcon myIcon = new ImageIcon(
                "C:/Users/Cristian Pessotto/OneDrive/Imagens/Saved Pictures/Animes/anime1.jpg");

        JFrame window = new JFrame("Minha Janela");
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1080, 650);
        window.setResizable(false);
        window.getContentPane().setBackground(new Color(0x662220));
        window.setIconImage(myIcon.getImage());
        window.setLayout(null);

        Border border = BorderFactory.createLineBorder(new Color(0xaa2220), 3);

        JLabel hello = new JLabel();
        hello.setText("Hello, World!");
        hello.setFont(new Font("Agency FB", Font.BOLD, 100));
        hello.setForeground(new Color(255, 0, 0));
        hello.setBackground(new Color(0x451715));
        hello.setOpaque(true);
        hello.setBorder(border);
        // helloLabel.setVerticalTextPosition(JLabel.CENTER);
        // helloLabel.setHorizontalTextPosition(JLabel.CENTER);
        hello.setVerticalAlignment(JLabel.CENTER);
        hello.setHorizontalAlignment(JLabel.CENTER);
        hello.setSize(500, 200);

        int posXLabel = (int) (window.getWidth() / 2 - hello.getWidth() / 2);
        int posYLabel = (int) (window.getHeight() / 2 - hello.getHeight() / 2);
        hello.setBounds(posXLabel, posYLabel - 50, hello.getWidth(), hello.getHeight());
        // helloLabel.setLocation(posXLabel, posYLabel);

        window.add(hello);

        int posX = (int) (tela.width / 2 - window.getWidth() / 2);
        int posY = (int) (tela.height / 2 - window.getHeight() / 2);
        window.setLocation(new Point(posX, posY));

        System.out.format("WidthL: %d\nHeightL: %d\n", hello.getWidth(), hello.getHeight());
        System.out.format("Width: %d\nHeight: %d\n", window.getWidth(), window.getHeight());
        System.out.format("Resolution: %dx%d", tela.width, tela.height);
    }
}
