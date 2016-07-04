package edu.drexel.assignment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

/**
 * Created by Angel on 7/4/2016.
 */
public class Program3 implements KeyListener {

    public static final String LABEL_PREFIX = "Your average hold time is: ";

    private JLabel label;
    private JTextField textField;

    private float totalKeyPressTime = 0;
    private float numOfKeyPresses = 0;
    private long lastKeyPressStart = 0;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() ->
                new Program3().createAndShowGUI()
        );
    }

    private void createAndShowGUI() {
        final JFrame frame = new JFrame("Program 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.Y_AXIS));

        label = new JLabel(LABEL_PREFIX + "Unknown");
        textField = new JTextField();
        textField.addKeyListener(this);
        textField.addActionListener((ActionEvent e) -> {
            label.setText(LABEL_PREFIX + (totalKeyPressTime / numOfKeyPresses) + " ms");
            textField.setText("");
            totalKeyPressTime = 0;
            numOfKeyPresses = 0;
            frame.pack();
        });

        outerPanel.add(label);
        outerPanel.add(textField);

        textField.grabFocus();

        frame.getContentPane().add(outerPanel);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        lastKeyPressStart = new Date().getTime();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        numOfKeyPresses++;
        totalKeyPressTime += new Date().getTime() - lastKeyPressStart;
    }
}
