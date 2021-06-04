

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht133 extends Applet {
    Button knop, knop2;
    boolean beton = false;


    void bouwMuur( int hoogtebaksteen, int breedtebaksteen, Color kleur, int aantalop, int aantalnaast , Graphics g) {
            for (int hoogte = 0; hoogte < aantalop; hoogte++) {
                for (int breedte = 0; breedte < aantalnaast; breedte++) {
                int x = breedte * breedtebaksteen;
                int y = hoogte * hoogtebaksteen;
                g.setColor(kleur);
                g.fillRect(x, y, breedtebaksteen, hoogtebaksteen);
                g.setColor(Color.darkGray);
                g.drawRect(x, y, breedtebaksteen, hoogtebaksteen);

            }
        }
    }
    public void init(){
        knop2 = new Button("betonblokken");
        knop = new Button("rode muur");
        knop2.addActionListener( new knop2Listener() );
        knop.addActionListener( new knopListener() );
        add(knop);
        add(knop2);

    }

    public void paint(Graphics g) {

        if (beton){
            bouwMuur(40, 20, Color.gray, 5, 5, g);
        }else{
            bouwMuur(10, 20, Color.red, 5, 5, g);
        }

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            beton = false;


            repaint();
        }
    }

    class knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            beton = true;


            repaint();
        }
    }
}
