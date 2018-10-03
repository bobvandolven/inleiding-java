package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr8d2 extends Applet {

    Button Man, Woman, Boys, Girls;
    int ManI, WomanI, BoysI, GirlsI, total;

    public void init() {

        Man = new Button("Man");
        Man.addActionListener(new ManListener());
        add(Man);

        Woman = new Button("Woman");
        Woman.addActionListener(new WomanListener());
        add(Woman);

        Boys = new Button("Boys");
        Boys.addActionListener(new BoysListener());
        add(Boys);

        Girls = new Button("Girls");
        Girls.addActionListener(new GirlsListener());
        add(Girls);

        ManI = 0;
        WomanI = 0;
        BoysI = 0;
        GirlsI = 0;
        total = 0;
    }

    public void paint(Graphics g) {

        g.drawString("Amount of Gentlemen: " + ManI, 50, 50);
        g.drawString("Amount of Ladies: " + WomanI, 50, 80);
        g.drawString("Potential amount of Gentlemen: " + BoysI, 50, 110);
        g.drawString("Potential amount of Ladies: " + GirlsI, 50, 140);
        g.drawString("Total: " + total, 50, 170);
        total = ManI + WomanI + BoysI + GirlsI;
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            ManI++;
            total++;
            repaint();

        }
    }

        class WomanListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                WomanI++;
                total++;
                repaint();
            }
        }

        class BoysListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                BoysI++;
                total++;
                repaint();
            }
        }

        class GirlsListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                GirlsI++;
                total++;
                repaint();
            }
        }
}