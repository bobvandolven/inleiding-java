package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11d3 extends Applet {
    long num[];
    public void init() {
        num = new long[10];

        for (int i = 0; i < num.length; i++) {
            if (i > 0)
                System.out.print(", ");
            if (i <= 1){
                num[i]= 1;
            }
            else {
                num[i]= num[i-1]+num[i-2];
            }
            System.out.print(num[i]);
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < num.length; i++) {
        g.drawString(""+num[i] ,20 , 20+20*i);}
    }
}