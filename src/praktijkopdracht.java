import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(80, 30, 270, 30);
        g.drawString("Lijn", 150, 50 );
        g.drawRect(80, 60, 190, 80);
        g.drawString("Rechthoek", 150, 160 );
        g.drawRoundRect(80, 200, 190, 90, 30, 30);
        g.drawString("afgeronde rechthoek", 110, 310 );
        g.setColor(Color.magenta);
        g.fillRect(300, 60, 190, 80);
        g.setColor(Color.black);
        g.drawOval(300, 60, 190, 80);
        g.drawString("rechthoek met ovaal erin", 300, 160);
        g.setColor(Color.magenta);
        g.fillOval(300, 200, 190, 80);
        g.setColor(Color.black);
        g.drawString("ovaal", 380, 300);
        g.drawOval(520, 200, 100, 100);
        g.drawString("cirkel",540, 330);
        g.setColor(Color.magenta);
        g.fillArc(500, 100, 100, 50, 90, 45);
        g.setColor(Color.black);
        g.drawOval(500, 100, 100, 50);




    }
}