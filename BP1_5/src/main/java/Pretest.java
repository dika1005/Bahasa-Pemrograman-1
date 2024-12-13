/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fujitsu U938
 */
import javax.swing.*;
import java.awt.*;

public class Pretest extends JPanel {
    private int x = 0; 
    private final int Y_POS = 100; 
    private final int DIAMETER = 50;

    private Timer timer;

    public Pretest() {
        timer = new Timer(20, e -> {
            x += 10; 
            if (x > getWidth()) {
                x = -DIAMETER; 
            }
            repaint(); 
        });
        timer.start(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE); 
        g.fillOval(x, Y_POS, DIAMETER, DIAMETER); 
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi 2D dengan Swing"); 
        Pretest animasi = new Pretest(); 
        frame.add(animasi);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}

