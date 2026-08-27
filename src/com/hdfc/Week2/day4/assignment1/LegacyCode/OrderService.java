package com.hdfc.week2.day4.assignment1.LegacyCode;

class OrderService {

    public void processOrder(Order order) {

        // Validate Order
        if (order.getItems().isEmpty()) {
            throw new RuntimeException("Order is empty");
        }

        // Calculate Total
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        // Apply Discount
        if (order.getCustomerType().equals("PREMIUM")) {
            total = total * 0.9;
        }

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
