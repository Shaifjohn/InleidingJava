

import java.awt.*;
import java.applet.*;

public class opdracht132 extends Applet {
   void bouwMuur( int hoogtebaksteen, int breedtebaksteen, Color kleur, int aantalop, int aantalnaast , Graphics g) {
       for (int hoogte = 0; hoogte < aantalop; hoogte++) {
           for (int breedte = 0; breedte < aantalnaast; breedte++) {
            int x = breedte * breedtebaksteen;
            int y = hoogte * hoogtebaksteen;
            g.setColor(kleur);
            g.drawRect(x, y, breedtebaksteen, hoogtebaksteen);

           }
       }
   }
    public void init(){
    }

    public void paint(Graphics g) {
       bouwMuur(10, 20, Color.red, 5, 5, g);


    }
}
