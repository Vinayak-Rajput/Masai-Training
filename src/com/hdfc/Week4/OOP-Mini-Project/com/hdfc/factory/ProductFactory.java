package com.hdfc.factory;

import com.hdfc.exceptions.ProductNotFoundException;
import com.hdfc.model.BookProduct;
import com.hdfc.model.ElectronicsProduct;
import com.hdfc.model.GroceryProduct;
import com.hdfc.model.Product;

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
