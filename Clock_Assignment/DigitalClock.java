// create analog clock using java awt and swing package with beautiful GUI

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class AnalogClock extends JPanel {
    private static final int padding = 50;
    private static final int handLength = 100; // adjust to fit within your JPanel

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int clockRadius = Math.min(getWidth(), getHeight()) / 2 - padding;
        int clockX = getWidth() / 2;
        int clockY = getHeight() / 2;
        g.drawOval(clockX - clockRadius, clockY - clockRadius, 2 * clockRadius, 2 * clockRadius);

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        drawHand(g, hour * 30 + minute / 2 - 90, clockRadius / 2, clockX, clockY); // hour
        drawHand(g, minute * 6 - 90, clockRadius * 3 / 4, clockX, clockY); // minute
        drawHand(g, second * 6 - 90, clockRadius, clockX, clockY); // second
    }

    private void drawHand(Graphics g, double angle, int length, int x, int y) {
        int endX = x + (int) (length * Math.cos(Math.toRadians(angle)));
        int endY = y + (int) (length * Math.sin(Math.toRadians(angle)));
        g.drawLine(x, y, endX, endY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        AnalogClock clock = new AnalogClock();
        frame.add(clock);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        new Timer(1000, e -> clock.repaint()).start();
    }
}