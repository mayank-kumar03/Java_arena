package Oops.basics;

// Superclass or Parent class
class Vehicle {
    // DO: The method in the superclass that will be overridden.
    // The method signature (name and parameter list) must match exactly in the subclass.
    public void run() {
        System.out.println("Vehicle is moving.");
    }

    // DON'T: Methods declared as 'final' cannot be overridden.
    /*
    public final void startEngine() {
        System.out.println("Engine started.");
    }
    */

    // DON'T: Methods declared as 'static' cannot be overridden.
    // This is called "Method Hiding" instead of overriding.
    /*
    public static void brake() {
        System.out.println("Vehicle brakes.");
    }
    */
}

// Subclass or Child class
class Car extends Vehicle {
    // DO: This method **overrides** the 'run()' method in the 'Vehicle' superclass.
    // The signature (method name and parameter list) must be exactly the same.
    @Override // DO: Use the @Override annotation. It helps the compiler check rules
    // and improves code readability.
    public void run() {
        // DO: You can call the superclass method using 'super.methodName()'.
        // super.run();
        System.out.println("Car is running smoothly at high speed.");
    }

    // DO: The access modifier in the overriding method must be the **same or more permissive**
    // (wider scope) than the overridden method.
    // Since 'run()' in Vehicle is 'public', this one must be 'public'.

    // DON'T: Attempting to reduce the access scope will result in a compile-time error.
    /*
    // @Override
    // protected void run() { ... } // Error: Cannot reduce the visibility
    */

    // DO: The overriding method can return the same type or a **covariant return type**
    // (a subclass of the return type) of the overridden method. Since 'run' returns void,
    // it must return void here.

    // DON'T: The overriding method cannot throw checked exceptions that are new or broader
    // than those thrown by the overridden method.
}

public class MethodOverRidding {
    public static void main(String[] args) {
        // DO: Demonstrate Runtime Polymorphism.
        // The object type (Car) determines which 'run()' method is executed,
        // even though the reference type is the superclass (Vehicle).
        Vehicle v = new Car();

        // This calls the **overridden** 'run()' method from the 'Car' class at runtime.
        System.out.print("The call: ");
        v.run(); // Output: Car is running smoothly at high speed.
    }
}