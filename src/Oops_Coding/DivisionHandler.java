package Oops_Coding;
/*Multi-Exception Handling
Implement exception handling for a program that divides two numbers and catches ArithmeticException,
NumberFormatException, and ArrayIndexOutOfBoundsException.
Examples:
Input:
Division by zero, invalid number format, array index out of bounds
Output:
ArithmeticException: Cannot divide by zero NumberFormatException:
Invalid number format ArrayIndexOutOfBoundsException: Array index out of bounds
💡 Explanation:Multiple catch blocks can handle different types of exceptions that might occur in a try block.*/
import java.util.Scanner;

public class DivisionHandler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // --- 1. Potential NumberFormatException ---
            System.out.print("Enter numerator (integer): ");
            // If the user enters a non-integer string, a NumberFormatException is thrown
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter denominator (integer): ");
            // If the user enters a non-integer string, a NumberFormatException is thrown
            int denominator = Integer.parseInt(scanner.nextLine());

            // --- 2. Potential ArithmeticException ---
            // If the denominator is 0, an ArithmeticException is thrown
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int result = numerator / denominator;
            System.out.println("Result of division: " + numerator + " / " + denominator + " = " + result);

            // --- 3. Potential ArrayIndexOutOfBoundsException ---
            int[] numbers = {1, 2, 3};
            // If we try to access index 5, an ArrayIndexOutOfBoundsException is thrown
            System.out.println("Accessing array element at index 5: " + numbers[5]);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // A general catch block to handle any other unforeseen exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block is executed regardless of whether an exception was caught or not
            System.out.println("Operation finished.");
            scanner.close();
        }
    }
}
