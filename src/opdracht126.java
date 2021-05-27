import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht126 extends Applet {
    int getallen[] = { 1, 1, 1};
    int input;
    TextField tekstvak;
    Button knop;
    int totaal;

    public void init() {
        knop = new Button("Klik op mij");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        tekstvak = new TextField("", 20);
        add(tekstvak);
        add(knop);
        totaal = 0;
    }

    public void paint(Graphics g) {
        for( int teller = 0; teller < getallen.length; teller++){
            if (getallen[teller] == input){
                totaal++;
            }
        }


        g.drawString("het getal" + input + "komt " + totaal + "keer voor", 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            input = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }
}