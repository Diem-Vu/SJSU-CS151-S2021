///**
// * Remember the calculator example I presented during my lectures?
// * It was implemented using Java AWT libraries.
// * Implement the same calculator application but now using Java Swing libraries.
// * Please make sure it has all the basic functionality that the calculator in the demo had.
// * In other words, your application is not just expected to have the GUI
// * but also the functionality within those GUI components.
// * Please make sure that at least 1 set of buttons in your calculator uses images.
// * By the “set” I mean functional sets/groups: digit buttons or operator buttons.
// * Make sure that either the digit buttons or the operator buttons or both have images on them.
// * Implement a menu for your application.
// * The menu should contain menu items for the following operations: add, subtract, divide, multiply, clear.
// * Make sure your menu items work and perform the desired operation when clicked.
// */

/**
 * class MethodTest
 * @author Diem.Vu
 * @since 05.6.2021
 * @version 1.0
 *
 * Assignment 8: Java GUi
 * */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


// example of gui, calculator app

public class Calculator extends JFrame {
    private JLabel myLabel;
    private JTextField outputField;
    private ArrayList<JButton> digits;
    private ArrayList<ImageIcon> operationImages;
    private JButton plusSign;
    private JButton minusSign;
    private JButton multSign;
    private JButton divSign;
    private JButton eqSign;
    private String currentOperation;
    private Double firstOperand;

//    private JMenuBar menuBar;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
//    private JMenuItem menuItem5;

    public Calculator() {
        this.currentOperation = "";
        this.firstOperand = 0.0;

        ActionListener reset = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                currentOperation = "";
                firstOperand = 0.0;
                outputField.setText("0");
                resetValues();
            }
        };

        JPanel displayPanel = new JPanel(new FlowLayout());


        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Operation");
        menuBar.add(menu);

        menuItem1 = new JMenuItem("+");
        menu.add(menuItem1);
        menuItem2 = new JMenuItem("-");
        menu.add(menuItem2);
        menuItem3 = new JMenuItem("x");
        menu.add(menuItem3);
        menuItem4 = new JMenuItem("/");
        menu.add(menuItem4);
        JMenuItem menuItem5 = new JMenuItem("AC");
        menu.add(menuItem5);
        displayPanel.add(menuBar);

        OperatorMenuListener opListener1 = new OperatorMenuListener();
        menuItem1.addActionListener(opListener1);
        menuItem2.addActionListener(opListener1);
        menuItem3.addActionListener(opListener1);
        menuItem4.addActionListener(opListener1);
        menuItem5.addActionListener(reset);


        outputField = new JTextField("0", 20);
        displayPanel.add(outputField);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        JPanel digitButtonPanel = new JPanel(new GridLayout(4, 3));
        digits = new ArrayList<JButton>();
        digits.add(new JButton("0"));
        digits.add(new JButton("1"));
        digits.add(new JButton("2"));
        digits.add(new JButton("3"));
        digits.add(new JButton("4"));
        digits.add(new JButton("5"));
        digits.add(new JButton("6"));
        digits.add(new JButton("7"));
        digits.add(new JButton("8"));
        digits.add(new JButton("9"));
        digits.add(new JButton("."));
        digits.add(new JButton("AC"));


        digits.get(10).setForeground(Color.red);
        digits.get(11).setForeground(Color.red);

        digitButtonPanel.add(digits.get(0));
        digitButtonPanel.add(digits.get(1));
        digitButtonPanel.add(digits.get(2));
        digitButtonPanel.add(digits.get(3));
        digitButtonPanel.add(digits.get(4));
        digitButtonPanel.add(digits.get(5));
        digitButtonPanel.add(digits.get(6));
        digitButtonPanel.add(digits.get(7));
        digitButtonPanel.add(digits.get(8));
        digitButtonPanel.add(digits.get(9));
        digitButtonPanel.add(digits.get(10));
        digitButtonPanel.add(digits.get(11));
        buttonPanel.add(digitButtonPanel);

        //create a list of images
        operationImages = new ArrayList<ImageIcon>();
        operationImages.add(new ImageIcon("/Users/joey/NetBeansProjects/CS151/src/Assignment8/add.png"));
        operationImages.add(new ImageIcon("/Users/joey/NetBeansProjects/CS151/src/Assignment8/subtract.png"));
        operationImages.add(new ImageIcon("/Users/joey/NetBeansProjects/CS151/src/Assignment8/multiply.png"));
        operationImages.add(new ImageIcon("/Users/joey/NetBeansProjects/CS151/src/Assignment8/divide.png"));
        operationImages.add(new ImageIcon("/Users/joey/NetBeansProjects/CS151/src/Assignment8/equal.png"));
        //resizing images
        for(int i = 0; i < operationImages.size(); i++){
            Image newImg = operationImages.get(i).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
            operationImages.set(i, new ImageIcon(newImg));
        }
        //sign icon images for each operation button
        JPanel operatorButtonPanel = new JPanel(new GridLayout(5, 1));
        plusSign = new JButton("", operationImages.get(0));
        minusSign = new JButton("",operationImages.get(1));
        multSign = new JButton("",operationImages.get(2));
        divSign = new JButton("",operationImages.get(3));
        eqSign = new JButton("",operationImages.get(4));

        operatorButtonPanel.add(plusSign);
        operatorButtonPanel.add(minusSign);
        operatorButtonPanel.add(multSign);
        operatorButtonPanel.add(divSign);
        operatorButtonPanel.add(eqSign);
        buttonPanel.add(operatorButtonPanel);

        displayPanel.add(buttonPanel);
        add(displayPanel);

        digits.get(10).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = outputField.getText();
                if (currentText.indexOf(".") < 0) {
                    outputField.setText(currentText + ".");
                }
            }
        });

        digits.get(11).addActionListener(reset);

        OperatorListener opListener2 = new OperatorListener();
        plusSign.addActionListener(opListener2);
        minusSign.addActionListener(opListener2);
        multSign.addActionListener(opListener2);
        divSign.addActionListener(opListener2);

        for (int i = 0; i <= 9; i++) {
            digits.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String currentText = outputField.getText();
                    JButton source = (JButton) event.getSource();
                    String newDigit = "";
                    if (source == digits.get(0)) {
                        newDigit = "0";
                    } else if (source == digits.get(1)) {
                        newDigit = "1";
                    } else if (source == digits.get(2)) {
                        newDigit = "2";
                    } else if (source == digits.get(3)) {
                        newDigit = "3";
                    } else if (source == digits.get(4)) {
                        newDigit = "4";
                    } else if (source == digits.get(5)) {
                        newDigit = "5";
                    } else if (source == digits.get(6)) {
                        newDigit = "6";
                    } else if (source == digits.get(7)) {
                        newDigit = "7";
                    } else if (source == digits.get(8)) {
                        newDigit = "8";
                    } else if (source == digits.get(9)) {
                        newDigit = "9";
                    }

                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        eqSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Double result = 0.0;
                String currentText = outputField.getText();
                try {
                    Double secondOperand = new Double(currentText);

                    if (currentOperation == "+") {
                        result = firstOperand + secondOperand;
                    } else if (currentOperation == "-") {
                        result = firstOperand - secondOperand;
                    } else if (currentOperation == "*") {
                        result = firstOperand * secondOperand;
                    } else if (currentOperation == "/") {
                        if (secondOperand != 0.0) {
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            outputField.setBackground(Color.PINK);
                        }
                    }

                    outputField.setText(result.toString());
                    firstOperand = result;
                } catch (NumberFormatException e) {
                    resetValues();
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        setTitle("Calculator");
        setSize(500, 300);
        setVisible(true);
    }

    private void resetValues() {
        currentOperation = "";
        firstOperand = 0.0;
        outputField.setText("0");
        outputField.setBackground(Color.WHITE);
    }

    private class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            if (source == plusSign) {
                currentOperation = "+";
            } else if (source == minusSign) {
                currentOperation = "-";
            } else if (source == multSign) {
                currentOperation = "*";
            } else if (source == divSign) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try {
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch (NumberFormatException e) {
                resetValues();
            }
        }
    }
    private class OperatorMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JMenuItem item = (JMenuItem) event.getSource();
            if (item == menuItem1) {
                currentOperation = "+";
            } else if (item == menuItem2) {
                currentOperation = "-";
            } else if (item == menuItem3) {
                currentOperation = "*";
            } else if (item == menuItem4) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try {
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch (NumberFormatException e) {
                resetValues();
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
