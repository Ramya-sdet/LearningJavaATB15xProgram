package Oops_Coding;
/*Create interfaces "Flyable" and "Swimmable" with appropriate methods. Implement both in a "Duck" class.

Examples:
Input:
Create Duck object and call fly() and swim() methods
Output:
Duck is flying in the sky! Duck is swimming in the water!
💡 Explanation:Java supports multiple interface implementation,
allowing a class to implement multiple contracts.*/
// Define the Flyable interface
interface Flyable {
    void fly();
}

// Define the Swimmable interface
interface Swimmable {
    void swim();
}

// Implement both interfaces in the Duck class
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}

// Main class to run the example
public class InterfaceExample {
    public static void main(String[] args) {
        // Create Duck object
        Duck myDuck = new Duck();

        // Call the fly() and swim() methods
        myDuck.fly();
        myDuck.swim();
    }
}
