/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package client;

import personnel.Department;
import personnel.Employee;
import personnel.HourlyEmployee;
import personnel.SalariedEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        List<Employee> employees = new ArrayList<>();
        Department dept = new Department("Sales", "Seattle", employees);
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 100000));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 53,40));
        dept.addEmployee(new SalariedEmployee("Joe", LocalDate.of(2022, 10, 10), 200000.0));
        dept.addEmployee(new HourlyEmployee("Chris", LocalDate.of(2022, 10, 10), 40, 40));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //
        System.out.println("\nPay employees:");
        dept.payEmployees();
    }
}