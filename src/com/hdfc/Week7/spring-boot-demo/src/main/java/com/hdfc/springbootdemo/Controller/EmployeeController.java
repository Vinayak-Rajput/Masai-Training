package com.hdfc.springbootdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/hello")
    public static String helloworld() {
        return "Hello World!";
    }

}
