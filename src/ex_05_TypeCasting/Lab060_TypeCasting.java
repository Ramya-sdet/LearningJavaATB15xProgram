package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 987654321l;
//        short s = phone; // Narrowing - implicit.
        short s1 = (short) phone; // Narrowing - Explicit.
    }
}
