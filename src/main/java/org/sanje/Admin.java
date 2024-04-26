package org.sanje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JLabel l1,l2,l3;
    JPanel p1,p2,p3,p4;
	JTextField t1,t2,t3;
	JComboBox db1;

    public Admin()
    {
        super(" Home ");
        this.setSize(650,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(650,100));
        p1.setBackground(Color.white);
        p1.setLayout(null);
        
        b1 = new JButton("Registration");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b1.setForeground(Color.black);
        b1.setBounds(30,25,190,50);
        b1.addActionListener(this);
        p1.add(b1);
		
		b2 = new JButton("Items");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.black);
        b2.setBounds(230,25,190,50);
        b2.addActionListener(this);
        p1.add(b2);
		
		b3 = new JButton("Daily Sell");
        b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b3.setForeground(Color.black);
        b3.setBounds(430,25,190,50);
        b3.addActionListener(this);
        p1.add(b3);
		
		p2 = new JPanel();
//        p2.setSize(new Dimension(650,100));
		p2.setBounds(00,100,650,500);
        p2.setBackground(Color.blue);
        p2.setLayout(null);
		
		l1 = new JLabel("Email");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(100,100,150,50);
		p2.add(l1);
		
		l2 = new JLabel("Password ");
		l2.setFont(new Font("Serif",Font.BOLD,30));
		l2.setForeground(Color.black);
		l2.setBounds(100,200,150,50);
		p2.add(l2);
		
		l3 = new JLabel("Role ");
		l3.setFont(new Font("Serif",Font.BOLD,30));
		l3.setForeground(Color.black);
		l3.setBounds(100,300,150,50);
		p2.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(300,100,300,50);
		p2.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(300,200,300,50);
		p2.add(t2);
		
		String[] options = {"STUFF", "CUSTOMER"};
		db1= new JComboBox(options);
		db1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		db1.setForeground(Color.black);
		db1.setBounds(300,300,300,50);
		db1.addActionListener(this);
		p2.add(db1);
	
		b4 = new JButton("Register");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.black);
		b4.setBounds(200,400,200,50);
		b4.addActionListener(this);
		p2.add(b4);
		
		b5 = new JButton("LOGOUT");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		b5.setForeground(Color.black);
		b5.setBounds(500,400,100,50);
		b5.addActionListener(this);
		p2.add(b5);
		
		
		p3 = new JPanel();
		p3.setBounds(00,100,650,500);
        p3.setBackground(Color.blue);
        p3.setLayout(null);
		
		b6 = new JButton("DELETE ITEM");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b6.setForeground(Color.black);
		b6.setBounds(125,250,400,50);
		b6.addActionListener(this);
		p3.add(b6);
		
		b7 = new JButton("EDIT PRICE");
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b7.setForeground(Color.black);
		b7.setBounds(125,350,400,50);
		b7.addActionListener(this);
		p3.add(b7);
		
		b8 = new JButton("ADD ITEM");
		b8.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b8.setForeground(Color.black);
		b8.setBounds(125,450,400,50);
		b8.addActionListener(this);
		p3.add(b8);
		
		
		
		
		

        this.add(p1);
        this.add(p2);
		this.add(p3);
       
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==b1){
			p2.setVisible(true);
			p3.setVisible(false);
		}
		else if(ae.getSource()==b2){
			p3.setVisible(true);
			p2.setVisible(false);
		}      

    }
	

}
	

