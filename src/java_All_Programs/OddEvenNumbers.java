package java_All_Programs;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        System.out.print("Even Numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.print("\nOdd Numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }

}
