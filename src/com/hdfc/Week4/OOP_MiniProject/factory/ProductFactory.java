package com.hdfc.Week4.OOP_MiniProject.factory;

import com.hdfc.Week4.OOP_MiniProject.exceptions.ProductNotFoundException;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.BookProduct;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.ElectronicsProduct;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.GroceryProduct;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.Product;

public class ProductFactory {

    public static Product createProduct(String productCategory, int id, String name, double price ){

        Product product;

        switch(productCategory.toUpperCase()){

            case "BOOKS": {
                product = new BookProduct(id, name, price);
                break;
            }

            case "ELECTRONICS": {
                product = new ElectronicsProduct(id, name, price);
                break;
            }

            case "GROCERY": {
                product = new GroceryProduct(id, name, price);
                break;
            }

            default:

                product = null;
                try {

                    throw new ProductNotFoundException("Invalid Product Type Passed");

                } catch(RuntimeException e){

                    System.out.println("Exception: "+e.getMessage());

                }
        }

        return product;
    }
}
