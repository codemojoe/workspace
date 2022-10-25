package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    @Override
    public void pay() {
        System.out.println(this.getName() + " is paid hourly " + (getHours() * getRate() / 40));
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name=" + getName() +
                ", date hired=" + getHireDate() +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
