package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr12d1 extends Applet {
    int num[] = new int[10];
    int counter;
    private TextField text;

    public void init () {
        text = new TextField(7);
        text.addActionListener(new textListener());
        add(text);

        for (int counter = 0; counter < num.length; counter++)
            num[counter] = 7 * counter + 7;

    }


    public void paint(Graphics g) {
            g.drawString("" + num[counter], 50, 50);
        }

        class textListener implements ActionListener {
            public void actionPerformed (ActionEvent event) {
                for ( counter = 0; counter < num.length; counter++)
                num[counter] = Integer.parseInt(text.getText());

                repaint();
            }
        }
    }