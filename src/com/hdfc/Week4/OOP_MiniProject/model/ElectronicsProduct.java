package com.hdfc.Week4.OOP_MiniProject.model;

public class ElectronicsProduct extends Product {

    public ElectronicsProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getCategory() {
        return "ELECTRONICS";
    }
}
