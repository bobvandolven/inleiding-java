package H06;

import java.applet.Applet;
import java.awt.*;


public class Opdr6d3 extends Applet {
        int a, b, c, result;

    public void init() {
        a = 10;
        b = 20;
        c = 40;
        result = (a + b) - c;
    }

    public void paint(Graphics g) {
        g.drawString("Het Uitkomst Is: " + result, 20,20);
    }
}