package com.hdfc.beans;

import com.hdfc.service.NotificationService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Employee {

    @Value("${employee.name}")
    private String name;

    @Value("${employee.salary}")
    private double salary;

    private NotificationService notificationService;

    @PostConstruct
    public void init() {
        System.out.println("Initialization Logic.");
    }

    @Autowired
    Employee(NotificationService notificationService) {
        this.notificationService =notificationService;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", notificationService=" + notificationService +
                '}';
    }

    @PreDestroy
    public void finalExec(){
        System.out.println("Marked for Destruction.");
    }

    @Autowired
    @Qualifier("List")
    private List<String> cities;

    public List<String> getList() {
        return cities;
    }
}
