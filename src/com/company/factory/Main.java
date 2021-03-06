package com.company.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the Employee type: ");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        System.out.println("Enter the Employee name: ");
        String name = scanner.next();

        System.out.println("Enter the hours worked: ");
        int hoursWorked = scanner.nextInt();

        System.out.println("Enter the rate");
        double rate = scanner.nextDouble();

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getInstance(type, name ,hoursWorked, rate);

        System.out.println("Salary of employee is :" + employee.calsSalary());
    }
}
