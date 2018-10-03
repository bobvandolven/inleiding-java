package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4d4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        /*Pie Chart Base*/
        g.drawRoundRect(45, 45, 230, 190, 20, 20);
        /*Valerie*/
        g.setColor(Color.red);
        g.drawString("Valerie   40Kg", 55, 200 );
        g.fillArc(50, 50, 125, 125, 180, 80);
        /*Jeroen*/
        g.setColor(Color.green);
        g.drawString("Jeroen 100Kg", 55, 215 );
        g.fillArc(50, 50, 125, 125, 380, 160);
        /*Hans*/
        g.setColor(Color.blue);
        g.drawString("Hans      80Kg", 55, 230 );
        g.fillArc(50, 50, 125, 125, 260, 120);
    }
}