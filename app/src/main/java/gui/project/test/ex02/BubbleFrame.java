package gui.project.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        backgroundMap = new JLabel(new ImageIcon("image\\backgroundMap.png"));
        setContentPane(backgroundMap);

        setSize(1000, 600);
        setLayout(null);
        setLocationRelativeTo(null);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }

}
