package com.sanje.cafe_management.page.order;

import com.sanje.cafe_management.data.DummyData;
import com.sanje.cafe_management.data.FoodItem;
import com.sanje.cafe_management.page.PageLayout;
import com.sanje.cafe_management.service.CartService;
import com.sanje.cafe_management.utils.ComponentFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class OrderCartPage extends PageLayout {
    final CartService cartService = new CartService();
    public OrderCartPage() {
        super("Order Cart");

        final JPanel mainPanel = new JPanel();
        final String[] columns = new String[]{"Name", "Quantity", "Price"};
        final DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Index");
        tableModel.addColumn("Image");
        tableModel.addColumn("Title");
        tableModel.addColumn("Quantity");
        tableModel.addColumn("Price");
        int i = 1;
        for (final FoodItem item: cartService.getItems()) {
            tableModel.addRow(new Object[]{i++, item.getImage(), item.getTitle(), item.getQuantity(), item.getPrice() * item.getQuantity()});
        }

        tableModel.addRow(new Object[]{"", "", "", "", "Total: $" + cartService.getTotal()});
        final JTable orderCartItemsTable = new JTable(tableModel);
        orderCartItemsTable.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer(20));
        final JScrollPane scrollPane = new JScrollPane(orderCartItemsTable);

        final JButton confirmPaymentButton = new JButton("Confirm Payment");
        confirmPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigate(new OrderPaymentPage());
            }
        });

        mainPanel.add(scrollPane);
        mainPanel.add(confirmPaymentButton);
        launch(mainPanel);
    }

    private static class ImageRenderer extends DefaultTableCellRenderer {
        private int height;

        public ImageRenderer(final int height) {
            this.height = height;
        }

        @Override
        protected void setValue(Object value) {
            if (value instanceof ImageIcon) {
                setIcon((ImageIcon) value);
            } else if (value instanceof String) {
                try {
                    final ImageIcon icon = ComponentFactory.readImageIcon(value.toString());
                    final Image scaledImage = icon.getImage().getScaledInstance(-1, height, Image.SCALE_SMOOTH);
                    setIcon(new ImageIcon(scaledImage));

                } catch (IOException e) {
                    setText("");
                    System.out.println("Couldn't render image: " + value);
                }
            }
        }
    }
}
