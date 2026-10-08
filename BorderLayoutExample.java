import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Border Layout");

        frame.setLayout(new BorderLayout());

        frame.add(new JButton("Header"), BorderLayout.NORTH);
        frame.add(new JButton("Footer"), BorderLayout.SOUTH);
        frame.add(new JButton("Menu"), BorderLayout.WEST);
        frame.add(new JButton("Right Side"), BorderLayout.EAST);
        frame.add(new JButton("Content"), BorderLayout.CENTER);

        frame.setSize(500, 300);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}