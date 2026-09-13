package com.hdfc.model;

import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.strategy.DiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private Customer customer;
    private List<OrderItem> items;

    DiscountStrategy discountStrategy;

    public Order(int orderId, Customer customer){
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void setStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalAmount(){

        double total = calculateTotal();

        if(discountStrategy == null)
            return total;


        return discountStrategy.applyDiscount(total);
    }

    public void addItem(OrderItem orderItem){
        items.add(orderItem);
    }

    public double calculateTotal(){
        return items.stream().map(OrderItem::getTotalPrice).reduce(0.0, Double::sum);
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void printSummary(){

        System.out.println("ORDER SUMMARY");

        System.out.println("Order ID: " + orderId);

        System.out.println("Customer: " + customer.getCustomerName());

        System.out.println("Items: ");

        items.forEach(System.out::println);

        System.out.println("Total Amount: " + calculateTotal());

        System.out.println("Discounted Amount: " + calculateFinalAmount());

    }

    public static class OrderBuilder {

        private int orderId;
        private Customer customer;
        private List<OrderItem> orderItems;

        private DiscountStrategy discountStrategy;

        public OrderBuilder(int orderId, Customer customer) {
            this.orderId = orderId;
            this.customer = customer;
            this.orderItems = new ArrayList<>();
        }

        public OrderBuilder addItem(OrderItem orderItem){
            orderItems.add(orderItem);
            return this;
        }

        public OrderBuilder addStrategy(DiscountStrategy discountStrategy){
            this.discountStrategy = discountStrategy;
            return this;
        }

        public com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.Order build(){
            return new com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.Order(this);
        }


    }

}
