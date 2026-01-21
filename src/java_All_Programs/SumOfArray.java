package java_All_Programs;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all elements: " + sum);

    }
}