// create analog clock using java awt and swing package with beautiful GUI
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;

public class DigitalClockc extends JFrame {
    JLabel timeLabel;
    Timer timer;
    int hour, minute, second;
    String time;
    Calendar calendar;

    public DigitalClockc() {  //CONSTRUCTOR
        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        timeLabel.setOpaque(true);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setForeground(Color.WHITE);
        add(timeLabel);

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calendar = Calendar.getInstance();
                hour = calendar.get(Calendar.HOUR_OF_DAY);
                minute = calendar.get(Calendar.MINUTE);
                second = calendar.get(Calendar.SECOND);
                time = String.format("%02d:%02d:%02d", hour, minute, second);
                timeLabel.setText(time);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        DigitalClockc clock = new DigitalClockc();
        clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.setSize(400, 200);
        clock.setVisible(true);
    }
}