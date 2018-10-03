package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for(int counter = 1; counter < 6; counter++){
            g.drawOval(50-counter*6, 50-counter*6, counter*12, counter*12);
        }
    }
}