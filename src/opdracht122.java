import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht122 extends Applet {
    Button knop;
    Button[] knoppen;

    public void init() {
        knoppen = new Button[25];
        for (int teller = 0; teller < knoppen.length; teller ++) {
        knoppen[teller] = new Button("knop");
        add(knoppen[teller]);
        }

        knop = new Button("Knop");
        add(knop);

    }

    public void paint(Graphics g) {
        }
    }



