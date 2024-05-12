package com.sanje.cafe_management.page;

import com.sanje.cafe_management.data.AppConfig;
import com.sanje.cafe_management.service.AuthService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage_backup2 extends PageLayout {
    final JLabel emailLabel, passwordLabel;
    final JButton loginButton;
//    final JPanel mainPanel;
    final JTextField emailField;
    final JPasswordField passwordField;
//	final JLabel imageLabel;
private JPanel loginPanel;

    final AuthService authService = new AuthService();

    public LoginPage_backup2() {
        super("Login", AppConfig.loginBackgroundImage);
        setLayout(new BorderLayout());

        // Create login panel with centered layout
        loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setOpaque(false); // Transparent background

        // Add components to the panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        emailLabel = new JLabel("Email:");
        loginPanel.add(emailLabel, gbc);

        gbc.gridy++;
        passwordLabel = new JLabel("Password:");
        loginPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        emailField = new JTextField(15);
        loginPanel.add(emailField, gbc);

        gbc.gridy++;
        passwordField = new JPasswordField(15);
        loginPanel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform login authentication here
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                // Dummy authentication for demonstration
                if (email.equals("admin@example.com") && password.equals("password")) {
                    JOptionPane.showMessageDialog(LoginPage_backup2.this, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginPage_backup2.this, "Invalid email or password. Please try again.");
                }
            }
        });
        loginPanel.add(loginButton, gbc);

        // Add the login panel to the center of the frame
        add(loginPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}