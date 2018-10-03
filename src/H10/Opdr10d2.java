package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10d2 extends Applet {
    TextField textbox;
    Label labeltext;
    String string;
    int inputnumber, maxnumber, minnumber;

    public void init() {
        labeltext = new Label("Write a number!");
        add(labeltext);
        textbox = new TextField("", 10);
        textbox.addActionListener(new textboxListener());
        add(textbox);

        inputnumber = 0;
        maxnumber = 0;
        minnumber = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Numbers: " + inputnumber,50 , 60);
        g.drawString("Highest Number: " + maxnumber,50 , 80);
        g.drawString("Lowest Number: " + minnumber,50 , 100);
    }

    class textboxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = textbox.getText();
            inputnumber = Integer.parseInt( string );
            if (inputnumber > maxnumber) {
                maxnumber = inputnumber;
            }
            if (inputnumber < minnumber) {
                minnumber = inputnumber;
            }
            repaint();
        }
    }
}