package org.sanje.utils;

import org.sanje.config.AppConfig;
import org.sanje.factory.ComponentFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class PageLayout extends JFrame implements ActionListener {
    protected PageLayout(final String title) {
        super(title);
        this.setSize(AppConfig.width, AppConfig.height);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected void setBackground(final JPanel panel, final String imagePath) {
        final JLabel imageLabel = ComponentFactory.generateImage(this, imagePath);

        panel.add(imageLabel, BorderLayout.CENTER);
    }

    protected void navigate(final JFrame toPage) {
        if (toPage == null) {
            alert("A page must be provided to navigate. Null value provided.");
            return;
        }
        this.setVisible(false);
        toPage.setVisible(true);
    }

    protected void alert(final String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
