package Oops_Coding;
/* Employee Hierarchy with Salary Calculation
Create an Employee base class and Manager, Developer subclasses.
Each should have different salary calculation methods.
Examples:
Input:
Manager with base salary 60000 and bonus 10000, Developer with hourly rate 50 and 160 hours
Output:
Manager Salary: 70000.0 Developer Salary: 8000.0
💡 Explanation:Implement inheritance with specialized behavior in subclasses for different salary
calculation logic.*/
// Base class for all employees
abstract class Employees {
    // Abstract method to calculate salary, must be implemented by subclasses
    public abstract double calculateSalary();
}

// Manager subclass with a specific salary structure
class Manager extends Employees {
    private double baseSalary;
    private double bonus;

    // Constructor to initialize manager details
    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Override the abstract method to calculate manager's salary
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Developer subclass with a specific salary structure
class Developer extends Employees {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize developer details
    public Developer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override the abstract method to calculate developer's salary
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to demonstrate the hierarchy and salary calculations
public class CompanyHierarchyDemo {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager(60000, 10000);
        Developer developer = new Developer(50, 160);

        // Calculate and print salaries
        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}
