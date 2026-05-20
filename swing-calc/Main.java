import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(400,500);

        JPanel fields = new JPanel();
        JTextField first = new JTextField(5);
        JTextField second = new JTextField(5);

        JButton add = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");

        add.addActionListener(e -> {
            int num1 = Integer.parseInt(first.getText());
            int num2 = Integer.parseInt(second.getText());

            String result = String.valueOf(num1 + num2);

            JOptionPane.showMessageDialog(f, "Result: " + result);
        });

        minus.addActionListener(e -> {
            int num1 = Integer.parseInt(first.getText());
            int num2 = Integer.parseInt(second.getText());

            String result = String.valueOf(num1 - num2);

            JOptionPane.showMessageDialog(f, "Result: " + result);
        });

        multiply.addActionListener(e -> {
            int num1 = Integer.parseInt(first.getText());
            int num2 = Integer.parseInt(second.getText());

            String result = String.valueOf(num1 * num2);

            JOptionPane.showMessageDialog(f, "Result: " + result);
        });

        divide.addActionListener(e -> {
            int num1 = Integer.parseInt(first.getText());
            int num2 = Integer.parseInt(second.getText());

            try {
                String result = String.valueOf(num1 / num2);

                JOptionPane.showMessageDialog(f, "Result: " + result);
            } catch(ArithmeticException ae) {
                JOptionPane.showMessageDialog(f, "Error: Division by zero");
            }
        });

        JPanel buttons = new JPanel(new GridLayout(2,2));
        buttons.add(add);
        buttons.add(minus);
        buttons.add(multiply);
        buttons.add(divide);

        fields.add(first);
        fields.add(second);

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.add(new JLabel("CALCULATOR"));
        main.add(fields);
        main.add(buttons);

        f.add(main);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
