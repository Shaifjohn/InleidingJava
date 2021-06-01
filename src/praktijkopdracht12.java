import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class praktijkopdracht12 extends Applet {
    //stap 1 is aanmaken van de array met een naam
    TextField[] tekstvakken;
    TextField[] namen;
    Button knop;
    String[] namenArray = {"Shaif", "John", "Dollart"};
    String[] telefoonArray = {"0612345678", "0612345679", "0612345670"};
    int teller = 0;

    public void init(){
        //stap 2 hoeveel texfields er in de array zitten
        //
        //namenArray = new String[3];
        //telefoonArray = new String[3];
        tekstvakken = new TextField[1];
        namen = new TextField[1];
        knop = new Button("Voeg toe");
        knop.addActionListener( new knopListener() );
        for (int i = 0; i < tekstvakken.length; i++){
            tekstvakken[i] = new TextField("Vul hier je telefoonnummer in!", 20);
            namen[i] = new TextField("Vul hier je naam in!", 20);
            add(tekstvakken[i]); add(namen[i]);

        }

        add(knop);
    }
    public void paint(Graphics g){
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            namen[0].setText(namenArray[teller]);
            teller++;
            if (teller >= namenArray.length) teller = 0;

            tekstvakken[0].setText(telefoonArray[teller]);
            teller++;
            if (teller >= telefoonArray.length) teller = 0;
            //namenArray = Integer.parseInt(namen[0].getText());
            //telefoonArray = Integer.parseInt(tekstvakken.getText());
            repaint();
        }
    }
}



