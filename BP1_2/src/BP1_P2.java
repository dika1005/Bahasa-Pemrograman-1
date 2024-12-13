/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 *
 * @author Fujitsu U938
 */
public class BP1_P2 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void paint(Graphics g){
        Font f = new Font("comic sans Ms", Font.BOLD, 20);
        g.setFont(f);
        g.setColor(Color.red);
        int xPusat = this.getSize().width/2;
        int yPusat = this.getSize().height/2;
        String s = "Ayo Belajar java applet!!!";
        FontMetrics fm = this.getFontMetrics(f);
        int posisiX = xPusat - (fm.stringWidth(s)/2);
        g.drawString("ayo belajar java applet", posisiX, yPusat);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
