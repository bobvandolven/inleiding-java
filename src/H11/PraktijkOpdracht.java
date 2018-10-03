package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

        Button ok;
        Label label;
        TextField text;
        String string, Array[];
        int counter;
        int x; // x is used to typecast the string into an INT

    public void init () {

        ok = new Button("Ok");
        label = new Label("Write a number");
        text = new TextField(8);

        ok.addActionListener(new okListener());

        add(label);
        add(text);
        add(ok);
        string = "";

    }

    public void paint (Graphics g) {
        if (Array != null)
        for (int i = 0; i < Array.length; i++) // i is used for the amount of times that the array has to multiply its Y position to have enough space for each arrays
        g.drawString( Array[i] , 30, 50+20*i );
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = text.getText();
            x = Integer.parseInt(string);
            text.setText("");
            int maxnum = 10;
            Array = new String[maxnum];
            for(counter = 1; counter <= maxnum; counter++) {
                Array[counter-1] = (counter + " * " + x + " = " + counter*x);
            }

            repaint();
        }
    }
}
