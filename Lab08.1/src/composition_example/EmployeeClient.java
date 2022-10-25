package composition_example;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Joe", 1000000);
        emp1.setAddress(new Address("San Diego", "US"));
        System.out.println(emp1.getEmployeeInfo());

    }
}
