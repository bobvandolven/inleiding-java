package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4d5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20,20,50,50,0,360);
    }
}