package Oops_Coding;
/* Custom Exception Implementation
Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.

Examples:
Input:
validateAge(15) and validateAge(25)
Output:
InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25
💡 Explanation:Custom exceptions extend Exception class and can carry specific error information relevant.*/
// Custom exception class extending the standard Exception class
class InvalidAgeException extends Exception {
    /**
     * Constructs an InvalidAgeException with a custom error message
     * that includes the invalid age provided.
     * @param age The age that was less than 18.
     */
    public InvalidAgeException(int age) {
        super("Age must be 18 or above. Provided age: " + age);
    }
}

public class AgeValidator {

    /**
     * Validates if the given age is 18 or above.
     * @param age The age to check.
     * @throws InvalidAgeException if the age is less than 18.
     */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw the custom exception with the specific invalid age
            throw new InvalidAgeException(age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        // Example 1: Input age is invalid (15)
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            // Catch and print the exception message
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        System.out.println("-------------------------------------------------");

        // Example 2: Input age is valid (25)
        try {
            validateAge(25);
        } catch (InvalidAgeException e) {
            // This block will not be executed as the age is valid
            System.out.println(e.getMessage());
        }
    }
}
