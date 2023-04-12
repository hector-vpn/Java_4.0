package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        frame = new JFrame("Inicio de Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(3, 1));

        JLabel usernameLabel = new JLabel("Usuario:");
        usernameField = new JTextField();
        formPanel.add(usernameLabel);
        formPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordField = new JPasswordField();
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new ButtonClickListener());
        formPanel.add(loginButton);

        frame.add(formPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Validación de usuario y contraseña
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(frame, "Inicio de sesión exitoso!");
            } else {
                JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm());
    }
}
