package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for(int i = 1; i < 100; i++){
            g.drawOval(350-i*3, 350-i*3, i*6, i*6);
        }
    }
}