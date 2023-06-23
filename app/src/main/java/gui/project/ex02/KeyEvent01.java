package gui.project.ex02;

import java.awt.DisplayMode;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEvent01 extends MyFrame implements KeyListener {
    KeyEvent01() {
        JTextField tf = new JTextField(20);
        tf.addKeyListener(this);
        add(tf);
        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        display(e, "KeyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        display(e, "keyPressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        display(e, "keyReleased");
    }

    private void display(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int KeyCode = e.getKeyCode();
        String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();

        System.out.println(s + " " + c + " " + KeyCode + " " + modifiers);
    }

    public static void main(String[] args) {
        new KeyEvent01();
    }
}