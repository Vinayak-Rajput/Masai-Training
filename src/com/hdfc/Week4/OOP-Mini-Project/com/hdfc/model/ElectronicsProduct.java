package com.hdfc.model;

public class ElectronicsProduct extends Product {

    public ElectronicsProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getCategory() {
        return "ELECTRONICS";
    }
}
