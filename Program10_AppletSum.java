// Program 10: To design a Java applet program to display the Sum of Two Numbers.
// Run using:
//   javac Program10_AppletSum.java
//   appletviewer Program10_AppletSum.java

/*
<applet code="Program10_AppletSum.class" width="400" height="220">
</applet>
*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("removal")
public class Program10_AppletSum extends Applet implements ActionListener {
    private TextField txtNum1, txtNum2;
    private Button btnAdd;
    private String resultMessage = "Enter two numbers and click 'Find Sum'";

    @Override
    public void init() {
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);

        Label lbl1 = new Label("First Number: ");
        txtNum1 = new TextField(10);

        Label lbl2 = new Label("Second Number: ");
        txtNum2 = new TextField(10);

        btnAdd = new Button("Find Sum");
        btnAdd.addActionListener(this);

        add(lbl1);
        add(txtNum1);
        add(lbl2);
        add(txtNum2);
        add(btnAdd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText().trim());
            double num2 = Double.parseDouble(txtNum2.getText().trim());
            double sum = num1 + num2;
            resultMessage = "Sum of " + num1 + " and " + num2 + " = " + sum;
        } catch (NumberFormatException ex) {
            resultMessage = "Invalid input! Please enter valid numbers.";
        }
        repaint(); // Redraw applet window to display updated sum
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.setColor(Color.BLUE);
        g.drawString(resultMessage, 50, 140);
    }
}
