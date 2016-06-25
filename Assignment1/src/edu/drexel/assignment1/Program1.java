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

        //Outermost panel split into four quadrants
        JPanel outerPanel = new JPanel(new GridLayout(2, 2));

        //Top left quadrant
        JPanel topLeftPanel = new JPanel();
        topLeftPanel.setLayout(new BoxLayout(topLeftPanel, BoxLayout.X_AXIS));

        //Top right quadrant
        JPanel topRightPanel = new JPanel(new GridLayout(2,2));

        //Bottom left quadrant
        JPanel bottomLeftPanel = new JPanel(new GridLayout(2, 2));

        //Bottom right quadrant
        JPanel bottomRightPanel = new JPanel();
        bottomRightPanel.setLayout(new BoxLayout(bottomRightPanel, BoxLayout.X_AXIS));

        setupTopLeftQuadrant(topLeftPanel);
        setupTopRightQuadrant(topRightPanel);
        setupBottomLeftQuadrant(bottomLeftPanel);
        setupBottomRightQuadrant(bottomRightPanel);

        outerPanel.add(topLeftPanel);
        outerPanel.add(topRightPanel);
        outerPanel.add(bottomLeftPanel);
        outerPanel.add(bottomRightPanel);

        frame.getContentPane().add(outerPanel);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    private static void setupTopLeftQuadrant(JPanel topLeftPanel) {
        //There is nothing in ths quadrant
    }

    private static void setupTopRightQuadrant(JPanel topRightPanel) {

    }

    private static void setupBottomLeftQuadrant(JPanel bottomLeftPanel) {
        Label label = new Label("Label");
        Button button1 = new Button("Button1");
        Label longLabel = new Label("LongLabel");

        JPanel smallButtonPanel = new JPanel();
        smallButtonPanel.setLayout(new BoxLayout(smallButtonPanel,BoxLayout.X_AXIS));
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");

        smallButtonPanel.add(b2);
        smallButtonPanel.add(b3);

        bottomLeftPanel.add(label);
        bottomLeftPanel.add(button1);
        bottomLeftPanel.add(longLabel);
        bottomLeftPanel.add(smallButtonPanel);
    }

    private static void setupBottomRightQuadrant(JPanel bottomRightPanel) {

    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
