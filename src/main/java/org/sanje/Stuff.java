package org.sanje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stuff extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    JPanel p1;
	

    public Stuff()
    {
        super(" Home ");
        this.setSize(650,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(650,100));
        p1.setBackground(Color.black);
        p1.setLayout(null);
        
        b1 = new JButton("MENU");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        b1.setForeground(Color.black);
        b1.setBounds(130,150,400,60);
        b1.addActionListener(this);
        p1.add(b1);
		
		b2 = new JButton("SELL INFORMATION");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        b2.setForeground(Color.black);
        b2.setBounds(130,260,400,60);
        b2.addActionListener(this);
        p1.add(b2);
		
		b3 = new JButton("DAILY SELL");
        b3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        b3.setForeground(Color.black);
        b3.setBounds(130,370,400,60);
        b3.addActionListener(this);
        p1.add(b3);
		
	

        this.add(p1);
       
    }

    public void actionPerformed(ActionEvent ae)
    {
		
		      

    }
	

}
	

