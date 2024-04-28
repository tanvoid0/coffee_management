package org.sanje.pages.payment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentPage extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JPanel p1,p2,p3,p4;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JComboBox db1;

    public PaymentPage()
    {
        super(" Home ");
        this.setSize(650,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(650,100));
        p1.setBackground(Color.white);
        p1.setLayout(null);
        
        b1 = new JButton("MOBILE BANKING");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b1.setForeground(Color.black);
        b1.setBounds(30,25,250,50);
        b1.addActionListener(this);
        p1.add(b1);
		
		b2 = new JButton("CARD ");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.black);
        b2.setBounds(370,25,250,50);
        b2.addActionListener(this);
        p1.add(b2);
		
		
		
		p2 = new JPanel();
		p2.setBounds(00,100,650,500);
        p2.setBackground(Color.blue);
        p2.setLayout(null);
		
		b3 = new JButton("BIKASH");
        b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b3.setForeground(Color.black);
        b3.setBounds(30,125,190,50);
        b3.addActionListener(this);
        p2.add(b3);
		
		b4 = new JButton("NAGAD");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.black);
		b4.setBounds(230,125,190,50);
		b4.addActionListener(this);
		p2.add(b4);
		
		b5 = new JButton("ROCKET ");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.black);
		b5.setBounds(430,125,190,50);
		b5.addActionListener(this);
		p2.add(b5);
		
		
		
		l1 = new JLabel("NUMBER");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(30,300,150,50);
		p2.add(l1);
		
		
		t1 = new JTextField();
		t1.setBounds(200,300,350,50);
		p2.add(t1);
		
		
		b5 = new JButton("CLOSE");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.black);
		b5.setBounds(100,450,200,50);
		b5.addActionListener(this);
		p2.add(b5);
		
		b6 = new JButton("CONFIRM");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b6.setForeground(Color.black);
		b6.setBounds(400,450,200,50);
		b6.addActionListener(this);
		p2.add(b6);

		p3 = new JPanel();
		p3.setBounds(00,100,650,500);
		p3.setBackground(Color.blue);
		p3.setLayout(null);

		b6 = new JButton("MASTERCARD");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b6.setForeground(Color.black);
		b6.setBounds(40,25,240,50);
		b6.addActionListener(this);
		p3.add(b6);

		b7 = new JButton("VISACARD");
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b7.setForeground(Color.black);
		b7.setBounds(370,25,240,50);
		b7.addActionListener(this);
		p3.add(b7);



		l2 = new JLabel("NAME");
		l2.setFont(new Font("Serif",Font.BOLD,30));
		l2.setForeground(Color.black);
		l2.setBounds(30,100,150,50);
		p3.add(l2);


		t2 = new JTextField();
		t2.setBounds(200,100,350,50);
		p3.add(t2);

		l3 = new JLabel("NUMBER");
		l3.setFont(new Font("Serif",Font.BOLD,30));
		l3.setForeground(Color.black);
		l3.setBounds(30,175,100,50);
		p3.add(l3);


		t3 = new JTextField();
		t3.setBounds(120,100,380,50);
		p3.add(t3);

		l4 = new JLabel("CVC");
		l4.setFont(new Font("Serif",Font.BOLD,30));
		l4.setForeground(Color.black);
		l4.setBounds(400,175,80,50);
		p3.add(l4);


		t4 = new JTextField();
		t4.setBounds(500,100,125,50);
		p3.add(t4);


		b5 = new JButton("CLOSE");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.black);
		b5.setBounds(100,450,200,50);
		b5.addActionListener(this);
		p2.add(b5);

		b6 = new JButton("CONFIRM");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b6.setForeground(Color.black);
		b6.setBounds(400,450,200,50);
		b6.addActionListener(this);
		p2.add(b6);

        this.add(p1);
        this.add(p2);
		this.add(p3);
       
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==b1){
			p2.setVisible(true);
		}
		else if(ae.getSource()==b2){
			p2.setVisible(false);
			p3.setVisible(true);

		}
    }
}
	

