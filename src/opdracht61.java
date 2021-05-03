import java.awt.*;
import java.applet.*;

public class opdracht61 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {

        a = 113;
        b = 4;
        uitkomst = a / b;


    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt:" + uitkomst, 20, 35);
        g.drawString("Al krijgt:" + uitkomst, 20, 50);
        g.drawString("Jeanette krijgt:" + uitkomst, 20, 65);
        g.drawString("ik krijg:" + uitkomst, 20, 80);





    }
}