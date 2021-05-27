import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht125 extends Applet {
    int getallen[] = {6, 9, 12, 15, 14};
    int zoekdit;
    TextField tekstvak;
    Button knop;


    public void init() {
        knopListener kl = new knopListener();
        zoekdit = 0;
        knop = new Button("ok");
        knop.setLabel("Klik op mij");
        knop.addActionListener( kl );
        add(knop);
        tekstvak = new TextField("", 20);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller++) {
            if (getallen[teller] == zoekdit) {
                g.drawString("ja gevonden", 20, 50);
            }  if( teller > 12) {
                break;
            }

        }

    }
    class knopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            zoekdit =Integer.parseInt(tekstvak.getText());
            repaint();


        }
    }
}



