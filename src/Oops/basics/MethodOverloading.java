package Oops.basics;

class Test {
    // DO: Method overloading allows multiple methods with the same name
    // but different parameter lists (number, type, or order of arguments).
    // This method finds the maximum of two integers.
    public int maxi(int a, int b) {
        return a > b ? a : b;
    }

    // DO: This method overloads the previous 'maxi' method.
    // It has the same name ('maxi') but a different number of parameters (3 instead of 2).
    // This is a valid use of method overloading (Compile-time Polymorphism).
    // DON'T: The return type can be the same or different, but it's **not sufficient**
    // on its own to differentiate overloaded methods. Parameter list must change.
    public int maxi(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > c) return b;
        return c;
    }

    // Example of a DON'T (if it were uncommented):
    /*
    // DON'T: Attempting to overload just by changing the return type is invalid.
    // This would result in a compile-time error because the method signature
    // (name + parameter list) is identical to the first 'maxi' method.
    public double maxi(int a, int b) {
        return (double)(a > b ? a : b);
    }
    */

    // Example of a DO (if it were uncommented):
    /*
    // DO: Overloading based on parameter **data type** is valid.
    public int maxi(double a, double b) {
        return (int) (a > b ? a : b);
    }
    */
}

public class MethodOverloading {
    public static void main(String[] args) {
        Test t = new Test();

        // DO: The compiler determines which overloaded method to call based on the
        // number/type of arguments passed (two integers here).
        System.out.println(t.maxi(10, 5)); // Calls maxi(int, int)

        // DO: The compiler selects this method because it matches the signature
        // with three integer arguments.
        System.out.println(t.maxi(10, 5, 12)); // Calls maxi(int, int, int)

        // Note: Method Overloading happens within the same class (or inheritance hierarchy
        // where inherited methods can be overloaded). Don't confuse it with **Method Overriding**,
        // which occurs between a superclass and a subclass.
    }
}