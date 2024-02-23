import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

public class AnalogClock extends JPanel {

  private static final int padding = 50;
  private static final int handLength = 100;
  int xOrigin = 958, yOrigin = 490, xsec, ysec, xmin, ymin, xhr, yhr;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int clockRadius = Math.min(getWidth(), getHeight()) / 2 - padding;
    int clockX = getWidth() / 2;
    int clockY = getHeight() / 2;
    g.drawOval(
      clockX - clockRadius,
      clockY - clockRadius,
      2 * clockRadius,
      2 * clockRadius
    );

    Calendar c = Calendar.getInstance();
    int hour = c.get(Calendar.HOUR);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    drawHand(g, hour * 30 + minute / 2 - 90, clockRadius / 2, clockX, clockY); // hour
    drawHand(g, minute * 6 - 90, clockRadius * 3 / 4, clockX, clockY); // minute
    drawHand(g, second * 6 - 90, clockRadius, clockX, clockY); // second

    
 // Clock Circles
//  g.setColor(Color.blue);
//  g.fillOval(xOrigin - 160, yOrigin - 160, 820, 820);
//  g.setFont(new Font("TimesRoman", Font.BOLD, 25));
//  g.setColor(Color.black);
//  g.fillOval(xOrigin - 150, yOrigin - 150, 300, 300); 

 // Clock Midpoint
 g.setColor(Color.green);
 g.fillOval(xOrigin - 5, yOrigin - 5, 20, 20);
    //my code// Clock Lable
        g.setColor(Color.red);
        g.setFont(new Font("TimesRoman", Font.BOLD, 60));

        // g.drawString("12", xOrigin - 10, yOrigin - 130);
        g.drawString("12", xOrigin - 25, yOrigin - 375);
        // g.drawString("1", xOrigin + 70, yOrigin - 115);
        g.drawString("1", xOrigin + 190, yOrigin - 330);
        // g.drawString("2", xOrigin + 119, yOrigin - 64);
        g.drawString("2", xOrigin + 335, yOrigin - 180);
        // g.drawString("3", xOrigin + 135, yOrigin + 5);
        g.drawString("3", xOrigin + 392, yOrigin + 18);
        // g.drawString("4", xOrigin + 120, yOrigin + 74);
        g.drawString("4", xOrigin + 325, yOrigin + 230);
        // g.drawString("5", xOrigin + 65, yOrigin + 125);
        g.drawString("5", xOrigin + 200, yOrigin + 365);
        // g.drawString("6", xOrigin - 5, yOrigin + 145);
         g.drawString("6", xOrigin - 5, yOrigin + 425);
        // g.drawString("7", xOrigin - 70, yOrigin + 125);
        g.drawString("7", xOrigin - 225, yOrigin + 375);
        // g.drawString("8", xOrigin - 125, yOrigin + 80);
        g.drawString("8", xOrigin - 380, yOrigin + 200);
        // g.drawString("9", xOrigin - 145, yOrigin + 0);
        g.drawString("9", xOrigin - 420, yOrigin + 20);
        // g.drawString("10", xOrigin - 125, yOrigin - 65);
        g.drawString("10", xOrigin - 360, yOrigin - 190);
        // g.drawString("11", xOrigin - 80, yOrigin - 110);
         g.drawString("11", xOrigin - 230, yOrigin - 320);

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
