package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d2 extends Applet {

    public void init () {}

    public void paint (Graphics g){
        int counter;
        int y = 0;  // y = position Y of the string

        for (counter = 20; counter > 10; counter--) {
            y += 20;
            g.drawLine(50,y,300,y);
            g.drawString("" + counter, 305,y);
        }
    }
}
