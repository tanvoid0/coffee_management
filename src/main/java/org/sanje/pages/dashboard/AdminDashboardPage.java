package org.sanje.pages.dashboard;

import org.sanje.config.AppConfig;
import org.sanje.entity.User;
import org.sanje.entity.UserRole;
import org.sanje.factory.ComponentFactory;
import org.sanje.pages.authentication.LoginPage;
import org.sanje.pages.order.OrderPage;
import org.sanje.service.AuthService;
import org.sanje.utils.PageLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboardPage extends PageLayout implements ActionListener
{
    final JButton registerButton, logoutButton, deleteProduct, editProduct, addProduct;
	final JLabel emailLabel, passwordLabel, roleLabel;
    final JPanel mainPanel, registrationPanel, itemPanel, salePanel;
	final JTextField emailField;
	final JPasswordField passwordField;
	final JComboBox<UserRole> roleComboBox;
	final AuthService authService = new AuthService();
	UserRole userRole = UserRole.STAFF;

    public AdminDashboardPage()
    {
        super("Home");

        mainPanel = ComponentFactory.generatePanel(Color.white, 650, 100);

		JTabbedPane tabs = new JTabbedPane();


		registrationPanel = new JPanel();
		registrationPanel.setBounds(0,100,650,500);
        registrationPanel.setLayout(null);
		
		emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Serif",Font.BOLD,30));
		emailLabel.setForeground(Color.black);
		emailLabel.setBounds(100,100,150,50);
		registrationPanel.add(emailLabel);
		
		passwordLabel = new JLabel("Password ");
		passwordLabel.setFont(new Font("Serif",Font.BOLD,30));
		passwordLabel.setForeground(Color.black);
		passwordLabel.setBounds(100,200,150,50);
		registrationPanel.add(passwordLabel);
		
		roleLabel = new JLabel("Role ");
		roleLabel.setFont(new Font("Serif",Font.BOLD,30));
		roleLabel.setForeground(Color.black);
		roleLabel.setBounds(100,300,150,50);
		registrationPanel.add(roleLabel);
		
		emailField = new JTextField();
		emailField.setBounds(300,100,300,50);
		registrationPanel.add(emailField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(300,200,300,50);
		registrationPanel.add(passwordField);
		
		roleComboBox = new JComboBox<>(UserRole.values());
		roleComboBox.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		roleComboBox.setForeground(Color.black);
		roleComboBox.setBounds(300,300,300,50);
		roleComboBox.addActionListener(this);
		registrationPanel.add(roleComboBox);
	
		registerButton = new JButton("Register");
		registerButton.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		registerButton.setForeground(Color.black);
		registerButton.setBounds(200,400,200,50);
		registerButton.addActionListener(this);
		registrationPanel.add(registerButton);
		
		logoutButton = new JButton("LOGOUT");
		logoutButton.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		logoutButton.setForeground(Color.black);
		logoutButton.setBounds(500,400,100,50);
		logoutButton.addActionListener(this);
		registrationPanel.add(logoutButton);
		
		
		itemPanel = new JPanel();
		itemPanel.setBounds(0,100,650,500);
        itemPanel.setLayout(null);
		
		deleteProduct = new JButton("DELETE ITEM");
		deleteProduct.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		deleteProduct.setForeground(Color.black);
		deleteProduct.setBounds(125,250,400,50);
		deleteProduct.addActionListener(this);
		itemPanel.add(deleteProduct);
		
		editProduct = new JButton("EDIT PRICE");
		editProduct.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		editProduct.setForeground(Color.black);
		editProduct.setBounds(125,350,400,50);
		editProduct.addActionListener(this);
		itemPanel.add(editProduct);
		
		addProduct = new JButton("ADD ITEM");
		addProduct.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		addProduct.setForeground(Color.black);
		addProduct.setBounds(125,450,400,50);
		addProduct.addActionListener(this);
		itemPanel.add(addProduct);

		salePanel = ComponentFactory.generatePanel(null, AppConfig.width, AppConfig.height);
		final JLabel saleLabel = ComponentFactory.generateLabel("Sale Information", null, null, 0, 0, 200, 50);
		salePanel.add(saleLabel);

		setBackground(registrationPanel, AppConfig.backgroundImage);
		setBackground(itemPanel, AppConfig.backgroundImage);
		setBackground(salePanel, AppConfig.backgroundImage);

		tabs.addTab("Registration", registrationPanel);
		tabs.addTab("Products", itemPanel);
		tabs.addTab("Sales", salePanel);


		this.add(tabs);
		this.setSize(AppConfig.width, AppConfig.height);
		this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
		try {
			if (ae.getSource() == registerButton) {
				final User user = new User((int) Math.random(), "", emailField.getText(), new String(passwordField.getPassword()), userRole);
				authService.register(user);
				if (user.getRole() == UserRole.ADMIN) {
					navigate(new AdminDashboardPage());
				} else if (user.getRole() == UserRole.STAFF) {
					navigate(new StaffDashboardPage());
				} else if (user.getRole() == UserRole.CUSTOMER) {
					navigate(new OrderPage());
				}

			} else if (ae.getSource() == logoutButton) {
				authService.logout();
				navigate(new LoginPage());
			} else if (ae.getSource() == roleComboBox) {
				final Object role = roleComboBox.getSelectedItem();
				userRole = UserRole.valueOf(role.toString());
			}
		} catch (final Exception ex) {
			alert(ex.getMessage());
		}
    }
}
	

