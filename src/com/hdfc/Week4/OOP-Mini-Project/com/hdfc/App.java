package com.hdfc;

import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.factory.ProductFactory;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.Product;

import java.util.Arrays;
import java.util.List;

public class App {

    static void main() {

        List<Product> products = Arrays.asList(
                ProductFactory.createProduct("BOOKS",101,"A Tale of Two Kingdoms",540),
                ProductFactory.createProduct("ELECTRONICS",102,"Washing Machine", 20000),
                ProductFactory.createProduct("grocery",103, "Veggies", 400),
                ProductFactory.createProduct("books",104,"Game of Thrones", 1050),
                ProductFactory.createProduct("electronics",105,"AC",25000),
                ProductFactory.createProduct("grocery",106,"Pasta",240));

        products.forEach(System.out::println);

        Product product = ProductFactory.createProduct("Iron",110,"Free Tales",400);

        // OrderItem item = new OrderItem()




    }
}
