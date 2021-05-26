import java.awt.*;
import java.applet.*;

public class opdracht121 extends Applet {
    double salaris[];
    double totaal;
    double gemiddelde;

    public void init() {
        salaris = new double [10];
        totaal = 0;

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            totaal += salaris[teller];


        }
        gemiddelde = totaal / salaris.length;
        g.drawString("het gemiddelde is" + gemiddelde, 100, 70);
    }
}