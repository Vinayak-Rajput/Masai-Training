package com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model;

import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.strategy.DiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private Customer customer;
    private String shippingAddress;
    private String paymentMode;
    private String couponCode;
    private boolean giftWrap;
    private DiscountStrategy strategy;

    private List<OrderItem> items;

    // Private Constructor
    private Order(OrderBuilder builder) {

        this.orderId = builder.orderId;
        this.customer = builder.customer;
        this.shippingAddress = builder.shippingAddress;
        this.paymentMode = builder.paymentMode;
        this.couponCode = builder.couponCode;
        this.giftWrap = builder.giftWrap;
        this.items = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public void addItem(OrderItem item) {

        items.add(item);
    }

    @Override
    public String toString() {

        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", giftWrap=" + giftWrap +
                '}';
    }
    public void printSummary() {

        System.out.println("ORDER SUMMARY");

        System.out.println("Order Id : "+ orderId);

        System.out.println("Customer : "+ customer.getCustomerName());

        System.out.println("Items:");

        for(OrderItem item : items){

            System.out.println(item);
        }

        System.out.println("Total : Rs: " + calculateTotal());

        System.out.println("Final Amount : Rs: " + calculateFinalAmount());
    }

    public double calculateFinalAmount() {

        double total = calculateTotal();

        if(strategy == null) {
            return total;
        }

        return strategy
                .applyDiscount(total);
    }
    public double calculateTotal() {

        double total = 0;

        for (OrderItem item : items) {

            total += item.getTotalPrice();
        }

        return total;
    }
    public List<OrderItem> getItems() {
        return items;
    }

    // ===========================
    // INNER STATIC BUILDER CLASS
    // ===========================

    public static class OrderBuilder {

        // Required Fields
        private int orderId;
        private Customer customer;

        // Optional Fields
        private String shippingAddress;
        private String paymentMode;
        private String couponCode;
        private boolean giftWrap;

        public OrderBuilder orderId(int orderId) {

            this.orderId = orderId;
            return this;
        }

        public OrderBuilder customer(Customer customer) {

            this.customer = customer;
            return this;
        }

        public OrderBuilder shippingAddress(
                String shippingAddress) {

            this.shippingAddress = shippingAddress;
            return this;
        }

        public OrderBuilder paymentMode(
                String paymentMode) {

            this.paymentMode = paymentMode;
            return this;
        }

        public OrderBuilder couponCode(
                String couponCode) {

            this.couponCode = couponCode;
            return this;
        }

        public OrderBuilder giftWrap(
                boolean giftWrap) {

            this.giftWrap = giftWrap;
            return this;
        }

        public Order build() {

            if (orderId <= 0) {
                throw new IllegalStateException(
                        "Invalid Order Id");
            }

            if (customer == null) {
                throw new IllegalStateException(
                        "Customer is required");
            }

            return new Order(this);
        }
    }
}
