class Calculator {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double (decimal) numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call different versions of add() method
        System.out.println("Add 2 integers: " + calc.add(5, 3));              // calls method 1
        System.out.println("Add 3 integers: " + calc.add(5, 3, 2));           // calls method 2
        System.out.println("Add 2 doubles: " + calc.add(2.5, 4.5));           // calls method 3
    }
}


/*
Method Overloading is a feature in Java where multiple methods can have the same name but different parameters (type, number, or order).

It is a type of compile-time polymorphism (also called static polymorphism) because the method to be called is determined at compile-time.


Rules for Method Overloading:
To overload a method in Java:

Method name must be the same.

Parameters must be different in:
Number of parameters
Type of parameters
Order of parameters (if types are different)

⚠️ Return type can be same or different, but it alone cannot differentiate overloaded methods.


 */