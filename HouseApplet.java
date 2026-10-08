import java.applet.Applet;
import java.awt.*;

public class HouseApplet extends Applet {

    public void paint(Graphics g) {

        // House body
        g.drawRect(100, 150, 200, 150);

        // Roof
        int x[] = {80, 200, 320};
        int y[] = {150, 60, 150};
        g.drawPolygon(x, y, 3);

        // Door
        g.drawRect(175, 220, 50, 80);

        // Left window
        g.drawRect(120, 180, 40, 40);

        // Right window
        g.drawRect(240, 180, 40, 40);
    }
}