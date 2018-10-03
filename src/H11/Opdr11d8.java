package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for(int counter = 1; counter < 100; counter++){
            g.drawOval(350-counter*3, 350-counter*3, counter*6, counter*6);
        }
    }
}