package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for(int i = 1; i < 50; i++){
            g.drawOval(300-i*5, 300-i*5, i*10, i*10);
        }
    }
}