package com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model;

public class ElectronicsProduct extends Product {
    public ElectronicsProduct(
            int id,
            String name,
            double price) {

        super(id, name, price);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
