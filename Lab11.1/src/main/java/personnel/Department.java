/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package personnel;

import java.util.ArrayList;
import java.util.List;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    static private List<Employee> employees = new ArrayList<>();
    //private Employee[] employees;
    //private Employee[] employees = new Employee[100];
    //private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department(String name, String location, List<Employee> employees) {
        setName(name);
        setLocation(location);
        this.employees = employees;
    }

    public void payEmployees() {
        for (Employee employee : employees) {
            employee.pay();
        }
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee employee : employees) {
            System.out.println(employee.toString());  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}