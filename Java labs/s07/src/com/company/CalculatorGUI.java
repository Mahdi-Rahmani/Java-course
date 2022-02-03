package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * A class to design calculator GUI.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class CalculatorGUI {
    //The frame of calculator
    JFrame calculatorFrame;
    //The standard calculator panel
    JPanel standard;
    //The scientific calculator panel
    JPanel scientific;

    /**
     * This is the constructor of this class
     * Create a new CalculatorGUI.
     */
    public CalculatorGUI() {
        //look and feel part
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        //frame part
        calculatorFrame = new JFrame();
        calculatorFrame.setTitle("AUT Calculator");
        calculatorFrame.setSize(370, 500);
        calculatorFrame.setLocation(100, 200);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeStandardPanel();
        makeScientificPanel();

        //tab part
        // we need two tabs (Standard and Scientific)
        JTabbedPane calculatorTabs = new JTabbedPane();
        calculatorTabs.addTab("Standard ", standard);
        calculatorTabs.addTab("Scientific ",scientific);
        calculatorFrame.add(calculatorTabs);
        calculatorFrame.setVisible(true);
    }

    /**
     * make standard calculator panel.
     * This method makes standard calculator panel for standard tab.
     */
    private void makeStandardPanel() {
        standard = new JPanel();
        standard.setLayout(new BorderLayout());

        //textarea part
        JTextArea display = new JTextArea(2,10);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 36));
        Border border = BorderFactory.createLineBorder(Color.gray,1);
        display.setBorder(border);


        //keyboard part
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(5, 4));
        keyboardPanel.setBorder(border);

        //buttons of Standard Calculator (two parts: numberButton and operatorButton)
          // numbers
        JButton[] numberButton = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButton[i] = new JButton();
            numberButton[i].setText("" + i);
            numberButton[i].setBorder(BorderFactory.createLineBorder(Color.pink,1));
        }
          // operators
        JButton[] operatorButton = new JButton[8];
        for (int i = 0; i < 8; i++) {
            operatorButton[i] = new JButton();
        }
        operatorButton[0].setText("+");
        operatorButton[1].setText("-");
        operatorButton[2].setText("*");
        operatorButton[3].setText("/");
        operatorButton[4].setText("=");
        operatorButton[5].setText(".");
        operatorButton[6].setText("+/-");
        operatorButton[7].setText("mod");
        //C&CE
        JButton cButton = new JButton();
        cButton.setText("C");
        cButton.setBackground(Color.gray);
        JButton ceButton = new JButton();
        ceButton.setBackground(Color.gray);
        ceButton.setText("CE");
        //Add
        keyboardPanel.add(ceButton);
        keyboardPanel.add(cButton);
        keyboardPanel.add(operatorButton[7]);
        keyboardPanel.add(operatorButton[0]);
        keyboardPanel.add(numberButton[7]);
        keyboardPanel.add(numberButton[8]);
        keyboardPanel.add(numberButton[9]);
        keyboardPanel.add(operatorButton[1]);
        keyboardPanel.add(numberButton[4]);
        keyboardPanel.add(numberButton[5]);
        keyboardPanel.add(numberButton[6]);
        keyboardPanel.add(operatorButton[2]);
        keyboardPanel.add(numberButton[1]);
        keyboardPanel.add(numberButton[2]);
        keyboardPanel.add(numberButton[3]);
        keyboardPanel.add(operatorButton[3]);
        keyboardPanel.add(operatorButton[6]);
        keyboardPanel.add(numberButton[0]);
        keyboardPanel.add(operatorButton[5]);
        keyboardPanel.add(operatorButton[4]);

        //scroll
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(50, 100));

        standard.add(scrollPane, BorderLayout.NORTH);
        standard.add(keyboardPanel, BorderLayout.CENTER);
    }

    /**
     * make scientific calculator panel.
     * This method makes scientific calculator panel for scientific tab.
     */
    private void makeScientificPanel() {
        scientific = new JPanel();
        scientific.setLayout(new BorderLayout());

        //textarea part
        JTextArea display = new JTextArea(2, 5);
        display.setEditable(true);
        display.setFont(new Font("Arial", Font.BOLD, 36));
        Border border = BorderFactory.createLineBorder(Color.gray,1);
        display.setBorder(border);

        //keyboard part
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(7, 5));
        keyboardPanel.setBorder(border);
        //buttons of Standard Calculator (two parts: numberButton and operatorButton)
        // numbers
        JButton[] numberButton = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButton[i] = new JButton();
            numberButton[i].setText("" + i);
            numberButton[i].setBorder(BorderFactory.createLineBorder(Color.pink,1));
        }
        //operators
        JButton[] operatorButton = new JButton[20];
        for (int i = 0; i < 20; i++) {
            operatorButton[i] = new JButton();
        }
        operatorButton[0].setText("+");
        operatorButton[1].setText("-");
        operatorButton[2].setText("*");
        operatorButton[3].setText("/");
        operatorButton[4].setText("=");
        operatorButton[5].setText(".");
        operatorButton[6].setText("+/-");
        operatorButton[7].setText("mod");
        operatorButton[8].setText("sin/cos");
        operatorButton[9].setText("tan/cot");
        operatorButton[10].setText("log");
        operatorButton[11].setText("exp");
        operatorButton[12].setText("e");
        operatorButton[13].setText("Pi");
        operatorButton[14].setText("x^y");
        operatorButton[15].setText("ln");
        operatorButton[16].setText("%");
        operatorButton[17].setText("x^2");
        operatorButton[18].setText("x^1/2");
        operatorButton[19].setText("1/x");
        //C&CE&shift&)&(
        JButton cButton = new JButton();
        cButton.setText("C");
        JButton ceButton = new JButton();
        cButton.setBackground(Color.gray);
        ceButton.setText("CE");
        ceButton.setBackground(Color.gray);
        JButton shiftButton = new JButton();
        shiftButton.setText("shift");
        shiftButton.setBackground(Color.gray);
        JButton parentheses1 = new JButton();
        parentheses1.setText("(");
        parentheses1.setBackground(Color.gray);
        JButton parentheses2 = new JButton();
        parentheses2.setText(")");
        parentheses2.setBackground(Color.gray);
        //Add
        keyboardPanel.add(shiftButton);
        keyboardPanel.add(parentheses1);
        keyboardPanel.add(parentheses2);
        keyboardPanel.add(ceButton);
        keyboardPanel.add(cButton);
        keyboardPanel.add(operatorButton[8]);
        keyboardPanel.add(operatorButton[17]);
        keyboardPanel.add(operatorButton[18]);
        keyboardPanel.add(operatorButton[19]);
        keyboardPanel.add(operatorButton[16]);
        keyboardPanel.add(operatorButton[9]);
        keyboardPanel.add(operatorButton[12]);
        keyboardPanel.add(operatorButton[13]);
        keyboardPanel.add(operatorButton[7]);
        keyboardPanel.add(operatorButton[0]);
        keyboardPanel.add(operatorButton[11]);
        keyboardPanel.add(numberButton[7]);
        keyboardPanel.add(numberButton[8]);
        keyboardPanel.add(numberButton[9]);
        keyboardPanel.add(operatorButton[1]);
        keyboardPanel.add(operatorButton[15]);
        keyboardPanel.add(numberButton[4]);
        keyboardPanel.add(numberButton[5]);
        keyboardPanel.add(numberButton[6]);
        keyboardPanel.add(operatorButton[2]);
        keyboardPanel.add(operatorButton[14]);
        keyboardPanel.add(numberButton[1]);
        keyboardPanel.add(numberButton[2]);
        keyboardPanel.add(numberButton[3]);
        keyboardPanel.add(operatorButton[3]);
        keyboardPanel.add(operatorButton[10]);
        keyboardPanel.add(operatorButton[6]);
        keyboardPanel.add(numberButton[0]);
        keyboardPanel.add(operatorButton[5]);
        keyboardPanel.add(operatorButton[4]);

        //scroll
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(50, 100));

        scientific.add(scrollPane, BorderLayout.NORTH);
        scientific.add(keyboardPanel, BorderLayout.CENTER);
    }
}