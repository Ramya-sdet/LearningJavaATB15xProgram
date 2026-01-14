package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == Comparsion - String check the ref in String.

        System.out.println(s1 == s3);//False ref are diff
        System.out.println(s1 == s2);//False
        System.out.println(s2 == s3);//false

        System.out.println(s1 == s4);//True
        System.out.println(s3 == s5);//False

        // equals ( content) -> value
        System.out.println(s1.equals(s2));//True Same values
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));//False-> h == H
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase ->Hello,hello, HELLO
        //  == - check for the ref
        // equal operator assignment the value


    }
}