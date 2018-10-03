package JavaChallenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Challenge3 extends Applet {
    TextField text;
    Label label, label2;
    Button plus, min;
    int x, i, p, s;
    double textD, plusD, minD;

    public void init(){
        label = new Label("Rekening bedrag");

        label2 = new Label("Percentage fooi          " + "%");

        text = new TextField("", 25);
        text.addActionListener(new textListener());

        plus = new Button("+");
        plus.addActionListener(new plusListener());

        min = new Button("-");
        min.addActionListener(new minListener());

        plusD = 0;
        minD = 0;

        s = 15;

        add(label);
        add(text);
        add(label2);
        add(min);
        add(plus);
    }

    public void paint (Graphics g){
        g.drawString("" + s, 50, 100);
        g.drawString("Fooi: ", 50 , 120 );
        g.drawString("Totaal incl fooi", 50 , 140);
    }

    class textListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            repaint();
        }
    }

    class plusListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s++;

            repaint();
        }
    }

    class minListener implements ActionListener {
        public void actionPerformed (ActionEvent e){
            s--;

            repaint();
        }
    }
}
