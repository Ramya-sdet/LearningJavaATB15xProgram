package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Preethi";
        String s1 = new String("Preethi");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Preethi");
        StringBuilder stringBuilder = new StringBuilder("Preethi vi");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
