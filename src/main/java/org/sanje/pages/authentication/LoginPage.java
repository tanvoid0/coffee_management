package org.sanje.pages.authentication;

import org.sanje.config.AppConfig;
import org.sanje.factory.ComponentFactory;
import org.sanje.pages.dashboard.AdminDashboardPage;
import org.sanje.pages.dashboard.StuffDashboardPage;
import org.sanje.utils.PageLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends PageLayout implements ActionListener {
    final JLabel emailLabel, passwordLabel;
    final JButton loginButton;
    final JButton adminLoginButton;
    final JPanel mainPanel;
    final JTextField emailField;
    final JPasswordField passwordField;

    public LoginPage() {
        super("Login");


        mainPanel = ComponentFactory.generatePanel(null, 75, 125, getWidth(), 300);

        emailLabel = ComponentFactory.generateLabel("Email", null, null, 150, 200, 150, 25);
        mainPanel.add(emailLabel);

        passwordLabel = ComponentFactory.generateLabel("Password", null, null, 150, 300, 150, 25);
        mainPanel.add(passwordLabel);

        emailField = ComponentFactory.generateTextField(null, 300, 200, AppConfig.textFieldDimension.getWidth(), AppConfig.textFieldDimension.getHeight());
        mainPanel.add(emailField);

        passwordField = ComponentFactory.generatePasswordField(null, 300, 300, AppConfig.textFieldDimension.getWidth(), AppConfig.textFieldDimension.getHeight());
        mainPanel.add(passwordField);

        loginButton = ComponentFactory.generateButton(this, "Stuff Login", 300, 400, 150, 25);
        mainPanel.add(loginButton);

        adminLoginButton = ComponentFactory.generateButton(this, "Admin Login", 300, 450, 150, 25);
        mainPanel.add(adminLoginButton);
        setBackground(mainPanel, "/images/coffee.png");

        this.add(mainPanel);

        mainPanel.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == loginButton) {
            navigate(new StuffDashboardPage());
        } else if (ae.getSource() == adminLoginButton) {
            navigate(new AdminDashboardPage());
        }
    }
}