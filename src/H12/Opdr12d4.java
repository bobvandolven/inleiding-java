package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr12d4 extends Applet {
    boolean gevonden;
    int[] salaris = { 1, 3, 5, 7, 9 };
    int gezocht;
    TextField text;
    String s;
    Button button;

    public void init() {
        text = new TextField(8);
        add(text);

        button = new Button("Ok");
        button.addActionListener(new fieldListener());
        add(button);

        s = "";
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 20, 50);
            g.drawString("Index: ", 20, 70);
            text.setText("");
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
            text.setText("");
        }
    }

    class fieldListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s = text.getText();

            gezocht = Integer.parseInt(s);
            gevonden = false;
            int teller = 0;
            while(teller < salaris.length) {
                if(salaris[teller] == gezocht) {
                    gevonden = true;
                }
                teller ++;
            }
            repaint();
        }
    }
}