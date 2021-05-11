import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht104 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, tekst1;
    int maand;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst1, 50, 70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst1 = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst1 = ""+ jaartal + " is geen schrikkeljaar";
            }

            switch(maand) {
                case 1:
                    tekst = "januari";
                    break;
                case 2:
                    tekst = "februari";
                    break;
                case 3:
                    tekst = "maart";
                    break;
                case 4:
                    tekst = "april";
                    break;
                case 5:
                    tekst = "mei";
                    break;
                case 6:
                    tekst = "juni";
                    break;
                case 7:
                    tekst = "juli";
                    break;
                case 8:
                    tekst = "augustus";
                    break;
                case 9:
                    tekst = "september";
                    break;
                case 10:
                    tekst = "oktober";
                    break;
                case 11:
                    tekst = "november";
                    break;
                case 12:
                    tekst = "december";
                    break;
                default:
                    tekst = "is het een schrikkeljaar?...";
                    break;


            }
            repaint();
        }
    }
}
