import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijkopdracht8 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Button knop;
    Button knop1;
    Button knop2;
    Button knop3;
    String s;
    String s1;








    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak2 = new TextField("", 30);
        knop = new Button("/");
        knop1 = new Button("*");
        knop2 = new Button("+");
        knop3 = new Button("-");
        knop.addActionListener( new knopListener() );
        knop1.addActionListener( new knop1Listener() );
        knop2.addActionListener( new knop2Listener() );
        knop3.addActionListener( new knop3Listener() );
        add(tekstvak);
        add(tekstvak2);
        add(knop);
        add(knop1);
        add(knop2);
        add(knop3);
        s ="";
        s1 = "";




    }

    public void paint(Graphics g) {
        g.drawString("bereken hier uw bedrag inclusief 21% belasting " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60 );
    }

    class knopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText( );
            s1 = tekstvak2.getText( );
            double berekening = Double.parseDouble ( s ); //Hier zeg je dat een double is.
            double berekening1 = Double.parseDouble( s1 );
            double antwoord = berekening / berekening1;
            tekstvak.setText(antwoord +  "");
            tekstvak2.setText("");

            repaint();


        }
    }

    class knop1Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            s1 = tekstvak2.getText( );
            double berekening = Double.parseDouble ( s ); //Hier zeg je dat een double is.
            double berekening1 = Double.parseDouble (s1 );
            double antwoord = berekening * berekening1;
            tekstvak.setText (antwoord + "");//Hier zeg je dat het weer in het scherm moet.
            tekstvak2.setText ("");
            repaint();



        }
    }

    class knop2Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText( );
            s1 = tekstvak2.getText( );
            double berekening = Double.parseDouble ( s ); //Hier zeg je dat een double is.
            double berekening1 = Double.parseDouble ( s1 );
             double antwoord = berekening + berekening1;
            tekstvak.setText(antwoord + "");
            tekstvak2.setText("");
            repaint();


        }
    }

    class knop3Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText( );
            s1 = tekstvak2.getText( );
            double berekening = Double.parseDouble ( s ); //Hier zeg je dat een double is.
            double berekening1 = Double.parseDouble ( s1 );
            double antwoord = berekening - berekening1;
            tekstvak.setText(antwoord + "");
            tekstvak2.setText("");
            repaint();


        }
    }
}

