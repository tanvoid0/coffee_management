package org.sanje.pages.authentication;

import org.sanje.config.AppConfig;
import org.sanje.entity.User;
import org.sanje.entity.UserRole;
import org.sanje.factory.ComponentFactory;
import org.sanje.pages.dashboard.AdminDashboardPage;
import org.sanje.pages.dashboard.StaffDashboardPage;
import org.sanje.pages.order.OrderPage;
import org.sanje.service.AuthService;
import org.sanje.utils.PageLayout;

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
        super("Login");


        mainPanel = ComponentFactory.generatePanel(null, 75, 125, getWidth(), 300);

        emailLabel = ComponentFactory.generateLabel("Email", null, null, 150, 200, 150, 25);
        mainPanel.add(emailLabel);

        passwordLabel = ComponentFactory.generateLabel("Password", null, null, 150, 300, 150, 25);
        mainPanel.add(passwordLabel);

        emailField = ComponentFactory.generateTextField(null, 300, 200, (int) AppConfig.textFieldDimension.getWidth(), (int) AppConfig.textFieldDimension.getHeight());
        mainPanel.add(emailField);

        passwordField = ComponentFactory.generatePasswordField(null, 300, 300, (int) AppConfig.textFieldDimension.getWidth(), (int) AppConfig.textFieldDimension.getHeight());
        mainPanel.add(passwordField);

        loginButton = ComponentFactory.generateButton(this, "Login", 300, 400, 150, 25);
        mainPanel.add(loginButton);

        setBackground(mainPanel, AppConfig.backgroundImage);

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
                    navigate(new OrderPage());
                }
            }
        } catch (final Exception e) {
            System.out.println(e);
            alert(e.getMessage());
        }

    }
}