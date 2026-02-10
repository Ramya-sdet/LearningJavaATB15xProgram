package Oops_Coding;
/* Vehicle Inheritance Hierarchy
Create a Vehicle base class with start() method. Create Car and Bike subclasses
that override the start() method.
Examples:
Input:
Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
Output:
Car engine starts with a roar! Bike engine starts with a purr!
💡 Explanation:Demonstrate runtime polymorphism where the actual method called
depends on the object type, not the reference type.*/
// Vehicle base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle engine starts.");
    }
}

// Car subclass overriding start()
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starts with a roar!");
    }
}

// Bike subclass overriding start()
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}

// Main class to demonstrate the hierarchy
public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        // Create an array of Vehicle references, but initialize with Car and Bike objects
        Vehicle[] vehicles = {new Car(), new Bike()};

        // Iterate through the array and call start() on each
        for (Vehicle vehicle : vehicles) {
            // The specific start() method (Car's or Bike's) is called
            // dynamically at runtime, not the base Vehicle's.
            vehicle.start();
        }
    }
}
