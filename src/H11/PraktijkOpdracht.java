package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

        Button ok;
        Label label;
        TextField text;
        String s, d[];
        int counter;
        int x;

    public void init () {

        ok = new Button("Ok");
        label = new Label("Write a number");
        text = new TextField(8);

        ok.addActionListener(new okListener());

        add(label);
        add(text);
        add(ok);
        s = "";

    }

    public void paint (Graphics g) {
        if (d != null)
        for (int i = 0; i < d.length; i++)
        g.drawString( d[i] , 30, 50+20*i );
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text.getText();
            x = Integer.parseInt( s );
            text.setText("");
            int maxnum = 10;
            d = new String[maxnum];
            for(counter = 1; counter <= maxnum; counter++) {
                d[counter-1] = (counter + " * " + x + " = " + counter*x);
            }

            repaint();
        }
    }
}
