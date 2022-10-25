package composition_example;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String name;
    private double salary;
    private Address address;

    public Employee() {
    }

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public Employee(String name, double salary, Address address) {
        this(name, salary);
        setAddress(address);
    }

    public String getEmployeeInfo() {
        String employeeInfo =
                "Name= " + name +
                " Salary= " + salary +
                " Address= " + address.getAddressInfo();
        return employeeInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address;
    }
}
