package com.hdfc.week2.day4.assignment1.LegacyCode;

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
}
