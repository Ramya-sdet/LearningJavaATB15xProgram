package java_All_Programs;

import java.util.Arrays;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};

        Arrays.sort(numbers);

        System.out.println("Second Smallest Number: " + numbers[1]);
    }
}
