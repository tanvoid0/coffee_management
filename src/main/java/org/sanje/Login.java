package org.sanje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
	JLabel l1,l2;
	JButton b1;
    JPanel p1,p2;
	JTextField t1;
	JPasswordField pf1;
	
	public Login(){
		super(" Page-1 ");
		this.setSize(650,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(650,600));
		p1.setBackground(Color.white);
		p1.setLayout(null);
		
		p2 = new JPanel();
//		p2.setSize(new Dimension(500,450));
		p1.setBounds(75,125,500,475);
		p2.setBackground(Color.white);
		p2.setLayout(null);
		
		l1 = new JLabel("Email");
		l1.setFont(new Font("Serif",Font.BOLD,50));
		l1.setForeground(Color.black);
		l1.setBounds(150,200,150,25);
		p2.add(l1);
		
		l2 = new JLabel("Password ");
		l2.setFont(new Font("Serif",Font.BOLD,50));
		l2.setForeground(Color.black);
		l2.setBounds(150,300,150,25);
		p2.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(300,200,200,25);
		p2.add(t1);
		
		pf1=new JPasswordField();
		pf1.setBounds(300,300,200,25);
		p2.add(pf1);
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBounds(300,400,100,25);
		b1.addActionListener(this);
		p2.add(b1);

		
		
		this.add(p1);
		this.add(p2);
	}
	
	public void actionPerformed(ActionEvent ae)
    {
       

    }
}