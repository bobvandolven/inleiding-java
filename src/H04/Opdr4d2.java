package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4d2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLUE);

        /*Triangle*/
        g.drawLine(130, 180, 180, 100);
        g.drawLine(225, 180, 180, 100);
        g.drawLine(130, 180, 225, 180);

        /*House*/
        g.drawRect(130, 180, 95, 95);

        /*Window 1*/
        g.drawRect(140, 190, 30, 30);

        /*Window 2*/
        g.drawRect(185, 190, 30, 30);

        /*Window 1 Left*/
        g.drawLine(140, 210, 155, 190);
        g.drawLine(140, 210, 150, 220);

        /*Window 1 Right*/
        g.drawLine(170, 210, 155, 190);
        g.drawLine(170, 210, 160, 220);

        /*Window 2 Left*/
        g.drawLine(185, 210, 200, 190);
        g.drawLine(185, 210, 195, 220);

        /*Window 2 Right*/
        g.drawLine(215, 210, 200, 190);
        g.drawLine(215, 210, 205, 220);

        /*Door left*/
        g.drawLine(165, 275, 165, 235);
        /*Door top*/
        g.drawLine(190, 235, 165, 235);
        /*Door Right*/
        g.drawLine(190, 275, 190, 235);
    }
}