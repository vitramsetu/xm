import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class q10 extends JFrame implements ActionListener {
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JTextField resultTextField;

    public q10() {
        // Set up the frame
        setTitle("Number Addition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);

        // Create a custom panel with rounded corner border
        JPanel roundedBorderPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int arcWidth = 12;
                int arcHeight = 12;
                int borderThickness = 2;
                int x = 30;
                int y = 30;
                int width = 380;
                int height = 160;
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(Color.GRAY);
                g2d.setStroke(new BasicStroke(borderThickness));
                g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
                g2d.dispose();
            }
        };
        roundedBorderPanel.setLayout(null);
        roundedBorderPanel.setBounds(20, 20, 400, 230);
        roundedBorderPanel.setBorder(new LineBorder(Color.GRAY, 1, true));

        // Create components
        JLabel head = new JLabel("Number Addition");
        JLabel firstNumberLabel = new JLabel("First number:");
        JLabel secondNumberLabel = new JLabel("Second number:");
        JLabel resultLabel = new JLabel("Result:");

        firstNumberTextField = new JTextField(10);
        secondNumberTextField = new JTextField(10);
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        // Set component positions
        head.setBounds(30, 20, 100, 20);
        firstNumberLabel.setBounds(50, 50, 100, 20);
        firstNumberTextField.setBounds(160, 50, 220, 20);
        secondNumberLabel.setBounds(50, 80, 100, 20);
        secondNumberTextField.setBounds(160, 80, 220, 20);
        resultLabel.setBounds(50, 110, 100, 20);
        resultTextField.setBounds(160, 110, 220, 20);
        addButton.setBounds(160, 150, 70, 20);
        clearButton.setBounds(240, 150, 70, 20);
        exitButton.setBounds(310, 200, 70, 20);

        // Add components to the rounded border panel
        roundedBorderPanel.add(head);
        roundedBorderPanel.add(firstNumberLabel);
        roundedBorderPanel.add(firstNumberTextField);
        roundedBorderPanel.add(secondNumberLabel);
        roundedBorderPanel.add(secondNumberTextField);
        roundedBorderPanel.add(resultLabel);
        roundedBorderPanel.add(resultTextField);
        roundedBorderPanel.add(addButton);
        roundedBorderPanel.add(clearButton);
        roundedBorderPanel.add(exitButton);

        // Add the rounded border panel to the frame
        getContentPane().add(roundedBorderPanel);

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            try {
                int firstNumber = Integer.parseInt(firstNumberTextField.getText());
                int secondNumber = Integer.parseInt(secondNumberTextField.getText());
                int result = firstNumber + secondNumber;
                resultTextField.setText(Integer.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
            }
        } else if (e.getActionCommand().equals("Clear")) {
            firstNumberTextField.setText("");
            secondNumberTextField.setText("");
            resultTextField.setText("");
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new q10();
            }
        });
    }
}
