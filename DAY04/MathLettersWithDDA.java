import javax.swing.*;
import java.awt.*;

 public class MathLettersWithDDA extends JFrame {

    public MathLettersWithDDA() {
        setTitle("Draw MATH using DDA Line Algorithm");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new DrawPanel());
        setVisible(true);
    }

    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);

            int x = 50;
            int y = 200;
            int w = 50;
            int h = 100;
            int spacing = 30;

            // Draw letters one by one
            drawM(g, x, y, w, h);
            x += w + spacing;

            drawA(g, x, y, w, h);
            x += w + spacing;

            drawT(g, x, y, w, h);
            x += w + spacing;

            drawH(g, x, y, w, h);
        }

        // ==========================
        // DDA line drawing algorithm
        // ==========================
        private void drawLineDDA(Graphics g, int x1, int y1, int x2, int y2) {
            int dx = x2 - x1;
            int dy = y2 - y1;

            int steps = Math.max(Math.abs(dx), Math.abs(dy));

            double xInc = dx / (double) steps;
            double yInc = dy / (double) steps;

            double x = x1;
            double y = y1;

            for (int i = 0; i <= steps; i++) {
                g.fillRect((int) Math.round(x), (int) Math.round(y), 1, 1);
                x += xInc;
                y += yInc;
            }
        }

        // Letter M
        private void drawM(Graphics g, int x, int y, int w, int h) {
            drawLineDDA(g, x, y, x, y + h);                     // Left vertical
            drawLineDDA(g, x, y, x + w / 2, y + h / 2);         // Left diagonal
            drawLineDDA(g, x + w / 2, y + h / 2, x + w, y);     // Right diagonal
            drawLineDDA(g, x + w, y, x + w, y + h);             // Right vertical
        }

        // Letter A
        private void drawA(Graphics g, int x, int y, int w, int h) {
            drawLineDDA(g, x, y + h, x + w / 2, y);             // Left diagonal up
            drawLineDDA(g, x + w / 2, y, x + w, y + h);         // Right diagonal down
            drawLineDDA(g, x + w / 4, y + h / 2, x + 3 * w / 4, y + h / 2); // Middle bar
        }

        // Letter T
        private void drawT(Graphics g, int x, int y, int w, int h) {
            drawLineDDA(g, x, y, x + w, y);                     // Top horizontal
            drawLineDDA(g, x + w / 2, y, x + w / 2, y + h);     // Middle vertical
        }

        // Letter H
        private void drawH(Graphics g, int x, int y, int w, int h) {
            drawLineDDA(g, x, y, x, y + h);                     // Left vertical
            drawLineDDA(g, x + w, y, x + w, y + h);             // Right vertical
            drawLineDDA(g, x, y + h / 2, x + w, y + h / 2);     // Middle horizontal
        }
    }

    public static void main(String[] args) {
        new MathLettersWithDDA();
    }
}
