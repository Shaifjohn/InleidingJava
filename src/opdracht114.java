import java.awt.*;
import java.applet.*;


public class opdracht114 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tafel = 3;
        int y = 0;
        int uitkomst;


        for(int teller = 1; teller <= 10; teller++) {
            uitkomst = tafel * teller;
            y += 20;








            g.drawString(uitkomst +"=" + teller + "*" +tafel, 305, y);

        }
    }
}