package personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    public static final double HOURLY_STANDARD_DEDUCTION = .10;
    private double rate;
    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    @Override
    public void pay() {
        System.out.println(this.getName() + " is paid hourly " + payCheck());
    }

    @Override
    public double getStandardDeduction() {
        return calculateDeduction();
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + "paid taxes of " + payCheck() * HOURLY_TAX_RATE);

    }

    public double calculateDeduction() {
        double deduction = payCheck() * HOURLY_STANDARD_DEDUCTION;
        return deduction;
    }

    public double payCheck() {
        double pay = (getHours() * getRate());
            return pay;
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
        return super.toString() +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

}
