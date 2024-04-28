package org.sanje;

import org.sanje.entity.Product;
import org.sanje.entity.User;
import org.sanje.pages.HomePage;
import org.sanje.pages.order.OrderPage;
import org.sanje.utils.DummyData;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CafeManagementApp
{
	public static void main(String [] args)
	{
		JFrame l1 = new HomePage();
		l1.setVisible(true);
	}
}