package com.hdfc.Week4.OOP_MiniProject.model;

public class OrderItem {

    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "OrderItem -" +
                "product =" + product.getName() +
                ", quantity =" + quantity;
    }
}
