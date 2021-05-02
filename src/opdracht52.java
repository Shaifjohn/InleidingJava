import java.awt.*;
import java.applet.*;

public class opdracht52 extends Applet {
    Color lijnkleur;
    Color opvulkleur;
    int hoogteValerie;
    int hoogteJeroen;
    int hoogteHans;

    public void init() {
        lijnkleur = Color.black;
        opvulkleur = Color.magenta;
        int hoogteValerie = 40;
        int hoogteJeroen = 100;
        int hoogteHans = 80;
    }

    public void paint(Graphics g) {
        g.setColor(opvulkleur);
        g.drawRect(100, 100, 20, hoogteValerie);
        g.drawRect(150, 100, 20, hoogteJeroen);
        g.drawRect(200, 100, 20, hoogteHans);




    }
}