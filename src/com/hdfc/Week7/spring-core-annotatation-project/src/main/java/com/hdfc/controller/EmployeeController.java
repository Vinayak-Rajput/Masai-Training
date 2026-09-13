package com.hdfc.controller;

import com.hdfc.beans.Employee;
import com.hdfc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {

        return service.getAllEmployees();
    }
}
