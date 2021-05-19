    import java.awt.*;
    import java.applet.*;


    public class opdracht116 extends Applet {


        public void init() {}

        public void paint(Graphics g) {
            int afmeting = 10;
            for(int teller = 0; teller < 5; teller++) {
                afmeting += 10;
                g.drawRect(50-(afmeting/2), 50-(afmeting/2), afmeting, afmeting);
            }

        }

    }