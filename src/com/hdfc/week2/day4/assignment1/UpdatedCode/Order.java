/*(package com.hdfc.week2.day4.assignment1.UpdatedCode;

import com.hdfc.week2.day4.assignment1.LegacyCode.Item;

import java.util.List;

public class Order {

    private List<Item> items;
    private Customer customerType;

    public Order(List<Item> items, Customer customerType) {
        this.items = items;
        this.customerType = customerType;
    }

    public List<Item> getItems() {
        return items;
    }

    public Customer getCustomerType() {
        return customerType;
    }

    public boolean validateOrder(Order order){
        if (order.getItems().isEmpty()) {

            System.out.println("No Items are in cart.");
            return false;
        }
        return true;
    }

    public double calculateTotal(Order order,Customer customer){
        double total = 0;

        for(Item item: order.getItems()){
            total += item.getPrice() + item.getQuantity();
        }

        return total * customer.getDiscountRate(); //Customer types Premium, ....
    }

    public void processOrder(com.hdfc.week2.day4.assignment1.LegacyCode.Order order) {



        // Connecting with the DB
        System.out.println("Connecting with the DB Server");

        // Save Order
        System.out.println("Saving order into database...");

        // Send Email
        System.out.println("Sending confirmation email...");

        // Generate Report
        System.out.println("Generating order report...");
    }
}
*/