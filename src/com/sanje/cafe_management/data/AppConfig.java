package com.sanje.cafe_management.data;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public final class AppConfig {

    public static String title = "CoffeeShop";

    public static int x=0;
    public static int y=0;
    public static int height = 600;
    public static int width = 1000;

    // Paddings & Margins
    public static Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);


    // Label configs
    public static Font labelFont = new Font("Serif", Font.BOLD, 30);
    public static Color textColor = Color.black;

    public static Font buttonFont= new Font("Comic Sans MS",Font.BOLD,20);
    public static Dimension textFieldDimension = new Dimension(300, 50);
    public static Dimension productImageDimension = new Dimension(1200, 700);

    public static String backgroundImage = "/images/background.png";
	public static String loginBackgroundImage = "/images/loginBackground.jpg";
	public static String registerBackgroundImage = "/images/registerBackground.jpg";
}
