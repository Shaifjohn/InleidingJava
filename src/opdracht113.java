import java.awt.*;
import java.applet.*;


public class opdracht113 extends Applet {
    int a = 0;
    int b = 1;
    int c;

    public void init() {}

    public void paint(Graphics g) {
    int y = 0;
    y += 20;
    g.drawString("" + a, 305, y);
    y += 20;
    g.drawString("" + b, 305, y);

        for(int teller = 0; teller < 10; teller++) {
            y += 20;
            c = a + b;
            a = b;
            b = c;
            g.drawString("" + c, 305, y );
        }
    }
}