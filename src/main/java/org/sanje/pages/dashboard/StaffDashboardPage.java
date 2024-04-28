package org.sanje.pages.dashboard;

import org.sanje.config.AppConfig;
import org.sanje.factory.ComponentFactory;
import org.sanje.pages.order.OrderPage;
import org.sanje.utils.PageLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffDashboardPage extends PageLayout implements ActionListener
{
    JButton cafeMenuButton, saleInformationButton,b3;
    JPanel mainPanel;
	

    public StaffDashboardPage()
    {
        super("Home");

        mainPanel = ComponentFactory.generatePanel(null, 650, 100);

        cafeMenuButton = new JButton("MENU");
        cafeMenuButton.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        cafeMenuButton.setForeground(Color.black);
        cafeMenuButton.setBounds(130,150,400,60);
        cafeMenuButton.addActionListener(this);
        mainPanel.add(cafeMenuButton);
		
		saleInformationButton = new JButton("SALE INFORMATION");
        saleInformationButton.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        saleInformationButton.setForeground(Color.black);
        saleInformationButton.setBounds(130,260,400,60);
        saleInformationButton.addActionListener(this);
        mainPanel.add(saleInformationButton);

        setBackground(mainPanel, AppConfig.backgroundImage);

        this.add(mainPanel);
       
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (cafeMenuButton == ae.getSource()) {
            navigate(new OrderPage());
        } else if (saleInformationButton == ae.getSource()) {
            alert("This feature is under development.");
        }
    }
}

