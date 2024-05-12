package com.sanje.cafe_management.page;

import com.sanje.cafe_management.data.AppConfig;
import com.sanje.cafe_management.data.User;
import com.sanje.cafe_management.data.UserRole;
import com.sanje.cafe_management.service.AuthService;
import com.sanje.cafe_management.utils.ComponentFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage_backup extends PageLayout {
    final JLabel emailLabel, passwordLabel;
    final JButton loginButton;
    final JPanel mainPanel;
    final JTextField emailField;
    final JPasswordField passwordField;
	final JLabel imageLabel;
    final AuthService authService = new AuthService();

    public LoginPage_backup() {
        super("Login");


        mainPanel = ComponentFactory.generatePanelWithBorderLayout();

        final JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.setBorder(AppConfig.border);

        emailLabel = ComponentFactory.generateLabel("Email");
        passwordLabel = ComponentFactory.generateLabel("Password");
        emailField = new JTextField();
        passwordField = new JPasswordField();

        centerPanel.add(emailLabel);
        centerPanel.add(emailField);
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);
        mainPanel.add(centerPanel, BorderLayout.SOUTH);

        loginButton = ComponentFactory.generateButton("Login");
        mainPanel.add(loginButton);

		imageLabel = ComponentFactory.generateLoginImage(this, AppConfig.loginBackgroundImage);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final User user;
                try {
                    user = authService.login(emailField.getText(), new String(passwordField.getPassword()));
                    if (user.getRole().equals(UserRole.ADMIN)) {
                        navigate(new AdminDashboardPage());
                    } else if (user.getRole().equals(UserRole.STAFF)) {
                        navigate(new StaffDashboardPage());
                    } else {
                        navigate(new MainMenu());
                    }
                } catch (Exception ex) {
                    alert(ex.getMessage());
                }
            }
        });
        mainPanel.add(loginButton);

        launch(mainPanel);
    }
}