package gui.project.ex02;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Event05 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public Event05() {
        this.setSize(400, 150);

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재 카운터 값: " + counter);

        button.addActionListener(e -> {
            counter++;
            label.setText("현재의 카운터 값: " + counter);
        });

        panel.add(label);
        panel.add(button);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Event05();
    }
}
