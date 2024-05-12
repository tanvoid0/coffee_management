package com.sanje.cafe_management.page.item;

import com.sanje.cafe_management.data.AppConfig;
import com.sanje.cafe_management.data.DummyData;
import com.sanje.cafe_management.data.FoodItem;
import com.sanje.cafe_management.page.PageLayout;
import com.sanje.cafe_management.page.PaymentPage;
import com.sanje.cafe_management.page.order.OrderCartPage;
import com.sanje.cafe_management.service.CartService;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ItemViewerPage extends PageLayout {
    final List<String> tabs = List.of("Drinks", "Coffee", "Desert", "Food");
    final CartService cartService = new CartService();

    public ItemViewerPage() {
        super(AppConfig.title);
        final JTabbedPane tabbedPane = new JTabbedPane();

        JLabel totalAmountLabel = new JLabel("Total: $" + cartService.getTotal());
        tabbedPane.addTab("Drinks", new ItemGridViewer(this, DummyData.drinks, totalAmountLabel));
        tabbedPane.addTab("Coffee", new ItemGridViewer(this, DummyData.coffees, totalAmountLabel));
        tabbedPane.addTab("Desert", new ItemGridViewer(this, DummyData.drinks, totalAmountLabel));
        tabbedPane.addTab("Food", new ItemGridViewer(this, DummyData.drinks, totalAmountLabel));

        final JPanel labelButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        labelButtonPanel.add(totalAmountLabel);
        final JButton goToCartButton = new JButton("Go to cart");
        labelButtonPanel.add(goToCartButton);

        goToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigate(new OrderCartPage());
            }
        });

        final JPanel panel = new JPanel(new BorderLayout());
        panel.add(tabbedPane, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(labelButtonPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }
}
