import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht83 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    int teller;


    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("potentiele vrouwen");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
        knop2 = new Button("potentiele mannen");
        knop2.addActionListener( new knop2Listener() );
        add(knop2);
        knop3 = new Button("mannen");
        knop3.addActionListener( new knop3Listener() );
        add(knop3);
        knop4 = new Button("vrouwen");
        knop4.addActionListener ( new knop4Listener() );
        add(knop4);
        teller = 0;


    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            teller++;
            tekstvak.setText("Er zijn " + teller +
                    " bezoekers");
            repaint();
        }
    }

    class knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            tekstvak.setText("Er zijn " + teller +
                    " bezoekers");
        }
    }


    class knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            tekstvak.setText("Er zijn " + teller +
                    " bezoekers");
        }
    }

    class knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            tekstvak.setText("Er zijn " + teller +
                    " bezoekers");
        }
    }
}

