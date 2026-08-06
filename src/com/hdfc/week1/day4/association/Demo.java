package com.hdfc.week1.day4.association;

public class Demo {
    static void main(){
        Employee emp1 =new Employee();

        System.out.println("Employee Details\n");

        emp1.setEmpId("101");
        emp1.setEmpName("Vinayak");
        emp1.setSalary(30000);

        Address address1 = new Address();

        address1.setState("UP");
        address1.setCity("Bareilly");
        address1.setPinCode("243005");

        emp1.setAddress(address1);

        emp1.displayEmployeeDetails();

        System.out.println();

        Employee emp2 =new Employee();

        emp2.setEmpId("102");
        emp2.setEmpName("Ravi");
        emp2.setSalary(40000);

        Address address2 = new Address();

        address2.setState("Karnataka");
        address2.setCity("Bangalore");
        address2.setPinCode("563004");

        emp2.setAddress(address2);

        emp2.displayEmployeeDetails();
    }
}
