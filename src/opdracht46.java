import java.awt.*;
import java.applet.*;

public class opdracht46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillOval(10, 10, 200, 450);
        g.setColor(Color.red);
        g.fillOval(60, 20, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(60, 150, 100, 100);
        g.setColor(Color.green);
        g.fillOval(60, 280, 100, 100);
    }
}
