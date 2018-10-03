package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdr5d1 extends Applet {
    /*declaratie*/
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //teken rechthoek
        g.drawString("rechthoek",100,215);
        g.drawRect(100, 100, breedte, hoogte);

        //teken afgeronde rechthoek
        g.drawString("afgeronde rechthoek",100,340);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);

        //teken ovaal
        g.setColor(lijnkleur);
        g.drawString("Gevulde Rechthoek met ovaal erin",315,215);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);

        //teken gevulde ovaal
        g.setColor(lijnkleur);
        g.drawString("Gevulde Ovaal",315,340);
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        // taartpunt met ovaal
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal",570,215);
        g.drawOval(530,100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530,100,200,100,0,30);

        // cirkel
        g.setColor(lijnkleur);
        g.drawString("Cirkel",570,340);
        g.drawRoundRect(570,225,100,100,100,100);

        // lijn
        g.drawLine(100,50,300,50);
        g.drawString("Lijn", 180,62);
    }
}