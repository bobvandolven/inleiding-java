package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10d5 extends Applet {
    private TextField textbox, textbox2;
    private Label label;
    private String s;
    private Button plus;
    private double inputnumber, Passed;
    private double number1, number2;

    public void init() {
        setSize(400, 300);
        textbox = new TextField(8);
        add(textbox);

        textbox2 = new TextField(8);
        add(textbox2);

        plus = new Button("+");
        plus.addActionListener( new plusListener() );
        add(plus);

        label = new Label("Your Score (1 - 100)");
        add(label);

        inputnumber = 0;
        Passed = 5.5;

    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 80);
        g.drawString(" 0 - 5.0 = Failed",200,80);
        g.drawString(" 5.5 - 10 = Passed", 200,100);
    }

    class plusListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            number1 = Double.parseDouble(textbox.getText());
            number2 = Double.parseDouble(textbox2.getText());
            double result = (number1 + number2) / 2;
            textbox.setText(String.valueOf(result));
            textbox2.setText("");

            s = textbox.getText();
            inputnumber = Double.parseDouble(s);
            if (inputnumber == Passed) {
                s = "" + inputnumber + " You Passed";
            }
            if (inputnumber < Passed) {
                s = "" + inputnumber + " You Failed";
            }
            if (inputnumber > Passed) {
                s = "" + inputnumber + " You Passed";
            }
            repaint();
        }
    }
}

