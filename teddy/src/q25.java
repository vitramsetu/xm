import javax.swing.*;
import java.awt.*;

public class q25 extends JFrame {
    public q25() {
        setTitle("Simple GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);

        JLabel label1 = new JLabel("All the best");
        label1.setForeground(Color.RED);
        label1.setOpaque(true);
        label1.setBackground(Color.WHITE);
        label1.setBounds(10, 10, 70, 30);
        add(label1);

        JLabel label2 = new JLabel("All the best");
        label2.setForeground(Color.magenta);
        label2.setOpaque(true);
        label2.setBackground(Color.WHITE);
        label2.setBounds(90, 10, 70, 30);
        add(label2);

        JLabel label3 = new JLabel("All the best");
        label3.setForeground(Color.blue);
        label3.setOpaque(true);
        label3.setBackground(Color.WHITE);
        label3.setBounds(170, 10, 70, 30);
        add(label3);

        JLabel label4 = new JLabel("All the best");
        label4.setForeground(Color.GREEN);
        label4.setOpaque(true);
        label4.setBackground(Color.WHITE);
        label4.setBounds(250, 10, 70, 30);
        add(label4);

        JLabel label5 = new JLabel("All the best");
        label5.setForeground(Color.CYAN);
        label5.setOpaque(true);
        label5.setBackground(Color.WHITE);
        label5.setBounds(125, 45, 70, 30);
        add(label5);

        JLabel label6 = new JLabel("All the best");
        label6.setForeground(Color.blue);
        label6.setBounds(90, 80, 70, 30);
        add(label6);

        JLabel label7 = new JLabel("All the best");
        label7.setForeground(Color.pink);
        label7.setBounds(143, 160, 70, 30);
        add(label7);

        JLabel label8 = new JLabel("All the best");
        label8.setForeground(Color.RED);
        label8.setBounds(196, 240, 70, 30);
        add(label8);

        JLabel label9 = new JLabel("All the best");
        label9.setForeground(Color.black);
        label9.setBounds(250, 320, 70, 30);
        add(label9);

        setSize(350, 400); // Increase the size of the frame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new q25());
    }
}
