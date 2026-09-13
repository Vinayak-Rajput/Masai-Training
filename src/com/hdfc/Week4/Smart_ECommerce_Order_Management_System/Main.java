package com.hdfc.Week4.Smart_ECommerce_Order_Management_System;

import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.factory.ProductFactory;
import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Product> products = List.of(

                ProductFactory.createProduct(
                        "electronics",
                        1,
                        "Laptop",
                        75000
                ),

                ProductFactory.createProduct(
                        "electronics",
                        2,
                        "Mouse",
                        1500
                ),

                ProductFactory.createProduct(
                        "electronics",
                        3,
                        "Keyboard",
                        2500
                ),

                ProductFactory.createProduct(
                        "electronics",
                        4,
                        "Monitor",
                        18000
                ),

                ProductFactory.createProduct(
                        "stationary",
                        5,
                        "Java Book",
                        900
                ),

                ProductFactory.createProduct(
                        "stationary",
                        6,
                        "Spring Boot Book",
                        1200
                ),

                ProductFactory.createProduct(
                        "grocery",
                        7,
                        "Rice",
                        1000
                ),

                ProductFactory.createProduct(
                        "grocery",
                        8,
                        "Sugar",
                        500
                ),

                ProductFactory.createProduct(
                        "grocery",
                        9,
                        "Milk",
                        60
                ),

                ProductFactory.createProduct(
                        "grocery",
                        10,
                        "Oil",
                        250
                )
        );

        products.stream()
                .map(Product::getName)
                .forEach(System.out::println);


        products.stream()
                .filter(product ->
                        product.getPrice() > 5000)
                .forEach(System.out::println);

        double totalValue = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println(totalValue);

        Map<String, List<Product>> groupedProducts =products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));


        groupedProducts.forEach(
                (category, list) -> {

                    System.out.println(
                            category + " -> " + list
                    );
                }
        );

        Product expensiveProduct =products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElse(null);

        System.out.println(expensiveProduct);
    }

}
