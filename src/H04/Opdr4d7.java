package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4d7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        /*Dice Base*/
        g.drawRect(120,100,100,100);

        /*Dice 1st Ball*/
        g.fillArc(135,115,25,25,0,360);

        /*Dice 2nd Ball*/
        g.fillArc(180,115,25,25,0,360);

        /*Dice 3rd Ball*/
        g.fillArc(135,165,25,25,0,360);

        /*Dice 4th Ball*/
        g.fillArc(180,165,25,25,0,360);
    }
}