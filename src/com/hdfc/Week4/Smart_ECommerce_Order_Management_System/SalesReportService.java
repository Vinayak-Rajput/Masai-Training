package com.hdfc.Week4.Smart_ECommerce_Order_Management_System;

import com.hdfc.Week4.Smart_ECommerce_Order_Management_System.model.Order;

import java.util.List;

public class SalesReportService {

    public static void generateReport(
            List<Order> orders) {

        double revenue =

                orders.stream()
                        .mapToDouble(
                                Order::calculateFinalAmount
                        )
                        .sum();

        double highest =

                orders.stream()
                        .mapToDouble(
                                Order::calculateFinalAmount
                        )
                        .max()
                        .orElse(0);

        double average =

                orders.stream()
                        .mapToDouble(
                                Order::calculateFinalAmount
                        )
                        .average()
                        .orElse(0);

        System.out.println(
                "\n===== SALES REPORT =====");

        System.out.println(
                "Total Orders : "
                        + orders.size());

        System.out.println(
                "Revenue : Rs:"
                        + revenue);

        System.out.println(
                "Highest Order : Rs:"
                        + highest);

        System.out.println(
                "Average Order : Rs:"
                        + average);
    }
}