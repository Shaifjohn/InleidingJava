import java.awt.*;
import java.applet.*;

public class opdracht63 extends Applet {
    double a;
    double b;
    double c;
    double d;
    double e;
    double gemiddelde;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        gemiddelde = (a + b + c) / d;









    }

    public void paint(Graphics g) {
        g.drawString(" het gemiddelde =" +  gemiddelde, 20, 35);






    }
}