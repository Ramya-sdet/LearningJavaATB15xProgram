package ex_23_OOPs_Super_Abstraction_superKeyword;

public class Lab192_Abs {
}



class Vehicle{

    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default Const");
    }
    Vehicle(int a ){
        System.out.println("Param Con");
    }
    Vehicle(int a, int b ){
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.

    void message(){
        System.out.println("No Return, No Argument");
    }
    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void drive(){
        System.out.println("Vehicle Parent");
    }

    void noTest() {
        System.out.println("Empty!");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    Car(int a){
        System.out.println("PC Car");
    }

    void test(){

    }

    @Override
    void drive() {
        super.drive();
        this.test();
        super.noTest();
    }
}
