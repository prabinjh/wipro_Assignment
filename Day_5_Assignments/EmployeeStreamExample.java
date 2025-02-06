import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStreamExample {
    public static void main(String[] args) {
        // List of Employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 28, 50000),
            new Employee("Bob", 35, 75000),
            new Employee("Charlie", 40, 90000),
            new Employee("David", 25, 48000),
            new Employee("Emma", 32, 82000)
        );

        // Filter employees older than 30, collect their names, and compute average salary
        List<String> employeeNames = employees.stream()
            .filter(emp -> emp.getAge() > 30)   // Filter employees older than 30
            .map(Employee::getName)            // Extract names
            .collect(Collectors.toList());     // Collect names in a List

        double averageSalary = employees.stream()
            .filter(emp -> emp.getAge() > 30)  // Filter employees older than 30
            .mapToDouble(Employee::getSalary)  // Extract salaries as double
            .average()                         // Compute average salary
            .orElse(0.0);                      // Default to 0 if no matching employees

        // Output results
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average salary: $" + averageSalary);
    }
}
