package composition_example;

import java.util.Arrays;

public class Company {
    private String companyName;
    private Employee[] employees = new Employee[100];

    private int currentIndex = 0;
    private Employee employee = new Employee();

    public Company(String companyName) {
        setCompanyName(companyName);
    }

    public Company(String companyName, Employee[] employees) {
        this(companyName);
        setEmployees(employees);
    }

    public void addEmployee(Employee employee) {
    employees[currentIndex] = employee;
            currentIndex++;
    }

    public double computeTotalSalaryOfAllEmployees(){
        double totalSalary = 0.0;
        for(int i = 0; i < currentIndex; i++) {
            if (employees[i] != null) {
                totalSalary = employees[i].getSalary();
            }
        }
//        for(Employee employee : employees) {
//            if (employee != null) {
//                totalSalary += employee.getSalary();
//            }
//        }
        return totalSalary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company: " +
                "companyName='" + companyName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
