package java_All_Programs;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};

        Arrays.sort(numbers);

        System.out.println("Second Largest Number: " + numbers[numbers.length - 2]);
    }
}

