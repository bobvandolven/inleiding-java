package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr10d3 extends Applet {
    TextField textbox;
    Label label;
    String string, text;
    int month;

    public void init() {
        setSize(500,300);
        textbox = new TextField("", 15);
        add(textbox);
        label = new Label("Type the number of the month and press Enter");
        add(label);
        textbox.addActionListener( new textboxListener());
        text = "";
    }
        public void paint(Graphics g) {
            g.drawString(text, 50, 60);

    }

    class textboxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = textbox.getText();
            month = Integer.parseInt( string );
            switch(month) {
                case 1:
                    text = "January 31Days";
                    break;
                case 2:
                    text = "February 29Days";
                    break;
                case 3:
                    text = "March 31Days";
                    break;
                case 4:
                    text = "April 30Days";
                    break;
                case 5:
                    text = "May 31Days";
                    break;
                case 6:
                    text = "June 30Days";
                    break;
                case 7:
                    text = "July 31Days";
                    break;
                case 8:
                    text = "August 31Days";
                    break;
                case 9:
                    text = "September 30Days";
                    break;
                case 10:
                    text = "October 31Days";
                    break;
                case 11:
                    text = "November 30Days";
                    break;
                case 12:
                    text = "December 31Days";
                    break;
                default :
                    text = "Not a vaild number";
                    break;
            }
            repaint();
        }
    }
}