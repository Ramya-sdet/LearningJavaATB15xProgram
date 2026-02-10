package Oops_Coding;
/*Calculator Method Overloading
Write a program to demonstrate method overloading by creating
multiple "add" methods with different parameters.
Examples:
Input:
add(5, 3), add(2.5, 3.7), add(1, 2, 3)
Output:
Integer addition: 8 Double addition: 6.2 Three integers addition: 6
💡 Explanation:Method overloading allows multiple methods with the same name
but different parameter lists in the same class.*/
class Adder {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Adder obj = new Adder();

        // Demonstrating overloaded methods
        System.out.println("Integer addition: " + obj.add(5, 3));
        System.out.println("Double addition: " + obj.add(2.5, 3.7));
        System.out.println("Three integers addition: " + obj.add(1, 2, 3));
    }
}
