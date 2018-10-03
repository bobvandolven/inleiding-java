package H04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdr extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        /*Line*/
        g.drawLine(25, 25, 120, 25);
        g.drawString("Lijn", 60,39);

        /*Cube*/
        g.drawRect(25,50,100,100);
        g.drawString("Rechthoek",45,164);

        /*Round Corners Cube*/
        g.drawRoundRect(25,175,100,100,30,30);
        g.drawString("Afgeronde Rechthoek", 25,289);

        /*Filled Cube With Oval In It*/
        g.drawString("Gevulde Rechthoek Met Ovaal",150,165);
        g.setColor(Color.MAGENTA);
        g.fillRect(150,50,150,100);
        g.setColor(Color.black);
        g.drawOval(150,50,150,100);

        /*Filled Oval*/
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal",180,289);
        g.setColor(Color.magenta);
        g.fillOval(150,175,150,100);

        /*Pie Chart*/
        g.setColor(Color.black);
        g.drawString("Taartpunt Met Ovaal Eromheen",330,165);
        g.drawOval(330,50,150,100);
        g.setColor(Color.magenta);
        g.fillArc(330,50,150,100,0,30);

        /*Circle*/
        g.setColor(Color.black);
        g.drawString("cirkel", 385,289);
        g.drawRoundRect(350,175,100,100,100,100);
    }
}