package org.sanje.pages;

import org.sanje.factory.ComponentFactory;
import org.sanje.pages.authentication.LoginPage;
import org.sanje.utils.PageLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends PageLayout implements ActionListener
{
    final JButton nextButton;
    final JPanel mainPanel;
	final JLabel hotLineLabel;
    final JLabel imageLabel;

    public HomePage()
    {
        super("Home");

        mainPanel = ComponentFactory.generatePanel(Color.white, 650, 600);
		
		hotLineLabel = ComponentFactory.generateLabel("Hotline : 01888750*** ", null, null, 50, 20, 300, 25);
		mainPanel.add(hotLineLabel);

	   
        nextButton = ComponentFactory.generateButton(this, "NEXT", 530, 525, 100, 25);
        mainPanel.add(nextButton);

        imageLabel = ComponentFactory.generateImage(this, "/images/coffee.png");

        mainPanel.add(imageLabel, BorderLayout.CENTER);
        this.add(mainPanel);
       
    }

    public void actionPerformed(ActionEvent ae)
    {
       if (ae.getSource() == nextButton) {
           navigate(new LoginPage());
       }
    }
	

}
	

