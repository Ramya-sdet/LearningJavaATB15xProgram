package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");
        System.out.println(stringBuffer);


        String s1 = "Java";
        s1 = s1 + "Program";
        System.out.println(s1);

    }
}