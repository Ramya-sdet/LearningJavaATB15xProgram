package Oops_Coding;
/*
* Person Class Implementation
Create a class "Person" with attributes "name" and "age". Create two instances and print their details.

Examples:
Input:
Create Person objects with names "John" (25) and "Alice" (30)
Output:
Name: John, Age: 25 Name: Alice, Age: 30
💡 Explanation:Create a Person class with constructor parameters for name and age, then create two instances and call a display method for each.
*/
public class Person {
    // Attributes (instance variables)
    String name;
    int age;

    // Constructor to initialize the attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method where the instances are created and details printed
    public static void main(String[] args) {
        // Create the first instance of the Person class
        Person person1 = new Person("John", 25);

        // Create the second instance of the Person class
        Person person2 = new Person("Alice", 30);

        // Print the details of both instances
        person1.displayDetails();
        person2.displayDetails();
    }
}
