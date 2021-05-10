import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht101 extends Applet {
    int grootstegetal;
    int getal;
    TextField tekstvak;
    Label label;


    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        grootstegetal = 0;

        label = new Label("zet getallen en zie welke groter is" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString("" + grootstegetal, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
             getal = Integer.parseInt( s );

            if (getal > grootstegetal ){
                grootstegetal = getal;

                repaint();
            }




        }
    }
}