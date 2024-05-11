package com.sanje.cafe_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginPage extends PageLayout {
    final JLabel emailLabel, passwordLabel;
    final JButton loginButton;
    final JPanel mainPanel;
    final JTextField emailField;
    final JPasswordField passwordField;
	final JLabel imageLabel;
    final AuthService authService = new AuthService();

    public LoginPage() {
        super("Login");


        mainPanel = ComponentFactory.generatePanel(null, 0, 0,1200, 500);

        emailLabel = ComponentFactory.generateLabel("Email :", null, null, 450, 200, 150, 50);
        mainPanel.add(emailLabel);

        passwordLabel = ComponentFactory.generateLabel("Password :", null, null, 450, 300, 150, 50);
        mainPanel.add(passwordLabel);

        emailField = ComponentFactory.generateTextField(null, 600, 200, (int) AppConfig.textFieldDimension.getWidth(), (int) AppConfig.textFieldDimension.getHeight());
        mainPanel.add(emailField);

        passwordField = ComponentFactory.generatePasswordField(null, 600, 300, (int) AppConfig.textFieldDimension.getWidth(), (int) AppConfig.textFieldDimension.getHeight());
        mainPanel.add(passwordField);

        loginButton = ComponentFactory.generateButton(this, "Login", 550, 400, 150, 50);
        mainPanel.add(loginButton);

		imageLabel = ComponentFactory.generateLoginImage(this, AppConfig.loginBackgroundImage);
        mainPanel.add(imageLabel, BorderLayout.CENTER);



        this.add(mainPanel);

        mainPanel.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == loginButton) {
                final User user = authService.login(emailField.getText(), new String(passwordField.getPassword()));

                if (user.getRole().equals(UserRole.ADMIN)) {
                    navigate(new AdminDashboardPage());
                } else if (user.getRole().equals(UserRole.STAFF)) {
                    navigate(new StaffDashboardPage());
                } else {
                    navigate(new menu());
                }
            }
        } catch (final Exception e) {
            System.out.println(e);
            alert(e.getMessage());
        }

    }
}