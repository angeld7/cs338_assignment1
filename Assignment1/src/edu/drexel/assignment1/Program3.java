package edu.drexel.assignment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

/**
 * Angel Delgado
 * ald363@drexel.edu
 * CS338: GUI, Assignment 1
 */
public class Program3 implements KeyListener {

    public static final String LABEL_PREFIX = "Your average hold time is: ";

    private JLabel label;
    private JTextField textField;

    private float totalKeyPressTime = 0;
    private float numOfKeyPresses = 0;
    private long lastKeyPressStart = 0;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Program3().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        final JFrame frame = new JFrame("Program 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.Y_AXIS));

        label = new JLabel(LABEL_PREFIX + "Unknown");
        textField = new JTextField();
        textField.addKeyListener(this);
        textField.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Calculate the average hold time by dividing to total hold time by the number of key presses
                label.setText(LABEL_PREFIX + (totalKeyPressTime / numOfKeyPresses) + " ms");
                frame.pack();
            }
        }));

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
        //Get the time that this key was initially pressed down
        lastKeyPressStart = new Date().getTime();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //The number of times a key has been pressed and an accumulated total of hold times is stored
        numOfKeyPresses++;
        //Calculate the hold time of this key press and add it to the total
        totalKeyPressTime += new Date().getTime() - lastKeyPressStart;
    }
}
