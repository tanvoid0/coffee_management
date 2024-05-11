package com.sanje.cafe_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HomePage extends PageLayout
{
    final JButton nextButton;
    final JPanel mainPanel;
	final JLabel hotLineLabel;
    final JLabel imageLabel;

    public HomePage()
    {
        super("Home");

        mainPanel = ComponentFactory.generatePanel(Color.white, 1000, 600);
		
		hotLineLabel = ComponentFactory.generateLabel("Hotline : 01888750*** ", null, null, 50, 20, 300, 25);
		mainPanel.add(hotLineLabel);

	   
        nextButton = ComponentFactory.generateButton(this, "NEXT", 1000, 600, 100, 25);
        mainPanel.add(nextButton);

        imageLabel = ComponentFactory.generateImage(this, AppConfig.backgroundImage);

        mainPanel.add(imageLabel, BorderLayout.CENTER);
        this.add(mainPanel);
       
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
       if (ae.getSource() == nextButton) {
           navigate(new LoginPage());
       }
    }


}
	

