import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht82 extends Applet {
    TextField tekstvak;
    Button knop;
    String s;
    double getal;
    double a;





    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
        s ="";
        a = 1.21;






    }

    public void paint(Graphics g) {
        g.drawString("bereken hier uw bedrag inclusief 21% belasting " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();

            repaint();


        }
    }
}
