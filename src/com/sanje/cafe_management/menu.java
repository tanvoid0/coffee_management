package com.sanje.cafe_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;


public class menu extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;

    JButton b1, b2, b3, b4, b5, b6;

    JPanel P1, P2, P3;


    public menu() {
        super("Shop");
        this.setSize(750, 510);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // panels

        P1 = new JPanel();
        P1.setBounds(0, 0, 750, 50);
        P1.setBackground(new Color(118, 113, 113));
        P1.setBorder(BorderFactory.createLineBorder(Color.gray));
        P1.setLayout(null);

        P2 = new JPanel();
        P2.setBounds(0, 40, 750, 50);
        P2.setBackground(new Color(219, 219, 219));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

        P3 = new JPanel();
        P3.setBounds(0, 100, 750, 400);
        P3.setBackground(new Color(216, 228, 250));
        P3.setLayout(null);


        //panel 1 component

        l1 = new JLabel("Menu");
        l1.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 36));
        l1.setForeground(Color.ORANGE);
        l1.setBounds(20, 6, 180, 35);
        P1.add(l1);

        l2 = new JLabel("..Enjoy Your Time");
        l2.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 12));
        l2.setForeground(Color.orange);
        l2.setBounds(130, 27, 150, 15);
        P1.add(l2);


        //panel 2 component

        b2 = new JButton("Drink");
        b2.setFont(new Font("Serif", Font.BOLD, 18));
        b2.setForeground(Color.red);
        b2.setBackground(new Color(209, 209, 209));
        b2.setBorder(null);
        b2.setBounds(25, 12, 150, 35);

        b2.setFocusable(false);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b2);


        b3 = new JButton("Coffee");
        b3.setFont(new Font("Serif", Font.PLAIN, 18));
        b3.setForeground(Color.black);
        b3.setBackground(new Color(219, 219, 219));
        b3.setBorder(null);
        b3.setBounds(230, 18, 110, 25);

        b3.setFocusable(false);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b3);


        b4 = new JButton("Desert");
        b4.setFont(new Font("Serif", Font.PLAIN, 18));
        b4.setForeground(Color.black);
        b4.setBackground(new Color(219, 219, 219));
        b4.setBorder(null);
        b4.setBounds(405, 18, 100, 25);

        b4.setFocusable(false);
        b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b4);


        b5 = new JButton("Food");
        b5.setFont(new Font("Serif", Font.PLAIN, 18));
        b5.setForeground(Color.black);
        b5.setBackground(new Color(219, 219, 219));
        b5.setBorder(null);
        b5.setBounds(600, 18, 80, 25);

        b5.setFocusable(false);
        b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b5);


        //panel 3 component

        l2 = new JLabel("Menu Showing : Drink");
        l2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
        l2.setForeground(Color.black);
        l2.setBounds(20, 104, 400, 28);
        P3.add(l2);


        l3 = getImage("/image/dr1.jpg");
        l3.setBounds(100, 100, 155, 210);
        P3.add(l3);


        l4 = getImage("/image/dr2.jpg");
        l4.setBounds(450, 100, 155, 210);
        P3.add(l4);


        l5 = getImage("/image/r3.jpg");
        l5.setBounds(100, 270, 155, 210);
        P3.add(l5);


        l6 = getImage("/image/dr4.jpg");
        l6.setBounds(450, 270, 155, 210);
        P3.add(l6);


        //panel 3 img name
        l7 = new JLabel("Oreo Shake...240TK");
        l7.setFont(new Font("Serif", Font.BOLD, 14));
        l7.setForeground(Color.black);
        l7.setBounds(100, 270, 200, 20);
        P3.add(l7);

        l8 = new JLabel("Strawbery Shake...220TK");
        l8.setFont(new Font("Serif", Font.BOLD, 14));
        l8.setForeground(Color.black);
        l8.setBounds(450, 270, 200, 20);
        P3.add(l8);

        l9 = new JLabel("Lemon mint...180TK");
        l9.setFont(new Font("Serif", Font.BOLD, 14));
        l9.setForeground(Color.black);
        l9.setBounds(100, 440, 200, 20);
        P3.add(l9);

        l10 = new JLabel("Ceramel petzel...230TK");
        l10.setFont(new Font("Serif", Font.BOLD, 14));
        l10.setForeground(Color.black);
        l10.setBounds(450, 440, 200, 20);
        P3.add(l10);


        this.add(P1);
        this.add(P2);
        this.add(P3);
        setVisible(true);


        //Hot coffee
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Coffee();

            }
        });

        //Desert coffee
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Desert();

            }
        });

        //Food Coffee
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Food();

            }
        });
    }

    private JLabel getImage(final String image) {
        return new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource(image))));
    }

}
