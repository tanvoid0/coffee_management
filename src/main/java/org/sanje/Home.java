package org.sanje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Home extends JFrame implements ActionListener
{
    JButton b1,b2;
    JPanel p1;
	JLabel l1;
	ImageIcon icon;
//	ImageIcon i1;
	final String imagePath = "C:\\Users\\munvo\\OneDrive\\Documents\\project\\cafe_management\\src\\main\\resources\\images\\restaurant.avif";
    public Home()
    {
        super(" Home ");
        this.setSize(650,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(650,600));
        p1.setBackground(Color.white);
        p1.setLayout(null);
		
		l1 = new JLabel("Hotline : 01888750***, ");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.black);
		l1.setBounds(50,20,200,25);
		p1.add(l1);

	   
        b1 = new JButton("NEXT");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b1.setForeground(Color.black);
        b1.setBounds(530,525,100,25);
        b1.addActionListener(this);
        p1.add(b1);
		
		b2 = new JButton("i");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.black);
        b2.setBounds(20,20,25,25);
        b2.addActionListener(this);
        p1.add(b2);
		
		


//		l1 = new JLabel(new ImageIcon(getClass().getResource("""C:\Users\munvo\OneDrive\Documents\project\Sanj's Cafe\Photos\images.jpeg""")));
//		l1.setBounds(0,0,650,600);
//		P1.add(l1);
		

        this.add(p1);
       
    }

    public void actionPerformed(ActionEvent ae)
    {
       

    }
	

}
	

