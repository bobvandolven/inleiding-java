package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr8d3 extends Applet {
    private double number1;
    private double number2;
    private TextField text;
    private Label label;
    String s;


    public void init () {
        setSize(400, 300);
        text = new TextField(8);
        text.addActionListener(new textListener());
        label = new Label("Inclusief 21% Btw!");
        add(label);
        add(text);
        s = "";
        number2 = 1.21;
    }
        public void paint (Graphics g) {
            g.drawString("" + number1 * number2, 50, 50);
        }


    class textListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            number1 = Double.parseDouble(text.getText());

            repaint();
        }

    }

}
