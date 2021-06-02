

import java.awt.*;
import java.applet.*;

public class opdracht131 extends Applet {
    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1); //parameteres zijn vaiabelen, die je wilt gebruiken in methode.
        // teken een driehoek m.b.v. de meegegeven data (parameters)
    }

    public void init() {
    }

    public void paint(Graphics g) {

        tekenDriehoek(g, 20, 25, 40,60, 100, 50);
    }
}