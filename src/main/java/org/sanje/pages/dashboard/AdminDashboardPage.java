package org.sanje.pages.dashboard;

import org.sanje.config.AppConfig;
import org.sanje.entity.UserRole;
import org.sanje.factory.ComponentFactory;
import org.sanje.utils.PageLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboardPage extends PageLayout implements ActionListener
{
    JButton b1,b2,b3, registerButton, logoutButton, deleteProduct, editProduct, addProduct;
	JLabel emailLabel, passwordLabel, roleLabel;
    JPanel mainPanel, registrationPanel, itemPanel,p4;
	JTextField emailField, passwordField,t3;
	JComboBox roleComboBox;

    public AdminDashboardPage()
    {
        super("Home");

        mainPanel = ComponentFactory.generatePanel(Color.white, 650, 100);

        b1 = new JButton("Registration");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b1.setForeground(Color.black);
        b1.setBounds(30,25,190,50);
        b1.addActionListener(this);
        mainPanel.add(b1);
		
		b2 = new JButton("Items");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.black);
        b2.setBounds(230,25,190,50);
        b2.addActionListener(this);
        mainPanel.add(b2);
		
		b3 = new JButton("Daily Sell");
        b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b3.setForeground(Color.black);
        b3.setBounds(430,25,190,50);
        b3.addActionListener(this);
        mainPanel.add(b3);

		JTabbedPane tabs = new JTabbedPane();


		registrationPanel = new JPanel();
		registrationPanel.setBounds(0,100,650,500);
        registrationPanel.setBackground(Color.blue);
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
		
		passwordField = new JTextField();
		passwordField.setBounds(300,200,300,50);
		registrationPanel.add(passwordField);
		
		roleComboBox = new JComboBox(UserRole.values());
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
        itemPanel.setBackground(Color.blue);
        itemPanel.setLayout(null);
		
		deleteProduct = new JButton("DELETE ITEM");
		deleteProduct.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		deleteProduct.setForeground(Color.black);
		deleteProduct.setBounds(125,250,400,50);
		deleteProduct.addActionListener(this);
		deleteProduct.setVisible(false);
		itemPanel.add(deleteProduct);
		
		editProduct = new JButton("EDIT PRICE");
		editProduct.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		editProduct.setForeground(Color.black);
		editProduct.setBounds(125,350,400,50);
		editProduct.addActionListener(this);
		editProduct.setVisible(false);
		itemPanel.add(editProduct);
		
		addProduct = new JButton("ADD ITEM");
		addProduct.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		addProduct.setForeground(Color.black);
		addProduct.setBounds(125,450,400,50);
		addProduct.addActionListener(this);
		itemPanel.add(addProduct);

		tabs.addTab("Registration", registrationPanel);
		tabs.addTab("Products", itemPanel);

		this.add(tabs);
		this.setSize(AppConfig.width, AppConfig.height);
		this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==b1){
			registrationPanel.setVisible(true);
			itemPanel.setVisible(false);
		}
		else if(ae.getSource()==b2){
			itemPanel.setVisible(true);
			registrationPanel.setVisible(false);
		}      
    }
}
	

