package com.hdfc;

// import com.hdfc.beans.Employee;
import com.hdfc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//         Employee emp = context.getBean("emp1", Employee.class);
//         Employee emp1 = (Employee) context.getBean("emp1");
//
//         emp.display();
//         emp1.display();

        UserService userService = context.getBean("userService", UserService.class);

        userService.registerUser();
    }
}
