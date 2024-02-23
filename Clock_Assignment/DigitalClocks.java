// digital clock using java awt and swing beautiful GUI

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import java.text.SimpleDateFormat;

public class DigitalClocks extends JFrame {

    private JLabel jlTime = new JLabel("Time", JLabel.CENTER);

    public DigitalClocks() {
        setLayout(new FlowLayout());
        add(jlTime);
        Timer timer = new Timer(1000, new TimerListener());
        timer.start();
    }

    private class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            jlTime.setText(sdf.format(new Date()));
        }
    }

    public static void main(String[] args) {
        DigitalClocks frame = new DigitalClocks();
        frame.setTitle("Digital Clock");
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
