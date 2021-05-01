import java.awt.*;
import java.applet.*;

public class opdracht47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRoundRect(70, 20, 300, 300, 10, 10);
        g.setColor(Color.black);
        g.fillOval(230, 40, 100, 100);
        g.fillOval(230, 170, 100, 100);
        g.fillOval(100, 40, 100, 100);
        g.fillOval(100, 170, 100, 100);
    }
}
