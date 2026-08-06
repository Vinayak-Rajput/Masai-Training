package com.hdfc.week2.day4.assignment1.LegacyCode;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Item laptop = new Item("Laptop", 50000, 1);
        Item mouse = new Item("Mouse", 1000, 2);

        Order order = new Order(List.of(laptop, mouse),"PREMIUM");

        OrderService service = new OrderService();
        service.processOrder(order);
    }
}