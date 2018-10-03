package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr8d2 extends Applet {

    Button Man, Woman, Boys, Girls;
    int ManInt, WomanInt, BoysInt, GirlsInt, total;

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

        ManInt = 0;
        WomanInt = 0;
        BoysInt = 0;
        GirlsInt = 0;
        total = 0;
    }

    public void paint(Graphics g) {

        g.drawString("Amount of Gentlemen: " + ManInt, 50, 50);
        g.drawString("Amount of Ladies: " + WomanInt, 50, 80);
        g.drawString("Potential amount of Gentlemen: " + BoysInt, 50, 110);
        g.drawString("Potential amount of Ladies: " + GirlsInt, 50, 140);
        g.drawString("Total: " + total, 50, 170);
        total = ManInt + WomanInt + BoysInt + GirlsInt;
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            ManInt++;
            total++;
            repaint();

        }
    }

        class WomanListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                WomanInt++;
                total++;
                repaint();
            }
        }

        class BoysListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                BoysInt++;
                total++;
                repaint();
            }
        }

        class GirlsListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                GirlsInt++;
                total++;
                repaint();
            }
        }
}