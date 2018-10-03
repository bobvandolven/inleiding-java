package H06;

import java.applet.Applet;
import java.awt.*;


public class Opdr6d2 extends Applet {
    int Sec, Hrs, Day, Month, Year, a, b, c, d;

    public void init() {
        Sec = 60; //60seconds
        Hrs = 60; //60mins
        Day = 24; //24hrs
        Year = 365; //365Days
        a = Hrs * Sec;
        b = a * Day;
        c = b * Year;
        d = c + b;
    }

    public void paint(Graphics g) {
        g.drawString("1uur  heeft: " + a + " Seconden", 20, 20);
        g.drawString("1dag heeft: " + b + " Seconden", 20, 40);
        g.drawString("1jaar heeft: " + c + " Seconden", 20, 60);
        g.drawString("een schrikkel jaar heeft: " + d + " Seconden", 20, 80);
    }
}