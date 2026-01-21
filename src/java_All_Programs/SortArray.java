package java_All_Programs;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1};

        Arrays.sort(numbers);

        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
