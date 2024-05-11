package com.sanje.cafe_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotCoffee extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;

    JButton b1,b2,b3,b4,b5,b6;

    JPanel P1,P2,P3;


    HotCoffee()
    {
        super("Shop");
        this.setSize(750,510);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Panel

        P2 = new JPanel();
        P2.setBounds(0,40,750,50);
        P2.setBackground(new Color(219,219,219));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

        P3 = new JPanel();
        P3.setBounds(0,100,750,400);
        P3.setBackground(new Color(216,228,250));
        P3.setLayout(null);

        //panel 2 component

        b2 = new JButton("Cold Coffee");
        b2.setFont(new Font("Serif",Font.PLAIN,18));
        b2.setForeground(Color.black);
        b2.setBackground(new Color(219,219,219));
        b2.setBorder(null);
        b2.setBounds(25,12,150,35);

        b2.setFocusable(false);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b2);



        b3 = new JButton("Hot Coffee");
        b3.setFont(new Font("Serif",Font.BOLD,18));
        b3.setForeground(Color.red);
        b3.setBackground(new Color(209,209,209));
        b3.setBorder(null);
        b3.setBounds(230,18,110,25);

        b3.setFocusable(false);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b3);



        b4 = new JButton("Desert");
        b4.setFont(new Font("Serif",Font.PLAIN,18));
        b4.setForeground(Color.black);
        b4.setBackground(new Color(219,219,219));
        b4.setBorder(null);
        b4.setBounds(405,18,100,25);

        b4.setFocusable(false);
        b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b4);


        b5 = new JButton("Food");
        b5.setFont(new Font("Serif",Font.PLAIN,18));
        b5.setForeground(Color.black);
        b5.setBackground(new Color(219,219,219));
        b5.setBorder(null);
        b5.setBounds(600,18,80,25);

        b5.setFocusable(false);
        b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b5);


        //panel 3 component

        l2 = new JLabel("Menu Showing : Hot Coffee!");
        l2.setFont(new Font("Serif",Font.BOLD | Font.ITALIC ,22));
        l2.setForeground(Color.black);
        l2.setBounds(20,104,400,28);
        P3.add(l2);

        //panel 3  image
        l3 = new JLabel(new ImageIcon(getClass().getResource("/image/Coffee1.jpeg")));
        l3.setBounds(100,100,155,210);
        P3.add(l3);

        l4 = new JLabel(new ImageIcon(getClass().getResource("/image/Coffee2.jpeg")));
        l4.setBounds(450,100,155,210);
        P3.add(l4);


        l5 = new JLabel(new ImageIcon(getClass().getResource("/image/Coffee3.jpeg")));
        l5.setBounds(100,270,155,210);
        P3.add(l5);


        l6 = new JLabel(new ImageIcon(getClass().getResource("/image/Coffee4.jpeg")));
        l6.setBounds(450,270,155,210);
        P3.add(l6);




        //panel 3 img name
        l7 = new JLabel("Coffee Name!");
        l7.setFont(new Font("Serif",Font.BOLD,14));
        l7.setForeground(Color.black);
        l7.setBounds(88,270,200,20);
        P3.add(l7);

        l8 = new JLabel("Coffee Name!");
        l8.setFont(new Font("Serif",Font.BOLD,14));
        l8.setForeground(Color.black);
        l8.setBounds(450,270,200,20);
        P3.add(l8);

        l9 = new JLabel("Coffee Name!");
        l9.setFont(new Font("Serif",Font.BOLD,14));
        l9.setForeground(Color.black);
        l9.setBounds(88,440,200,20);
        P3.add(l9);

        l10 = new JLabel("Coffee Name!");
        l10.setFont(new Font("Serif",Font.BOLD,14));
        l10.setForeground(Color.black);
        l10.setBounds(450,440,200,20);
        P3.add(l10);



        this.add(P2);
        this.add(P3);
        setVisible(true);

        //cold coffee
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new menu();

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

}
