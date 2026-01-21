package java_All_Programs;

public class StringImmutabilityTest {
    public static void main(String[] args) {
        String str = "Hello";

        // Attempt to change the string
        str.concat(", World!");

        // Original string remains unchanged
        System.out.println(str); // Output will be 'Hello'
    }
}
