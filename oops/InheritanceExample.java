// Parent class
class Person {
    String name;
    long contact;

    Person(String name, long contact) {
        this.name = name;
        this.contact = contact;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(String name, long contact, int rollNo, String course) {
        super(name, contact); 
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudentInfo() {
        displayPersonInfo(); 
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Student s = new Student("Nitraj", 1234567890L, 101, "Java Programming");
        s.displayStudentInfo();
    }
}



/*
Inheritance is a mechanism in Java by which one class can acquire the properties and behaviors (fields and methods) of another class.

It enables code reuse and supports the concept of "is-a" relationship between a superclass and a subclass.

 1. Superclass (Parent Class)
The class whose members are inherited.
It contains common properties and methods.

 2. Subclass (Child Class)
The class that inherits from the parent class using the extends keyword.
It can use parent class members and define its own as well.


Advantages of Inheritance:
Code Reusability – Write once, use in multiple classes.
Improves Code Organization – Logical grouping of shared features.
Method Overriding Support – Allows modifying parent behavior in child class.
Runtime Polymorphism – Achieved using inheritance and method overriding.

 */