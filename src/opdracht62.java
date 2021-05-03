import java.awt.*;
import java.applet.*;

public class opdracht62 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int jaaruitkomst;
    int daguitkomst;
    int uuruitkomst;


    public void init() {
        a = 60;
        b = 3600;
        c = 24;
        d = 365;
        e = 86400;
        uuruitkomst = a * a;
        daguitkomst = b * c;
        jaaruitkomst = d * e;






    }

    public void paint(Graphics g) {
        g.drawString("jaaruitkomst is:" + uuruitkomst, 20, 35);
        g.drawString("daguitkomst is:" + daguitkomst, 20, 50);
        g.drawString("jaaruitkomst is:" + jaaruitkomst, 20, 65);





    }
}