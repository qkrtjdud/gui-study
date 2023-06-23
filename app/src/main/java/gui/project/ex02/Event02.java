package gui.project.ex02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        // counter++;
        // label.setText("현재의 카운터: " + counter);
    }

}

public class Event02 extends JFrame {

    private JButton button;
    private JLabel label;
    int counter = 0;

    public Event02() {
        setSize(400, 150);
        setLayout(new FlowLayout());
        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값: " + counter);
        button.addActionListener(new MyListener());

        add(button);
        add(label);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Event02();
    }
}
