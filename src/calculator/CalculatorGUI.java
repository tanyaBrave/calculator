package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton b0 = new JButton("0");
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiButton = new JButton("*");
    private JButton divButton = new JButton("/");
    private JButton unaryButton = new JButton("-u");
    private JButton leftWaneButton = new JButton("(");
    private JButton rightWaneButton = new JButton(")");
    private JButton doubleButton = new JButton(".");
    private JButton calculateButton = new JButton("=");
    private JButton clearButton = new JButton("C");
    private JTextField display = new JTextField();


    private String expression;
    private ButtonEventListener buttonListener = new ButtonEventListener();


    public CalculatorGUI(String calculatorName) {
        super(calculatorName);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(270, 375);

        setLayout(null);

        display.setBounds(20,5,215,50);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        leftWaneButton.setBounds(20,60,50,50);
        clearButton.setBounds(75,60,50,50);
        rightWaneButton.setBounds(130,60,50,50);
        divButton.setBounds(185,60,50,50);
        b7.setBounds(20,115,50,50);
        b8.setBounds(75,115,50,50);
        b9.setBounds(130,115,50,50);
        multiButton.setBounds(185,115,50,50);
        b4.setBounds(20,170,50,50);
        b5.setBounds(75,170,50,50);
        b6.setBounds(130,170,50,50);
        subtractButton.setBounds(185,170,50,50);
        b1.setBounds(20,225,50,50);
        b2.setBounds(75,225,50,50);
        b3.setBounds(130,225,50,50);
        addButton.setBounds(185,225,50,50);
        unaryButton.setBounds(20,280,50,50);
        b0.setBounds(75,280,50,50);
        doubleButton.setBounds(130,280,50,50);
        calculateButton.setBounds(185,280,50,50);

        b1.addActionListener(buttonListener);
        b2.addActionListener(buttonListener);
        b3.addActionListener(buttonListener);
        b4.addActionListener(buttonListener);
        b5.addActionListener(buttonListener);
        b6.addActionListener(buttonListener);
        b7.addActionListener(buttonListener);
        b8.addActionListener(buttonListener);
        b9.addActionListener(buttonListener);
        b0.addActionListener(buttonListener);
        addButton.addActionListener(buttonListener);
        subtractButton.addActionListener(buttonListener);
        multiButton.addActionListener(buttonListener);
        divButton.addActionListener(buttonListener);
        unaryButton.addActionListener(buttonListener);
        leftWaneButton.addActionListener(buttonListener);
        rightWaneButton.addActionListener(buttonListener);
        doubleButton.addActionListener(buttonListener);
        calculateButton.addActionListener(buttonListener);
        clearButton.addActionListener(buttonListener);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(addButton);
        add(subtractButton);
        add(multiButton);
        add(divButton);
        add(unaryButton);
        add(leftWaneButton);
        add(rightWaneButton);
        add(doubleButton);
        add(calculateButton);
        add(clearButton);
        add(display);
    }

    public class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            try {

                if (event.getSource() == b1) {
                    expression = display.getText() + b1.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b2) {
                    expression = display.getText() + b2.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b3) {
                    expression = display.getText() + b3.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b4) {
                    expression = display.getText() + b4.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b5) {
                    expression = display.getText() + b5.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b6) {
                    expression = display.getText() + b6.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b7) {
                    expression = display.getText() + b7.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b8) {
                    expression = display.getText() + b8.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b9) {
                    expression = display.getText() + b9.getText();
                    display.setText(expression);
                }

                if (event.getSource() == b0) {
                    expression = display.getText() + b0.getText();
                    display.setText(expression);
                }

                if (event.getSource() == addButton) {
                    expression = display.getText() + addButton.getText();
                    display.setText(expression);
                }

                if (event.getSource() == subtractButton) {
                    expression = display.getText() + subtractButton.getText();
                    display.setText(expression);
                }

                if (event.getSource() == multiButton) {
                    expression = display.getText() + multiButton.getText();
                    display.setText(expression);
                }

                if (event.getSource() == divButton) {
                    expression = display.getText() + divButton.getText();
                    display.setText(expression);
                }

                if (event.getSource() == unaryButton) {

                    if (Double.parseDouble(display.getText()) > 0 &
                            (Double.parseDouble(display.getText()) - Double.parseDouble(display.getText())) == 0) {
                        expression = "-" + display.getText();
                    } else expression = display.getText();

                    display.setText(expression);
                }

                if (event.getSource() == leftWaneButton) {
                    expression = display.getText() + leftWaneButton.getText();
                    display.setText(expression);
                }

                if (event.getSource() == rightWaneButton) {
                    expression = display.getText() + rightWaneButton.getText();
                    display.setText(expression);
                }

                if (event.getSource() == doubleButton) {
                    expression = display.getText() + doubleButton.getText();
                    display.setText(expression);
                }

                if (event.getSource() == calculateButton) {
                    expression = display.getText();
                    display.setText(String.valueOf
                            (Calculator.PostfixNotationToResult(Calculator.ExpressionToPostfixNotation(expression))));
                }

                if (event.getSource() == clearButton) {
                    display.setText(null);
                    display.setText("");
                }
            }
            catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Введите корректное выражение\n" + e.getMessage());
            }

            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Введите корректное выражение");
            }
        }
    }
}
