package com.sanje.cafe_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffDashboardPage extends PageLayout implements ActionListener
{
    JButton cafeMenuButton, saleInformationButton,logoutButton;
    JPanel mainPanel;
	

    public StaffDashboardPage()
    {
        super("Home");

        mainPanel = ComponentFactory.generatePanel(null, 1200, 700);

        cafeMenuButton = new JButton("MENU");
        cafeMenuButton.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        cafeMenuButton.setForeground(Color.black);
        cafeMenuButton.setBounds(400,200,400,60);
        cafeMenuButton.addActionListener(this);
        mainPanel.add(cafeMenuButton);
		
		saleInformationButton = new JButton("SALE INFORMATION");
        saleInformationButton.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        saleInformationButton.setForeground(Color.black);
        saleInformationButton.setBounds(400,300,400,60);
        saleInformationButton.addActionListener(this);
        mainPanel.add(saleInformationButton);

        logoutButton = new JButton("LOGOUT");
        logoutButton.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        logoutButton.setForeground(Color.black);
        logoutButton.setBounds(400,400,400,60);
        logoutButton.addActionListener(this);
        mainPanel.add(logoutButton);

        setBackground(mainPanel, AppConfig.backgroundImage);

        this.add(mainPanel);
       
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (cafeMenuButton == ae.getSource()) {
            navigate(new menu());
        } else if (saleInformationButton == ae.getSource()) {
            alert("This feature is under development.");
        }
    }
}

