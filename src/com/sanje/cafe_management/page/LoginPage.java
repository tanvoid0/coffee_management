package com.sanje.cafe_management.page;

import com.sanje.cafe_management.data.User;
import com.sanje.cafe_management.data.UserRole;
import com.sanje.cafe_management.data.AppConfig;
import com.sanje.cafe_management.service.AuthService;
import com.sanje.cafe_management.utils.ComponentFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends PageLayout {

    final JLabel emailLabel, passwordLabel;
    final JButton loginButton;
    final JPanel mainPanel;
    final JTextField emailField;
    final JPasswordField passwordField;
    final AuthService authService = new AuthService();

    public LoginPage() {
        super("Login", AppConfig.loginBackgroundImage);
        mainPanel = ComponentFactory.generatePanel(null, 0, 0,1200, 500);

        emailLabel = ComponentFactory.generateLabel("Email :", null, null, 450, 200, 150, 50);
        mainPanel.add(emailLabel);

        passwordLabel = ComponentFactory.generateLabel("Password :", null, null, 450, 300, 150, 50);
        mainPanel.add(passwordLabel);

        emailField = ComponentFactory.generateTextField(null, 600, 200, (int) AppConfig.textFieldDimension.getWidth(), (int) AppConfig.textFieldDimension.getHeight());
        mainPanel.add(emailField);

        passwordField = ComponentFactory.generatePasswordField(null, 600, 300, (int) AppConfig.textFieldDimension.getWidth(), (int) AppConfig.textFieldDimension.getHeight());
        mainPanel.add(passwordField);

        loginButton = ComponentFactory.generateButton("Login", 550, 400, 150, 50);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        mainPanel.add(loginButton);
        setBackgroundImage(mainPanel, AppConfig.loginBackgroundImage);
        launch(mainPanel);
    }

    private void login() {
        try {
            final User user = authService.login(emailField.getText(), new String(passwordField.getPassword()));

            if (user.getRole().equals(UserRole.ADMIN)) {
                navigate(new AdminDashboardPage());
            } else if (user.getRole().equals(UserRole.STAFF)) {
                navigate(new StaffDashboardPage());
            } else {
                navigate(new MainMenu());
            }
        } catch (final Exception ex){
            alert("Login Error" + ex.getMessage());
        }
    }
}