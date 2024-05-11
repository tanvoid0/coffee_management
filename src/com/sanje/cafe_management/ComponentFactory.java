package com.sanje.cafe_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ComponentFactory {

    /**
     * Generates a background image with resource path
     * @param jFrame - Parent JFrame
     * @param path - resource path of the image
     * @return a JLabel with image as background
     */
    public static JLabel generateImage(final JFrame jFrame, final String path) {
        JLabel imageLabel = new JLabel(new ImageIcon(Objects.requireNonNull(jFrame.getClass().getResource(path))));
        imageLabel.setSize(jFrame.getWidth(), jFrame.getHeight());
        return imageLabel;
    }

    public static JLabel generateLoginImage(final JFrame jFrame, final String path) {
        JLabel imageLabel = new JLabel(new ImageIcon(Objects.requireNonNull(jFrame.getClass().getResource(path))));
        imageLabel.setSize(jFrame.getWidth(), jFrame.getHeight());
        return imageLabel;
    }

    public static JLabel generateImage(final ImageIcon image) {
        JLabel imageLabel = new JLabel(image);
        imageLabel.setPreferredSize(AppConfig.productImageDimension);
        return imageLabel;
    }
    public static JLabel generateLoginImage(final ImageIcon image) {
        JLabel imageLabel = new JLabel(image);
        imageLabel.setPreferredSize(AppConfig.productImageDimension);
        return imageLabel;
    }

    /**
     * Generates a panel with size and color
     *
     * @param width - width of the panel
     * @param height - height of the panel
     * @param color - color of the panel, default color is white
     *
     * @return - a JPanel
     */
    public static JPanel generatePanel(final Color color, final int width, final int height) {
        final JPanel panel = new JPanel();
        panel.setSize(width, height);
        panel.setBackground(color == null ? Color.white : color);
        panel.setLayout(null);
        return panel;
    }

    public static JPanel generatePanel(final Color color, final int x, final int y, final int width, final int height) {
        final JPanel panel = new JPanel();
        panel.setBounds(x, y, width, height);
        panel.setBackground(color == null ? Color.white : color);
        panel.setLayout(null);
        return panel;
    }

    public static JLabel generateLabel(final String title, final Font font, final Color color, final int x, final int y, final int width, final int height) {
        final JLabel label = new JLabel(title);
        label.setFont(font == null ? AppConfig.labelFont : font);
        label.setForeground(color == null ? Color.black : color);
        label.setBounds(x, y, width, height);
        return label;
    }

    public static JButton generateButton(final ActionListener actionListener, final String title, final int x, final int y, final int width, final int height) {
        final JButton button = new JButton(title);
        button.setFont(AppConfig.buttonFont);
        button.setForeground(Color.black);
        button.setBounds(x, y, width, height);
        button.addActionListener(actionListener);
        return button;
    }

    public static JTextField generateTextField(final String value, final int x, final int y, final int width, final int height) {
        final JTextField textField = new JTextField();
        textField.setText(value == null ? "" : value);
        textField.setBounds(x, y, width, height);
        return textField;
    }

    public static JPasswordField generatePasswordField(final String value, final int x, final int y, final int width, final int height) {
        final JPasswordField passwordField = new JPasswordField();
        passwordField.setText(value == null ? "" : value);
        passwordField.setBounds(x, y, width, height);
        return passwordField;
    }

}
