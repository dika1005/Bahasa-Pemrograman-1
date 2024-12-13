/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package postest;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import java.applet.Applet;

/**
 *
 * @author Fujitsu U938
 */
public class BP1_M2_PostTest1_Dika_AppletMouse extends Applet {

private int mouseX = 0;
    private int mouseY = 0;
    private String message = "";

    @Override
    public void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                message = "Mouse clicked at (" + mouseX + ", " + mouseY + ")";
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }
}
