package com.sanje.cafe_management.utils;

import com.sanje.cafe_management.data.AppConfig;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class ComponentFactory {

    public static ImageIcon readImageIcon(String path) throws IOException {
        final String currentDir = System.getProperty("user.dir");
        final String imagePath = currentDir + path;
        final BufferedImage image = loadImage(imagePath);
        if (image != null) {
            return new ImageIcon(image);
        }
        return null;
    }

    public static JLabel readImage(JFrame frame, String path) {
        try {
            String currentDir = System.getProperty("user.dir");
            String imagePath = currentDir + path;
            BufferedImage image = loadImage(imagePath);
            if (image != null) {
                return new JLabel(new ImageIcon(image));
            }

            JOptionPane.showMessageDialog(frame, "Failed to read image: " + path, "Error", 0);
        } catch (IOException var5) {
            IOException ex = var5;
            ex.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Failed to read image: " + path + " " + ex.getMessage());
        }

        return null;
    }

    private static BufferedImage loadImage(String imagePath) throws IOException {
        File file = new File(imagePath);
        if (file.exists()) {
            return ImageIO.read(file);
        } else {
            throw new IOException("Image file not found");
        }
    }

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

    public static JPanel generatePanelWithBorderLayout() {
        return new JPanel(new BorderLayout());
    }

    public static JLabel generateLabel(final String text) {
        final JLabel label = new JLabel(text);
        label.setFont(AppConfig.labelFont);
        label.setForeground(AppConfig.textColor);
        return label;
    }

    public static JLabel generateLabel(final String title, final Font font, final Color color, final int x, final int y, final int width, final int height) {
        final JLabel label = new JLabel(title);
        label.setFont(font == null ? AppConfig.labelFont : font);
        label.setForeground(color == null ? Color.black : color);
        label.setBounds(x, y, width, height);
        return label;
    }

    public static JButton generateButton(final String text) {
        return new JButton(text);
    }

    public static JButton generateButton(final ActionListener actionListener, final String title, final int x, final int y, final int width, final int height) {
        final JButton button = generateButton(title, x, y, width, height);
        button.addActionListener(actionListener);
        return button;
    }

    public static JButton generateButton(final String title, final int x, final int y, final int width, final int height) {
        final JButton button = new JButton(title);
        button.setFont(AppConfig.buttonFont);
        button.setForeground(Color.black);
        button.setBounds(x, y, width, height);
        return button;
    }

    public static ActionListener onPressed(final JFrame frame, final Function<Void, Void> fn) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    fn.apply(null);
                } catch(final Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                }
            }
        };
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

    public static JTabbedPane generateTabs(java.util.List<String> titles, List<JPanel> panels) {
        JTabbedPane tabs = new JTabbedPane();

        for(int i = 0; i < titles.size(); ++i) {
            int startAxis = 10;

            for(Iterator var5 = titles.iterator(); var5.hasNext(); startAxis += 150) {
                String title = (String)var5.next();
                JButton tabButton = new JButton(title);
                tabButton.setFont(new Font("Serif", 1, 18));
                tabButton.setForeground(Color.red);
                tabButton.setBackground(new Color(209, 209, 209));
                tabButton.setBorder((Border)null);
                tabButton.setBounds(startAxis, 18, 150, 35);
            }

            tabs.addTab((String)titles.get(i), (Component)panels.get(i));
        }

        return tabs;
    }

}
