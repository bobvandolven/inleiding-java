package H06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
            double Gemidel1, Gemidel2, Gemidel3, divideDouble, multiply, math, result;
            int SWAP, divideInt;


        public void init () {
            Gemidel1 = 5.9;
            Gemidel2 = 6.9;
            Gemidel3 = 6.3;
            divideDouble = 3;
            multiply = 10;
            divideInt = 10;
            math = (Gemidel1+Gemidel2+Gemidel3) / divideDouble * multiply; // combining all 3results together than dividing it into 3 than multiply with 10
            SWAP = (int)math; // TypeCasting into Int
            result = (double)SWAP / divideInt; // TypeCastin to Double than dividing it with 10


        }

        public void paint(Graphics g) {
            g.drawString("Het Gemiddelde is: " + result, 20,20);
        }
}
