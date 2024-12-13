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

public class Postest extends JPanel {
    private int x = 0; 
    private int y = 0; 
    private int deltaX = 3; 
    private int deltaY = 3; 
    private final int SIZE = 50; 

    
    private Timer timer;

    public Postest() {
        timer = new Timer(15, e -> { 
            x += deltaX;
            y += deltaY;

            
            if (x + SIZE > getWidth() || x < 0) {
                deltaX = -deltaX;
            }
            if (y + SIZE > getHeight() || y < 0) {
                deltaY = -deltaY;
            }

            repaint(); 
        });
        timer.start(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED); 
        g.fillRect(x, y, SIZE, SIZE); 
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi Kotak Bergerak"); 
        Postest animasi = new Postest(); 
        frame.add(animasi);
        frame.setSize(500, 500); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}
