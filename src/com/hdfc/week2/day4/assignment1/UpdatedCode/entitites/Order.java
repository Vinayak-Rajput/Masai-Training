package com.hdfc.week2.day4.assignment1.UpdatedCode.entitites;

import java.util.List;

public class Order {

    private List<Item> items;
    private String customerType;

    public Order(List<Item> items, String customerType) {
        this.items = items;
        this.customerType = customerType;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getCustomerType() {
        return customerType;
    }

    public boolean orderValidation(){

        if (this.getItems().isEmpty()) {
            System.out.println("Order Cart is Empty, Please add");
            return false;
        }

        System.out.println("Order Validated...");
        return true;
    }

    public double calculateTotal(Order order, Customer customer){

        double total =0;
        for(Item item: order.getItems()){
            total += item.getPrice() * item.getQuantity();
        }

        return total * customer.getDiscountRate();
    }
}

