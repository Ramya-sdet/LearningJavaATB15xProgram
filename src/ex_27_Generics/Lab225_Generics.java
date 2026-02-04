package ex_27_Generics;

public class Lab225_Generics {
    public static void main(String[] args) {
        temp(3, 4);
        temp(3.34, 4.45);
        temp("program", "generic");
    }

    static <T> T temp(T a, T b){
        return null;
    }
}
