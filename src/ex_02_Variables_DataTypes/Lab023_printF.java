package ex_02_Variables_DataTypes;

public class Lab023_printF {
    public static void main(String[] args) {
//        System.out.println("It will add a newline");
//
//        System.out.print("It will not add a newline");

        byte a = 10;
//        System.out.println("Value of a is -> "+a);
//        System.out.print("Value of a is -> "+a);
        System.out.printf("Value of a is %d", a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int aa = 100;
        int bb = 121;
        System.out.printf("Formatting the aa = %d and b = %d", aa, bb);

        System.out.println();
        int table = 9;
        System.out.printf("%dx1=%d", table, table*1);


    }
}
