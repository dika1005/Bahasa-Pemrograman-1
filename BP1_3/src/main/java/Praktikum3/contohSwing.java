/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author Fujitsu U938
 */
import javax.swing.*;
import java.awt.event.*;

public class contohSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Swing Container dan Menu");
        
        JPanel panel = new JPanel();
        frame.add(panel);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        fileMenu.add(openItem);
        fileMenu.addSeparator(); 
        fileMenu.add(exitItem);
        
        menuBar.add(fileMenu);
        
        frame.setJMenuBar(menuBar);

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

