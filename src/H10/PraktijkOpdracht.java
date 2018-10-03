package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    private TextField textbox;
    private Label label;
    private String s;
    private int inputnumber;

    public void init() {
        setSize(400, 300);
        textbox = new TextField(8);
        textbox.addActionListener( new textboxListener() );
        add(textbox);

        label = new Label("Write Your Result (1-10)");
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 80);
    }

    class textboxListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            inputnumber = Integer.parseInt(textbox.getText());
            if (inputnumber == 1) {
                s = "" + inputnumber + " Slecht";
            }
            else if (inputnumber == 2) {
                s = "" + inputnumber + " Slecht";
            }
            else if (inputnumber == 3) {
                s = "" + inputnumber + " Slecht";
            }
            else if (inputnumber == 4) {
                s = "" + inputnumber + " Onvoldoende";
            }
            else if (inputnumber == 5) {
                s = "" + inputnumber + " Matig";
            }
            else if (inputnumber == 6) {
                s = "" + inputnumber + " Voldoende";
            }
            else if (inputnumber == 7) {
                s = "" + inputnumber + " Voldoende";
            }
            else if (inputnumber == 8) {
                s = "" + inputnumber + " Goed";
            }
            else if (inputnumber == 9) {
                s = "" + inputnumber + " Goed";
            }
            else if (inputnumber == 10) {
                s = "" + inputnumber + " Goed";
            }
            else {
                s = "Invalid Number";
            }
            repaint();
        }
    }
}

