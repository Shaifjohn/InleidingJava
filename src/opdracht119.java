import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht119 extends Applet {
    TextField tekstvak;
    Button knop;
    String s;
    int uitkomst;
    int tafel;
    Label label;
    int y = 70;
    int teller;




    public void init() {
        label = new Label("typ een getal van 1 tot 10 en klik op ok om de tafel" +
                " van het ingevoerde getal te zien");
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        s = "";
        add(label);





    }

    public void paint(Graphics g) {
         y = 70;
        for (int teller = 1; teller <= 10;teller++) {
            uitkomst = tafel * teller;

            y += 20;
            g.drawString( "" + uitkomst + "=" + tafel + "*" + teller, 50, y);




        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tafel = Integer.parseInt(s); //Hier zeg je dat het een int is.

        repaint();
        }


    }
}
