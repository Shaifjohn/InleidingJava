import java.awt.*;
import java.applet.*;


public class opdracht118 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
    int afmeting = 10;
    for(int teller = 0; teller < 101; teller++) {
        afmeting += 10;
        g.drawOval(50, 50, afmeting, afmeting);
    }

    }

}