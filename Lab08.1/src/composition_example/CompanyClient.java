package composition_example;

public class CompanyClient {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Joe", 70000, new Address("San Diego", "US"));
        Employee emp2 = new Employee("Chris", 80000, new Address("Philadelphia", "US"));
        //Employee[] employees = new Employee[]{emp1, emp2};

        Company company = new Company("Amazon", new Employee[10]);
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        double totalSalary = company.computeTotalSalaryOfAllEmployees();
        System.out.print("Total salary: " + totalSalary);

    }

}
