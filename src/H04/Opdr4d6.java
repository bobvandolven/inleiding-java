package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4d6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        /*Traffic Light Left*/
        g.drawLine(120,200,120,80);

        /*Traffic Light Right*/
        g.drawLine(180,200,180,80);

        /*Traffic Light Top*/
        g.drawLine(120,80,180,80);

        /*Traffic Light Bot*/
        g.drawLine(120,200,180,200);

        /*Traffic Light Pole Left*/
        g.drawLine(145,280,145,200);

        /*Traffic Light Pole Right*/
        g.drawLine(155,280,155,200);

        /*Traffic Light Pole Bot*/
        g.drawLine(145,280,155,280);

        /*Traffic Light Red*/
        g.setColor(Color.red);
        g.fillArc(137,95,27,27,0,360);

        /*Traffic Light Yellow*/
        g.setColor(Color.yellow);
        g.fillArc(137,130,27,27,0,360);

        /*Traffic Light Green*/
        g.setColor(Color.green);
        g.fillArc(137,165,27,27,0,360);
    }
}