package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for(int counter = 1; counter < 50; counter++){
            g.drawOval(300-counter*5, 300-counter*5, counter*10, counter*10);
        }
    }
}