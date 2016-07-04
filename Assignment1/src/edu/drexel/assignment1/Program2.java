package edu.drexel.assignment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Angel Delgado
 * ald363@drexel.edu
 * CS338: GUI, Assignment 1
 */
public class Program2 {

    public static final String DEFAULT_TEXT = "+";

    private JButton up;
    private JButton swap;
    private JButton reset;
    private JButton down;
    private JTextField upperTextField;
    private JTextField lowerTextField;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Program2().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        setupLayout();
        setupControls();
    }

    private void setupControls() {
        up.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upperTextField.grabFocus();
            }
        });
        down.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lowerTextField.grabFocus();
            }
        });

        swap.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String upperContents = upperTextField.getText();
                upperTextField.setText(lowerTextField.getText());
                lowerTextField.setText(upperContents);
            }
        });

        reset.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upperTextField.setText(DEFAULT_TEXT);
                lowerTextField.setText(DEFAULT_TEXT);
            }
        });
        up.setText("Up");
        swap.setText("Swap");
        reset.setText("Reset");
        down.setText("Down");
        upperTextField.grabFocus();
    }

    private void setupLayout() {
        JFrame frame = new JFrame("Program 2");
        frame.setPreferredSize(new Dimension(250, 150));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        up = new JButton();
        swap = new JButton();
        reset = new JButton();
        down = new JButton();
        upperTextField = new JTextField(DEFAULT_TEXT);
        lowerTextField = new JTextField(DEFAULT_TEXT);

        JPanel outerPanel = new JPanel(new BorderLayout());

        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.Y_AXIS));
        textFieldPanel.add(upperTextField);
        textFieldPanel.add(lowerTextField);

        outerPanel.add(up, BorderLayout.NORTH);
        outerPanel.add(swap, BorderLayout.WEST);
        outerPanel.add(textFieldPanel, BorderLayout.CENTER);
        outerPanel.add(reset, BorderLayout.EAST);
        outerPanel.add(down, BorderLayout.SOUTH);
        outerPanel.setSize(new Dimension(400, 400));

        frame.getContentPane().add(outerPanel);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
