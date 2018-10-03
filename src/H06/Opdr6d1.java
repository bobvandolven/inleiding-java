package H06;

import java.applet.Applet;
import java.awt.*;


public class Opdr6d1 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 2;
        b = 2;
        c = 113;
        uitkomst = c / (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("Jan:" + uitkomst, 20, 20);
        g.drawString("Ali:" + uitkomst, 20, 40);
        g.drawString("Jeannette:" + uitkomst, 20, 60);
        g.drawString("Ik:" + uitkomst, 20, 80);
    }
}