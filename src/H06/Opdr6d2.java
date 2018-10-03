package H06;

import java.applet.Applet;
import java.awt.*;


public class Opdr6d2 extends Applet {
    int Sec, Hrs, Day, Year, a, b, c, d;

    public void init() {
        Sec = 60; //60seconds
        Hrs = 60; //60mins
        Day = 24; //24hrs
        Year = 365; //365Days
        a = Hrs * Sec; // a is used to make the Hours into seconds
        b = a * Day;   // b is used to make the Days into seconds
        c = b * Year;  // c is used to make the Year into seconds
        d = c + b;     // d is used to make the Year combine with Days for a *Schrikkel* jaar
    }

    public void paint(Graphics g) {
        g.drawString("1uur  heeft: " + a + " Seconden", 20, 20);
        g.drawString("1dag heeft: " + b + " Seconden", 20, 40);
        g.drawString("1jaar heeft: " + c + " Seconden", 20, 60);
        g.drawString("een schrikkel jaar heeft: " + d + " Seconden", 20, 80);
    }
}