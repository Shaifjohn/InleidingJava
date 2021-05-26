import java.awt.*;
import java.applet.*;

public class opdracht121 extends Applet {
    double salaris[];
    double gemiddelde;

    public void init() {
        salaris = new double [10];


        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);

        }
    }
}