package com.sanje.cafe_management.page;

import com.sanje.cafe_management.data.AppConfig;
import com.sanje.cafe_management.utils.ComponentFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.function.Function;

public abstract class PageLayout extends JFrame {
    protected PageLayout(final String title) {
        super(title);
        this.setSize(AppConfig.width, AppConfig.height);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected PageLayout(final String title, final String icon) {
        this(title);
        System.out.println(this.getClass().getResource(icon));
        this.setIconImage(new ImageIcon(Objects.requireNonNull(this.getClass().getResource(icon))).getImage());
    }

    protected void launch(final JPanel panel) {
        getContentPane().add(panel, BorderLayout.CENTER);
//        pack(); // TODO: Sets the relative size
        setLocationRelativeTo(null);
        setVisible(true);
    }

    protected void setBackgroundImage(final JPanel panel, final String imagePath) {
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

    protected ActionListener onPressed(final Function<Void, Void> fn) {
        return ComponentFactory.onPressed(this, fn);
    }
}
