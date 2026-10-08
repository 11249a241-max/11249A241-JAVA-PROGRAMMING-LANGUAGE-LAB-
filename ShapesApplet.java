import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {

    public void paint(Graphics g) {

        // Rectangle
        g.drawRect(50, 50, 120, 70);

        // Circle
        g.drawOval(220, 50, 80, 80);

        // Line
        g.drawLine(50, 160, 300, 160);

        // Triangle
        int x[] = {150, 100, 200};
        int y[] = {200, 280, 280};

        g.drawPolygon(x, y, 3);
    }
}