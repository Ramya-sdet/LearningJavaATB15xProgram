package java_All_Programs;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Hello world! Welcome to Java.";

        String[] words = str.split("\\s+");

        System.out.println("Number of words: " + words.length);
    }

}
