package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for(int i = 1; i < 6; i++){
            g.drawOval(50-i*6, 50-i*6, i*12, i*12);
        }
    }
}