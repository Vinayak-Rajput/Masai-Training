package com.hdfc.factory;

import com.hdfc.model.BookProduct;
import com.hdfc.model.ElectronicsProduct;
import com.hdfc.model.GroceryProduct;
import com.hdfc.model.Product;

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