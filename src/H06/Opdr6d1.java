package H06;

import java.applet.Applet;
import java.awt.*;


public class Opdr6d1 extends Applet {
    double number1, number2, number3, uitkomst;


    public void init() {
        number1 = 2;
        number2 = 2;
        number3 = 113;
        uitkomst = number3 / (number1 + number2);
    }

    public void paint(Graphics g) {
        g.drawString("Jan:" + uitkomst, 20, 20);
        g.drawString("Ali:" + uitkomst, 20, 40);
        g.drawString("Jeannette:" + uitkomst, 20, 60);
        g.drawString("Ik:" + uitkomst, 20, 80);
    }
}