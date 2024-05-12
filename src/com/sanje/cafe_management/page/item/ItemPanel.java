package com.sanje.cafe_management.page.item;

import com.sanje.cafe_management.data.FoodItem;
import com.sanje.cafe_management.service.CartService;
import com.sanje.cafe_management.utils.ComponentFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemPanel extends JPanel {
    final CartService cartService = new CartService();
    public ItemPanel(final JFrame frame, final FoodItem item, final JLabel label) {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        final JLabel imageLabel = ComponentFactory.readImage(frame, item.getImage());
        final JLabel titleLabel = new JLabel(item.getTitle(), 0);
        final JLabel priceLabel = new JLabel(String.format("$%.2f", item.getPrice()), 0);
        final JButton orderButton = new JButton("Order");
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartService.addToCart(item);
                label.setText("Total: $" + String.valueOf(cartService.getTotal()));
            }
        });

        this.setLayout(new BorderLayout());

        assert imageLabel != null;

        this.add(imageLabel, "North");
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(titleLabel);
        bottomPanel.add(priceLabel);
        bottomPanel.add(orderButton);
        this.add(bottomPanel, "South");
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension size = this.getSize();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawRoundRect(0, 0, size.width - 1, size.height - 1, 20, 20);
    }
}
