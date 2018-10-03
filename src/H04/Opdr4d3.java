package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4d3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        /*Pole left*/
        g.drawLine(20,20,20,260);
        /*Pole Right*/
        g.drawLine(25,20,25,260);
        /*Pole Top*/
        g.drawLine(25,20,20,20);
        /*Pole Bot*/
        g.drawLine(25,260,20,260);
        /*Flag Base*/
        g.drawRect(25,20,150,75);
        /*Flag Red*/
        g.setColor(Color.red);
        g.fillRect(26,21,149,25);
        /*Flag Blue*/
        g.setColor(Color.blue);
        g.fillRect(26,70,149,25);
    }
}
