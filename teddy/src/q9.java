import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class q9 extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JTextField inputField;
    private JButton sendButton;
    private JButton resetButton;

    public q9 () {
        setTitle("File Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        createMenuBar();
        createTextArea();
        createInputField();
        createButtons();

        setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenu helpMenu = new JMenu("Help");

        saveMenuItem.addActionListener(this);

        fileMenu.add(saveMenuItem);
        fileMenu.add(openMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    private void createTextArea() {
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);
    }

    private void createInputField() {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        inputField = new JTextField();

        inputPanel.add(inputField, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void createButtons() {
        JPanel buttonPanel = new JPanel();
        sendButton = new JButton("Send");
        resetButton = new JButton("Reset");

        sendButton.addActionListener(this);
        resetButton.addActionListener(this);

        buttonPanel.add(sendButton);
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Save")) {
            saveToFile();
        } else if (e.getActionCommand().equals("Send")) {
            String inputText = inputField.getText();
            textArea.append(inputText + "\n");
            inputField.setText("");
        } else if (e.getActionCommand().equals("Reset")) {
            textArea.setText("");
            inputField.setText("");
        }
    }

    private void saveToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.write(textArea.getText());
                writer.flush();
                JOptionPane.showMessageDialog(this, "File saved successfully.",
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new q9());
    }
}
