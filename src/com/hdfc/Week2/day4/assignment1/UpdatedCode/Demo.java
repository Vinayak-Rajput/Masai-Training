package com.hdfc.week2.day4.assignment1.UpdatedCode;

import com.hdfc.week2.day4.assignment1.UpdatedCode.entitites.Customer;
import com.hdfc.week2.day4.assignment1.UpdatedCode.entitites.Item;
import com.hdfc.week2.day4.assignment1.UpdatedCode.entitites.Order;
import com.hdfc.week2.day4.assignment1.UpdatedCode.services.SaveService;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Item laptop = new Item("Laptop", 50000, 1);
        Item mouse = new Item("Mouse", 1000, 2);

        Customer customer = new Customer("PREMIUM",0.5);

        Order order = new Order(List.of(laptop, mouse),customer.getCustomerType());


        System.out.println("Order Validation Result: "+ order.orderValidation());

        SaveService saver =new SaveService();
        saver.save();

        System.out.println("Total Cost: " +order.calculateTotal(order,customer));

    }
}

