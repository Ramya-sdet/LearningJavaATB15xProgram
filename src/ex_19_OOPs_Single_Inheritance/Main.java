package ex_19_OOPs_Single_Inheritance;

public class Main {  // The name matches the file name
    public static void main(String[] args) {
        Car myCar = new Car();  // Create an object of the Car class
        myCar.start();          // Call method from the Vehicle class
        myCar.honk();           // Call method from the Car class
        myCar.stop();           // Call method from the Vehicle class
    }
}