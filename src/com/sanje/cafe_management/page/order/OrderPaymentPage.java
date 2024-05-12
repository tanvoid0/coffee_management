package com.sanje.cafe_management.page.order;

import com.sanje.cafe_management.page.HomePage;
import com.sanje.cafe_management.page.PageLayout;
import com.sanje.cafe_management.page.item.ItemViewerPage;
import com.sanje.cafe_management.service.CartService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderPaymentPage extends PageLayout {
    final CartService cartService = new CartService();
    public OrderPaymentPage() {
        super("Order Payment");
        final JPanel mainPanel = new JPanel(new GridLayout(5, 2));

        JLabel cardNumberLabel = new JLabel("Card Number:");
        final JTextField cardNumberField = new JTextField();
        mainPanel.add(cardNumberLabel);
        mainPanel.add(cardNumberField);

        JLabel cvvLabel = new JLabel("CVV:");
        final JTextField cvvField = new JPasswordField();
        mainPanel.add(cvvLabel);
        mainPanel.add(cvvField);

        JLabel expiryDateLabel = new JLabel("Expiry Date:");
        final JTextField expiryDateField = new JTextField();
        mainPanel.add(expiryDateLabel);
        mainPanel.add(expiryDateField);

        JLabel amountLabel = new JLabel("Amount:");
        final JTextField amountField = new JTextField();
        mainPanel.add(amountLabel);
        mainPanel.add(amountField);

        JButton payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mock payment confirmation
                cartService.pay();
                JOptionPane.showMessageDialog(OrderPaymentPage.this, "Payment Successful!");
                navigate(new ItemViewerPage());
            }
        });
        mainPanel.add(new JLabel()); // Empty label for alignment
        mainPanel.add(payButton);

        launch(mainPanel);
    }
}
