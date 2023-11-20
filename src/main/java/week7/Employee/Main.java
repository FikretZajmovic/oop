package week7.Employee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate the EmployeeManagementSystem
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 60000),
                new Employee(3, "Charlie", 70000)
        );

        // Filter employees with a minimum salary of 55000
        List<Employee> filteredEmployees = ems.filterEmployeesBySalary(employees, 55000);
        System.out.println("Filtered employees: " + filteredEmployees);

        // Calculate the total salary of all employees
        double totalSalary = ems.calculateTotalSalary(employees);
        System.out.println("Total salary: " + totalSalary);

        // Print the details of each employee
        System.out.println("Employee details:");
        ems.displayEmployeeDetails(employees);
    }
}
