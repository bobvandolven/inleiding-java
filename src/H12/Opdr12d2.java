package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdr12d2 extends Applet {
    Button button[];

    public void init () {
        button = new Button [25];

    }

    public void paint (Graphics g){
            g.drawString("" + button, 50, 20 + 20);
        }
    }