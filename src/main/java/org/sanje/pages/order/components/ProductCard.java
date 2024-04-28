package org.sanje.pages.order.components;

import org.sanje.entity.Product;
import org.sanje.factory.ComponentFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ProductCard extends JPanel {
    public ProductCard(final Product product) {
        super(new BorderLayout());

        JLabel imageLabel = ComponentFactory.generateImage(new ImageIcon(Objects.requireNonNull(getClass().getResource(product.getImage()))));
        add(imageLabel);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel titleLabel = new JLabel(product.getName());
        JLabel priceLabel = new JLabel("৳" + String.format("%.2f", product.getPrice()));

        infoPanel.add(titleLabel);
        infoPanel.add(priceLabel);

        JButton orderButton = new JButton("Order");
        add(infoPanel, BorderLayout.CENTER);
        add(orderButton, BorderLayout.SOUTH);
    }
}
