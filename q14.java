import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q14 extends JFrame implements ActionListener {

    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    private String currentNumber;
    private String currentOperator;
    private double result;

    public q14() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        displayField = new JTextField();
        displayField.setEditable(false);
        panel.add(displayField);

        numberButtons = new JButton[10];
        for (int i = 1; i <= 9; i++) {
            numberButtons[i] = new JButton(Integer.toString(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }

        numberButtons[0] = new JButton("0");
        numberButtons[0].addActionListener(this);
        panel.add(numberButtons[0]);

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        panel.add(operatorButtons[0]);
        panel.add(operatorButtons[1]);
        panel.add(operatorButtons[2]);
        panel.add(operatorButtons[3]);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(equalsButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String buttonText = button.getText();

            if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
                currentOperator = buttonText;
                result = Double.parseDouble(displayField.getText());
                displayField.setText("");
            } else if (buttonText.equals("=")) {
                double secondNumber = Double.parseDouble(displayField.getText());
                double calculatedResult = calculate(result, secondNumber, currentOperator);
                displayField.setText(Double.toString(calculatedResult));
            } else if (buttonText.equals("C")) {
                displayField.setText("");
                currentNumber = "";
                currentOperator = "";
                result = 0;
            } else {
                displayField.setText(displayField.getText() + buttonText);
            }
        }
    }

    private double calculate(double firstNumber, double secondNumber, String operator) {
        double calculatedResult = 0;

        switch (operator) {
            case "+":
                calculatedResult = firstNumber + secondNumber;
                break;
            case "-":
                calculatedResult = firstNumber - secondNumber;
                break;
            case "*":
                calculatedResult = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    calculatedResult = firstNumber / secondNumber;
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Division by zero.");
                }
                break;
        }

        return calculatedResult;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new q14();
            }
        });
    }
}
