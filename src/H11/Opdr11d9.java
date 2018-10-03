package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d9 extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {
        setBackground(Color.gray);
        for (int y = 0; y < 8; y++)
        for (int x = 0; x < 8; x++) {
            g.setColor(Color.white);
            if((y % 2 == 0 && x % 2 == 0) ||
                     (y % 2 == 1 && x % 2 == 1))
                g.setColor(Color.black);
            g.fillRect(20+20*x,20+20*y,20,20);
        }

            g.drawRect(20,20,20*8,20*8);

    }
}