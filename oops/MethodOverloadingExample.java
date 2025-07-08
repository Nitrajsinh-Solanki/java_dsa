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
