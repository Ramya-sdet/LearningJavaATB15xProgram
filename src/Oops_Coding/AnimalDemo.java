package Oops_Coding;
/*Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
Examples:
Input:
Create Dog and Cat objects and call makeSound()
Output:
Dog says: Woof! Woof! Cat says: Meow! Meow!
💡 Explanation:Demonstrate method overriding where each subclass provides its own implementation
   of the makeSound() method.
*/
// Parent class (Superclass)
class Animal {
    // Method to be overridden in subclasses
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass 1: Dog, inherits from Animal
class Dog extends Animal {
    // Override the makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Subclass 2: Cat, inherits from Animal
class Cat extends Animal {
    // Override the makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

// Main class to demonstrate the functionality
public class AnimalDemo {
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal();

        // Create Dog and Cat objects
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call the makeSound() method on each object.
        // The specific implementation depends on the actual type of the object.
        genericAnimal.makeSound(); // Calls Animal's method
        dog.makeSound();           // Calls Dog's overridden method
        cat.makeSound();           // Calls Cat's overridden method
    }
}
