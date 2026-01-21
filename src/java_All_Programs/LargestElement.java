package java_All_Programs;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Largest Element: " + max);
    }

}
