package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktiijkOpdracht extends Applet {
   private double number1;
   private double number2;
   private TextField textField1, textField2;
   private Button plus, minus, multiply, divide;


    public void init (){
        setSize(400, 300);
        textField1 = new TextField(8);
        add(textField1);
        textField2 = new TextField(8);
        add(textField2);

        plus = new Button("+");
        plus.addActionListener( new plusListener() );
        add(plus);
        minus = new Button("-");
        minus.addActionListener( new minusListener() );
        add(minus);
        multiply = new Button("x");
        multiply.addActionListener( new multiplyListener());
        add(multiply);
        divide = new Button("/");
        divide.addActionListener( new divideListener());
        add(divide);
    }

    class plusListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            String A = textField1.getText();
            number1 = Double.parseDouble(A);
            String B = textField2.getText();
            number2 = Double.parseDouble(B);
            double result = number1 + number2;
            textField1.setText(String.valueOf(result));
            textField2.setText("");
        }

    }

    class minusListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            String A = textField1.getText();
            number1 = Double.parseDouble(A);
            String B = textField2.getText();
            number2 = Double.parseDouble(B);
            double result = number1 - number2;
            textField1.setText(String.valueOf(result));
            textField2.setText("");
        }

    }

    class multiplyListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            String A = textField1.getText();
            number1 = Double.parseDouble(A);
            String B = textField2.getText();
            number2 = Double.parseDouble(B);
            double result = number1 * number2;
            textField1.setText(String.valueOf(result));
            textField2.setText("");
        }

    }

    class divideListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            String A = textField1.getText();
            number1 = Double.parseDouble(A);
            String B = textField2.getText();
            number2 = Double.parseDouble(B);
            double result = number1 / number2;
            textField1.setText(String.valueOf(result));
            textField2.setText("");
        }

    }
}
