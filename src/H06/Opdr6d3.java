package H06;

import java.applet.Applet;
import java.awt.*;


public class Opdr6d3 extends Applet {
        int number1, number2, number3, result;

    public void init() {
        number1 = 10;
        number2 = 20;
        number3 = 40;
        result = (number1 + number2) - number3;
    }

    public void paint(Graphics g) {
        g.drawString("Het Uitkomst Is: " + result, 20,20);
    }
}