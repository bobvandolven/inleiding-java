package H06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
            double a, b, c, d, e, math, result;
            int SWAP, f;


        public void init () {
            a = 5.9;
            b = 6.9;
            c = 6.3;
            d = 3;
            e = 10;
            f = 10;
            math = (a+b+c) / d * e;
            SWAP = (int)math;
            result = (double)SWAP / f;


        }

        public void paint(Graphics g) {
            g.drawString("Het Gemiddelde is: " + result, 20,20);
        }
}
