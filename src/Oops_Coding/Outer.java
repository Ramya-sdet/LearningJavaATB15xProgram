package Oops_Coding;
/*Outer and Inner Class Implementation
Create a class "Outer" with an inner class "Inner".
 Access the inner class from the outer class and demonstrate their interaction.
Examples:
Input:
Outer class with variable x=10, Inner class accessing x
Output:
Outer class variable x: 10 Inner class accessing outer variable: 10
💡 Explanation:Inner classes have access to all members of the outer class,
including private members.
They are useful for helper classes.*/
// Define the outer class named Outer
public class Outer {
    // Private instance variable in the outer class
    private int x = 10;

    // Public method in the outer class to demonstrate interaction
    public void demonstrateInnerAccess() {
        System.out.println("Outer class variable x: " + x);

        // Create an instance of the inner class
        Inner innerInstance = new Inner();

        // Call a method of the inner class
        innerInstance.accessOuterVariable();
    }

    // Define the inner class named Inner
    public class Inner {

        // Method in the inner class to access outer class members
        public void accessOuterVariable() {
            // The inner class has direct access to the outer class's private members
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of the outer class
        Outer outerInstance = new Outer();

        // Call the method that orchestrates the interaction
        outerInstance.demonstrateInnerAccess();
    }
}
