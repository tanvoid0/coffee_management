package com.sanje.cafe_management.page;

import com.sanje.cafe_management.data.AppConfig;
import com.sanje.cafe_management.utils.ComponentFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends PageLayout {
    final JButton nextButton;
    final JPanel mainPanel;
    final JLabel hotLineLabel;

    public HomePage() {
        super("Home");

        mainPanel = ComponentFactory.generatePanelWithBorderLayout();
        setBackgroundImage(mainPanel, AppConfig.backgroundImage);

        hotLineLabel = ComponentFactory.generateLabel("Hotline : 01888750*** ");
        hotLineLabel.setBorder(AppConfig.border);
        mainPanel.add(hotLineLabel, BorderLayout.NORTH);

        nextButton = ComponentFactory.generateButton("NEXT");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigate(new LoginPage());
            }
        });
        final JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(nextButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        launch(mainPanel);
    }

    public static HomePage run() {
        return new HomePage();
    }
}
	

