package OOPS.Abstraction;

// Abstract Class
abstract class Vehicle {
    // Concrete method (has a body)
    void fuelUp() {
        System.out.println("Filling fuel tank...");
    }

    // Abstract method (no body, ends with a semicolon)
    abstract void start(); 
}

// Concrete Subclass
class Car extends Vehicle {
    // Providing the implementation for the abstract method
    @Override
    void start() {
        System.out.println("Car starts with a push button.");
    }
}

