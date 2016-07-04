package edu.drexel.assignment1;

import javax.swing.*;
import java.awt.*;

/**
 * Problem 1 of Assignment 1 in CS 338
 * Created by Angel Delgado on 6/24/2016.
 */
public class Program1 {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Program 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Outermost panel is a horizontal box layout
        JPanel outerPanel = new JPanel(new BorderLayout(5, 5));

        //left panel
        JPanel leftPanel = new JPanel();
        setupLeftPanel(leftPanel);

        //right panel
        JPanel rightPanel = new JPanel();
        setupRightPanel(rightPanel);

        outerPanel.add(leftPanel, BorderLayout.WEST);
        outerPanel.add(rightPanel, BorderLayout.CENTER);

        frame.getContentPane().add(outerPanel);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void setupLeftPanel(JPanel leftPanel) {
        leftPanel.setLayout(new BorderLayout());

        JPanel innerPanel = new JPanel(new GridBagLayout());
        innerPanel.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel label = new JLabel("Label");
        constraints.gridx = 0;
        constraints.gridy = 0;
        innerPanel.add(label, constraints);


        JButton button1 = new JButton("Button1");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        innerPanel.add(button1, constraints);

        JLabel longLabel = new JLabel("LongLabel");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        innerPanel.add(longLabel, constraints);

        JButton b2 = new JButton("B2");
        constraints.gridx = 1;
        constraints.gridy = 1;
        innerPanel.add(b2, constraints);

        JButton b3 = new JButton("B3");
        constraints.gridx = 2;
        constraints.gridy = 1;
        innerPanel.add(b3, constraints);

//        leftPanel.add(Box.createVerticalGlue());
        leftPanel.add(innerPanel, BorderLayout.SOUTH);
    }

    private static void setupRightPanel(JPanel rightPanel) {
        rightPanel.setLayout(new BorderLayout(5, 5));

        JPanel topButtonPanel = createSevenButtonPanel();
        JPanel bottButtonPanel = createAdvancedButtonPanel();

        rightPanel.add(topButtonPanel, BorderLayout.CENTER);
        rightPanel.add(bottButtonPanel, BorderLayout.SOUTH);
    }

    private static JPanel createAdvancedButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        JButton help = new JButton("Help");
        JButton advanced = new JButton("Advanced");
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");

        panel.add(help);
        panel.add(Box.createHorizontalGlue());
        panel.add(advanced);
        panel.add(Box.createHorizontalGlue());
        panel.add(ok);
        panel.add(cancel);

        return panel;
    }

    private static JPanel createSevenButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        panel.setAlignmentY(Component.CENTER_ALIGNMENT);

        JPanel leftPanel = new JPanel(new GridLayout(2, 1));

        JPanel middlePanel = new JPanel(new BorderLayout());

        JPanel rightPanel = new JPanel(new GridLayout(2, 1));

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");

        leftPanel.add(one);
        leftPanel.add(two);

        middlePanel.add(three, BorderLayout.NORTH);
        middlePanel.add(four, BorderLayout.CENTER);
        middlePanel.add(five, BorderLayout.SOUTH);

        rightPanel.add(six);
        rightPanel.add(seven);

        panel.add(leftPanel);
        panel.add(middlePanel);
        panel.add(rightPanel);
        return panel;
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() ->
                createAndShowGUI()
        );
    }


}
