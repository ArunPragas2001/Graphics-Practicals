import javax.swing.*;
import java.awt.*;

public class MathLine extends JFrame {

    public MathLine() {
        // Set the frame size
        setSize(800, 800);
        setTitle("DDA Line Drawing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    // DDA Line Drawing Algorithm implemented in paint()
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Example line coordinates
        int x1 = 100;
        int y1 = 100;
        int x2 = 500;
        int y2 = 300;

        drawLineDDA(g, x1, y1, x2, y2);
    }

    public void drawLineDDA(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        // Calculate increment in x & y for each step
        double xinc = (double) dx / steps;
        double yinc = (double) dy / steps;

        double x = x1;
        double y = y1;

        // Draw pixels
        for (int i = 0; i <= steps; i++) {
            g.fillRect((int) Math.round(x), (int) Math.round(y), 1, 1); // Draw a pixel
            x += xinc;
            y += yinc;
        }
    }

    public static void main(String[] args) {
        new MathLine(); // Run the program
    }
}
