package Laba4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnalogClock extends JFrame {
    private int hours = 0;
    private int minutes = 0;

    public AnalogClock() {
        setTitle("Аналоговые часы");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ClockPanel clockPanel = new ClockPanel();
        add(clockPanel, BorderLayout.CENTER);

        JButton increaseHourButton = new JButton("+ час");
        JButton decreaseHourButton = new JButton("- час");
        JButton increaseMinuteButton = new JButton("+ минута");
        JButton decreaseMinuteButton = new JButton("- минута");
        increaseHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hours = (hours + 1) % 12;
                clockPanel.repaint();
            }
        });

        decreaseHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hours = (hours - 1 + 12) % 12;
                clockPanel.repaint();
            }
        });

        increaseMinuteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minutes = (minutes + 1) % 60;
                clockPanel.repaint();
            }
        });

        decreaseMinuteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minutes = (minutes - 1 + 60) % 60;
                clockPanel.repaint();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2));
        buttonPanel.add(decreaseHourButton);
        buttonPanel.add(increaseHourButton);
        buttonPanel.add(decreaseMinuteButton);
        buttonPanel.add(increaseMinuteButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    class ClockPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;

            // Цеферблат
            g.setColor(Color.WHITE);
            g.fillOval(centerX - 100, centerY - 100, 200, 200);

            double hourAngle = Math.toRadians((hours % 12) * 30 - 90);
            double minuteAngle = Math.toRadians(minutes * 6 - 90);

            // Часовая стрелка
            int hourHandLength = 50;
            int hourHandX = (int) (centerX + hourHandLength * Math.cos(hourAngle));
            int hourHandY = (int) (centerY + hourHandLength * Math.sin(hourAngle));
            g.setColor(Color.BLACK);
            g.drawLine(centerX, centerY, hourHandX, hourHandY);

            // Минутная стрелка
            int minuteHandLength = 80;
            int minuteHandX = (int) (centerX + minuteHandLength * Math.cos(minuteAngle));
            int minuteHandY = (int) (centerY + minuteHandLength * Math.sin(minuteAngle));
            g.setColor(Color.RED);
            g.drawLine(centerX, centerY, minuteHandX, minuteHandY);
        }
    }

}
