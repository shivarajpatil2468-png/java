// Program 9: To design a basic calculator to find the sum of two numbers using JAVA Swing.
// Demonstrates GUI programming with JFrame, JLabel, JTextField, JButton, and ActionListener.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program09_SwingCalculator extends JFrame implements ActionListener {
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnAdd, btnClear;

    public Program09_SwingCalculator() {
        setTitle("Swing Sum Calculator");
        setSize(380, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Create GUI Components
        JLabel lblNum1 = new JLabel("  Enter First Number:");
        txtNum1 = new JTextField();

        JLabel lblNum2 = new JLabel("  Enter Second Number:");
        txtNum2 = new JTextField();

        JLabel lblResult = new JLabel("  Sum Result:");
        txtResult = new JTextField();
        txtResult.setEditable(false);

        btnAdd = new JButton("Calculate Sum");
        btnClear = new JButton("Clear");

        // Register ActionListeners
        btnAdd.addActionListener(this);
        btnClear.addActionListener(this);

        // Add components to JFrame
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(lblResult);
        add(txtResult);
        add(btnAdd);
        add(btnClear);

        setLocationRelativeTo(null); // Center the window
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            try {
                double num1 = Double.parseDouble(txtNum1.getText().trim());
                double num2 = Double.parseDouble(txtNum2.getText().trim());
                double sum = num1 + num2;
                txtResult.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values!",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnClear) {
            txtNum1.setText("");
            txtNum2.setText("");
            txtResult.setText("");
            txtNum1.requestFocus();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Program09_SwingCalculator calculator = new Program09_SwingCalculator();
            calculator.setVisible(true);
        });
    }
}
