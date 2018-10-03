package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d3 extends Applet {
    long number[];
    public void init() {
        number = new long[10];

        for (int i = 0; i < number.length; i++) {
            if (i > 0)
                System.out.print(", ");
            if (i <= 1){
                number[i]= 1;
            }
            else {
                number[i]= number[i-1]+ number[i-2];
            }
            System.out.print(number[i]);
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < number.length; i++) {
        g.drawString(""+ number[i] ,20 , 20+20*i);}
    }
}