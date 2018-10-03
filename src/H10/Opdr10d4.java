package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr10d4 extends Applet {
    TextField textbox;
    Label label;
    String s, text;
    int month, year;

    public void init() {
        setSize(500, 300);
        textbox = new TextField("", 15);
        add(textbox);
        label = new Label("Type the number of the Year and press Enter");
        add(label);
        textbox.addActionListener(new textboxListener());
        text = "";
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 60);

    }

    class textboxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textbox.getText();
            year = Integer.parseInt(s);
            if ( (year % 4 == 0 && !(year % 100 == 0)) ||
                    year % 400 == 0 ) {
                text = ""+ year + " is a leap year, feb has 29days";
            }
            else {
                text = ""+ year + " is not a leap year, feb has 28days";
            }
            repaint();
        }
    }
}