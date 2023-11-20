package week7.Employee;

import java.util.*;
import java.util.stream.*;

record Employee(int id, String name, double salary) {}

class EmployeeManagementSystem {
    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        return employees.stream()
                .filter(employee -> employee.salary() >= minSalary)
                .collect(Collectors.toList());
    }

    public double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee));
    }
}
