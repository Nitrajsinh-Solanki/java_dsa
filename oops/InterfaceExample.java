// Define an interface
interface RemoteControl {
    void turnOn();   // abstract method
    void turnOff();  // abstract method
}

// Implementing class: Television
class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

    public void turnOff() {
        System.out.println("TV is now OFF.");
    }
}

// Implementing class: Air Conditioner
class AC implements RemoteControl {
    public void turnOn() {
        System.out.println("AC is cooling the room.");
    }
    public void turnOff() {
        System.out.println("AC is now OFF.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Create TV object and use RemoteControl methods
        RemoteControl tv = new TV();
        tv.turnOn();   // Output: TV is now ON.
        tv.turnOff();  // Output: TV is now OFF.

        System.out.println("------");

        // Create AC object and use RemoteControl methods
        RemoteControl ac = new AC();
        ac.turnOn();   // Output: AC is cooling the room.
        ac.turnOff();  // Output: AC is now OFF.
    }
}



/*
 

📘 What is Abstraction?
Abstraction is the process of hiding the implementation details and showing only the essential features.
In Java, we achieve abstraction using:
1.	Abstract classes
2.	Interfaces
________________________________________
🆚 Abstraction (via Abstract Class) vs Interface
Let's break it down point by point:
________________________________________
✅ 1. Keyword & Declaration
Abstract Class	Interface
Declared using abstract	Declared using interface
abstract class Animal {
    abstract void sound();
}
interface Flyable {
    void fly();
}
________________________________________
✅ 2. Method Types
Abstract Class	Interface (Java 7 / Java 8+)
Can have both abstract and concrete methods	All methods are abstract by default (Java 7). From Java 8+, can have default and static methods too.
________________________________________


✅ 3. Inheritance & Usage
Abstract Class	Interface
A class extends an abstract class	A class implements an interface

A class can extend only one abstract class (single inheritance)	A class can implement multiple interfaces (multiple inheritance)



✅ 4. Variables
Abstract Class	Interface
Can have instance variables	Variables are public static final (constants) only
Variables can be any type/modifier	Always public static final
________________________________________
✅ 5. Constructors
Abstract Class	Interface
Can have a constructor	Cannot have constructors
________________________________________
✅ 6. Access Modifiers
Abstract Class	Interface
Can use any modifier (private, protected, public)	All methods are public by default (Java 7), default and static (Java 8+)
________________________________________
✅ 7. When to Use
Use Abstract Class When	Use Interface When
You want to provide a base class with shared code	You want to define only behavior, not implementation
You need constructors or non-static fields	You want to achieve multiple inheritance
Classes are closely related (e.g., Dog, Cat)	Classes are unrelated but share capability (e.g., Flyable, Runnable)




 */
