package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr8d1 extends Applet {
    TextField tekstvak;
    Label label;
    Button Ok;
    Button No;
    String string;

    public void init() {
        tekstvak = new TextField("", 20);

        label = new Label("Write Something!");

        Ok = new Button("Ok");
        Ok.addActionListener( new KnopListener() );

        No = new Button("Reset");
        No.addActionListener( new KnoppListener() );

        add(label);
        add(tekstvak);
        add(Ok);
        add(No);
        string = "";
    }

    public void paint(Graphics g) {
        g.drawString(string, 60,70);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            string = tekstvak.getText();
            repaint();
        }
    }

    class KnoppListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }
}