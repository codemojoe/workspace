package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    public static final double SALARY_STANDARD_DEDUCTION = .15;
    private double salary;

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + "paid taxes of " + getSalary() * SALARIED_TAX_RATE);

    }

    @Override
    public double getStandardDeduction() {
        return calculateDeduction();
    }

    public double calculateDeduction() {
        double deduction = getSalary() * SALARY_STANDARD_DEDUCTION;
        return deduction;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary +
                '}';
    }

}
