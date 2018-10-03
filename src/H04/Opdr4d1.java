package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4d1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(130, 180, 180, 100);
        g.drawLine(225, 180, 180, 100);
        g.drawLine(130, 180, 225, 180);
    }
}