package com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model;

public class OrderItem {

    private Product product;
    private int quantity;

    public OrderItem(Product product,
                     int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {

        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {

        return product.getName() +
                " * " +
                quantity +
                " = Rs: " +
                getTotalPrice();
    }
}
