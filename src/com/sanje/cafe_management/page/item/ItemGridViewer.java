package com.sanje.cafe_management.page.item;

import com.sanje.cafe_management.data.AppConfig;
import com.sanje.cafe_management.data.DummyData;
import com.sanje.cafe_management.data.FoodItem;
import com.sanje.cafe_management.page.PaymentPage;
import com.sanje.cafe_management.service.CartService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ItemGridViewer extends JPanel {
    final CartService cartService = new CartService();
    public ItemGridViewer(final JFrame frame, final List<FoodItem> items, final JLabel label) {
        setLayout(new BorderLayout());
        final JScrollPane gridPanel;
        gridPanel = this.createScrollableGridLayout(frame, items, label);
        add(gridPanel, BorderLayout.CENTER);
    }

    private JScrollPane createScrollableGridLayout(final JFrame frame, final List<FoodItem> items, final JLabel label) {
        JPanel gridPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        gridPanel.setBackground(Color.white);

        for (FoodItem item : items) {
            gridPanel.add(new ItemPanel(frame, item, label));
        }

        JScrollPane scrollPane = new JScrollPane(gridPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(AppConfig.width, AppConfig.height));
        return scrollPane;
    }
}
