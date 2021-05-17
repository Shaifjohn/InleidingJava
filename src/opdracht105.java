import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht105 extends Applet {
    Button knop;
    TextField tekstvak;
    Label label;
    String s, s1, tekst, tekst1;
    int cijfer;
    float gemiddelde;
    float totaal;
    int aantal;

    public void init() {
        knop = new Button("ok");
        tekstvak = new TextField("", 20);
        label = new Label("Type het cijfer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        knop.addActionListener( new knopListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst1, 50, 75);
    }

    class knopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            gemiddelde = totaal / aantal;
            tekst1 = gemiddelde + "";
            repaint();

        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s);
            totaal += cijfer;
            aantal++;



            switch(cijfer) {
                case 1:
                    tekst = "onvoldoende";
                    break;
                case 2:
                    tekst = "onvoldoende";
                    break;
                case 3:
                    tekst = "onvoldoende";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "onvoldoende";
                    break;
                case 6:
                    tekst = "voldoende";
                    break;
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "voldoende";
                    break;
                case 9:
                    tekst = "voldoende";
                    break;
                case 10:
                    tekst = "voldoende";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;


            }
            repaint();
        }
    }
}