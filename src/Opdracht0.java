import java.awt.*;
        import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Opdracht0 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(120, 130, 280, 130);
        g.drawLine(120, 130, 200, 65);
        g.drawLine(200, 65, 280, 130);
        g.drawRect(120, 130, 160, 70);
        g.drawRect(140, 150, 80, 40);
        g.drawRect(250, 160, 15, 40);
        g.drawRect(300, 130, 5, 120);
        g.setColor(Color.red);
        g.fillRect(300, 130, 100, 25);
        g.setColor(Color.white);
        g.fillRect(300, 155, 100, 25);
        g.setColor(Color.blue);
        g.fillRect(300, 180, 100, 25);
        g.setColor(Color.black);
        g.drawLine(100, 450, 300, 450);
        g.drawLine(100, 450, 100, 100 );
        g.drawLine(50, 120, 100, 120);
        g.drawLine(50, 140, 100, 140);
        g.drawLine(50, 160, 100, 160);
        g.drawLine(50, 180, 100, 180);
        g.drawLine(50,200, 100,200);
        g.drawLine(50,220, 100,220);
        g.drawLine(50,240, 100,240);
        g.drawLine(50,260, 100,260);
        g.drawLine(50,280, 100,280);
        g.drawLine(50,300, 100,300);
        g.drawLine(50,320, 100,320);
        g.drawLine(50,340, 100,340);
        g.drawLine(50,360, 100,360);
        g.drawLine(50,380, 100,380);
        g.drawLine(50,400, 100,400);
        g.drawLine(50,420, 100,420);
        g.drawLine(50, 440, 100, 440);
        g.setColor(Color.magenta);
        g.fillRect(100, 400 , 40, 50);
        g.fillRect(160, 340, 40, 110);
        g.fillRect(220, 340, 40, 110);


    }

}

