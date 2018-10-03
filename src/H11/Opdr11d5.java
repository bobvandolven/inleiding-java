package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int breedte = 10;
        int hoogte = 10;
        for (int kolom = 0; kolom < 5; kolom++) {
            g.drawRect(x+breedte*kolom, y+hoogte*kolom, breedte, hoogte);
        }
    }
}