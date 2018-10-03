package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int counter;
        int y = 0;
        int i = 3;

        for(counter = 1; counter < 11; counter++) {
            y += 20;
            g.drawString("" + counter + " * " + i + " = " + counter*i , 30, y );
        }
    }
}