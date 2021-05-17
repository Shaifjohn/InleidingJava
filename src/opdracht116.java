import java.awt.*;
import java.applet.*;


public class opdracht116 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int afmeting = 10;
        for(int teller = 0; teller < 6; teller++) {
            afmeting += 10;
            g.drawOval(50, 50, afmeting, afmeting);
        }

    }

}