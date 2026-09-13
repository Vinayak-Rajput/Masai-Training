package com.hdfc;

import com.hdfc.beans.Employee;
import com.hdfc.config.AppConfig;

import com.hdfc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = applicationContext.getBean(Employee.class);

        System.out.println(employee);

        System.out.println(applicationContext.getBean("List"));

        System.out.println(employee.getList());

        ((AnnotationConfigApplicationContext) applicationContext).close();


    }
}
