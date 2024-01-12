package employeeApp;

import enums.Plan;
import model.Employee;
import model.Healthplan;
import model.Company;

public class Main {
    public static void main(String[] args) {
        performOperations();
    }

    public static void performOperations() {
        // Create objects for each class
        Healthplan healthplan = new Healthplan(1, "HealthPlan1", Plan.BASIC);
        Employee employee = new Employee(101, "John Doe", "john@example.com", "password123", Plan.PREMIUM);
        Company company = new Company(1111, "X Company", 50000);

        employee.addHealthplan(0, "Basic Health");
        employee.addHealthplan(1, "Standart Health");
        employee.addHealthplan(2, "Premium Health");

        company.addEmployee(0, "Developer1");
        company.addEmployee(1, "Developer2");
        company.addEmployee(2, "Developer3");
        company.addEmployee(3, "Developer4");
        company.addEmployee(4, "Developer5");



        System.out.println(healthplan);
        System.out.println(employee);
        System.out.println(company);
    }
}