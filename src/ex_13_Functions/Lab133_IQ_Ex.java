package ex_13_Functions;

public class Lab133_IQ_Ex {
    public static void main(String[] args) {
      int a=B(1);
     // String b=A("hi");
      String c=C("hi");
      boolean d=D(false);

        System.out.println(a+""+c+""+d);
    }

    public static void A(String args) {

    }

    public static int B(int args) {
        return 10;
    }
    public static String C(String args) {
        return "10";
    }
    public static boolean D(boolean args) {
        return true;
    }
}
