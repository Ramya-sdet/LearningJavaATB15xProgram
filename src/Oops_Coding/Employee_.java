package Oops_Coding;
/*Employee Encapsulation
Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.

Examples:
Input:
Employee with id=1, name="John Doe", salary=50000
Output:
Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
💡 Explanation:Create private instance variables and provide public getter/setter methods to access and modify them safely.
*/
public abstract class Employee_ {
    // Private attributes (Encapsulation)
    private int id;
    private String name;
    private double salary;

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Creating object and using setters
        Employee_ emp = new Employee_() {
            @Override
            public double calculateSalary() {
                return getSalary();
            }
        };
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000.0);

        // Accessing data using getters
        System.out.println("Employee ID: " + emp.getId() +
                " Employee Name: " + emp.getName() +
                " Employee Salary: " + emp.getSalary());
    }

    // Override the abstract method to calculate manager's salary
    public abstract double calculateSalary();
}
