package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10d1 extends Applet {
    TextField textbox;
    Label label;
    String s;
    int inputnumber, maxnumber;

    public void init() {
        label = new Label("Write a number!");
        add(label);
        textbox = new TextField("", 10);
        textbox.addActionListener(new textboxListener());
        add(textbox);

        inputnumber = 0;
        maxnumber = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Numbers: " + inputnumber,50 , 60);
        g.drawString("Highest Number: " + maxnumber,50 , 80);
    }

    class textboxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textbox.getText();
            inputnumber = Integer.parseInt( s );
            if (inputnumber > maxnumber) {
                maxnumber = inputnumber;
            }

            repaint();
        }
    }
}