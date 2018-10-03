package JavaChallenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Challenge2 extends Applet {
    Button fris, bier, wijn, koffie, binn, buit, nieuwe;
    double frisD, bierD, wijnD, koffieD, binnD, buitD, nieuweD, totaal, omzet;

    public void init() {
        this.setLayout(null);

        fris = new Button("fris");
        fris.addActionListener(new frisListener());
        add(fris);
        fris.setBounds(70, 0, 50, 25);

        bier = new Button("bier");
        bier.addActionListener(new bierListener());
        add(bier);
        bier.setBounds(130, 0, 50, 25);

        wijn = new Button("wijn");
        wijn.addActionListener(new wijnListener());
        add(wijn);
        wijn.setBounds(190, 0, 50, 25);

        koffie = new Button("koffie");
        koffie.addActionListener(new koffieListener());
        add(koffie);
        koffie.setBounds(250, 0, 50, 25);

        binn = new Button("binn Gedist.");
        binn.addActionListener(new binnListener());
        add(binn);
        binn.setBounds(100, 30, 80, 25);

        buit = new Button("buit. Gedist.");
        buit.addActionListener(new buitListener());
        add(buit);
        buit.setBounds(190, 30, 80, 25);

        nieuwe = new Button("nieuwe bestelling");
        nieuwe.addActionListener(new nieuweListener());
        add(nieuwe);
        nieuwe.setBounds(125, 60, 120, 25);

        frisD = 2.25;
        bierD = 2.50;
        wijnD = 2.75;
        koffieD = 2;
        binnD = 3;
        buitD = 3.75;

    }

    public void paint(Graphics g) {
        g.drawString("Bestelling totaal: " + totaal, 50, 140);
        g.drawString("totaal dagomzet: " + omzet, 50, 170);
    }

    class frisListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            totaal = frisD + totaal;
            omzet = frisD + omzet;
            repaint();
        }
    }

    class bierListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            totaal = bierD + totaal;
            omzet = bierD + omzet;
            repaint();
        }
    }

    class wijnListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            totaal = wijnD + totaal;
            omzet = wijnD + omzet;
            repaint();
        }
    }

    class koffieListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            totaal = koffieD + totaal;
            omzet = koffieD + omzet;
            repaint();
        }
    }

    class binnListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            totaal = binnD + totaal;
            omzet = binnD + omzet;
            repaint();
        }
    }

    class buitListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            totaal = buitD + totaal;
            omzet = buitD + omzet;
            repaint();
        }
    }

    class nieuweListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            totaal = nieuweD;
            repaint();
        }
    }
}