import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht101 extends Applet {
    int getal;
    int hoogstegetal;
    TextField tekstvak;
    Label label;
    int kleinstegetal;



    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        hoogstegetal = 0;
        kleinstegetal = 100000000;

        label = new Label("zie het hoogste getal en het kleinste getal" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString( "" + hoogstegetal, 50, 45 );
        g.drawString("" + kleinstegetal, 50, 60);
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > hoogstegetal ) {
                hoogstegetal = getal;

            }
            if (getal < kleinstegetal)  {
                kleinstegetal = getal;


            }
            repaint();
        }
    }
}
