package gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MyFrame extends JFrame {

    public MyFrame() {
        setSize(300, 150);
        setTitle("Layout");

        setLayout(new BorderLayout());

        JButton button = new JButton("North");
        JButton button2 = new JButton("South");
        JButton button3 = new JButton("East");
        JButton button4 = new JButton("West");
        JButton button5 = new JButton("Center");

        add(button, "North");
        add(button2, "South");
        add(button3, "East");
        add(button4, "west");
        add(button5, "Center");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
