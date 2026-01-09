package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_return_function();
        return_int();
        return_boolean();
        return_float_pi_value();

    }

    static void non_return_function() {
        System.out.println("Print no return type");
    }

    static int return_int() {
        System.out.println("return int");
        return 10;//does not return 10 return type is not added in function definition
    }

    static boolean return_boolean() {
        System.out.println("return boolean");
        return true;//does not return true return type is not added in function definition

    }

    static float return_float_pi_value(){
        return 3.14f;//does not return 3.14 return type is not added in function definition
    }
}
