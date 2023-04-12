package calculadora_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    private JFrame frame;
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
    };

    private double num1, num2, resultado;
    private String operador;

    public CalculadoraGUI() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        buttons = new JButton[16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(new ButtonClickListener());
        }
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String buttonText = source.getText();

            switch (buttonText) {
                case "=":
                    num2 = Double.parseDouble(textField.getText());
                    switch (operador) {
                        case "+":
                            resultado = num1 + num2;
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                JOptionPane.showMessageDialog(frame, "Error: División por cero no permitida.");
                                textField.setText("");
                                return;
                            } else {
                                resultado = num1 / num2;
                            }
                            break;
                    }
                    textField.setText(Double.toString(resultado));
                    num1 = resultado;
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(textField.getText());
                    operador = buttonText;
                    textField.setText("");
                    break;
                default:
                    String currentText = textField.getText();
                    textField.setText(currentText + buttonText);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraGUI());
    }
}
