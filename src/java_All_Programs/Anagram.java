package java_All_Programs;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        if (areAnagrams(s1, s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }

    public static boolean areAnagrams(String s1, String s2){

        // Remove non-letter characters and convert to lowercase
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Sort the characters of the strings
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);

        // Compare sorted strings
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}

