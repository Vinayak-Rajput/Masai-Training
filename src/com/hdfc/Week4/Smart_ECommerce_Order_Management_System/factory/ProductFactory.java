package com.hdfc.Week4.Smart_ECommerce_Order_Management_System.factory;

import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.BookProduct;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.ElectronicsProduct;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.GroceryProduct;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.Product;

public class ProductFactory {

    public static Product createProduct(
            String type,
            int id,
            String name,
            double price) {

        switch (type.toUpperCase()) {

            case "ELECTRONICS":
                return new ElectronicsProduct(
                        id,
                        name,
                        price);

            case "BOOK":
                return new BookProduct(
                        id,
                        name,
                        price);

            case "GROCERY":
                return new GroceryProduct(
                        id,
                        name,
                        price);

            default:
                throw new IllegalArgumentException(
                        "Invalid Product Type");
        }
    }
}