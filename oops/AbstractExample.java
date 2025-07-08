// Abstract parent class
abstract class Animal {
    abstract void makeSound(); // abstract method

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class must override makeSound()
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Animal a = new Animal(); ❌ Error: can't create object of abstract class
        Dog d = new Dog();
        d.makeSound();  // Overridden method
        d.sleep();      // Inherited concrete method
    }
}




/*
Abstraction is the process of hiding the internal implementation details and showing only the essential features of an object.


| Real World | Abstracted Action | Hidden Details                      |
| ---------- | ----------------- | ----------------------------------- |
| Car        | Press accelerator | Fuel injection, piston movement     |
| ATM        | Withdraw money    | Bank database, server communication |
| Mobile App | Tap "Order Food"  | Backend, delivery logic             |



| Feature              | Abstract Class              | Interface                                    |
| -------------------- | --------------------------- | -------------------------------------------- |
| Keyword              | `abstract class`            | `interface`                                  |
| Inheritance          | `extends`                   | `implements`                                 |
| Methods              | Abstract + Concrete         | Abstract (Java 7) + Default/Static (Java 8+) |
| Fields               | Can have instance variables | Only constants (`public static final`)       |
| Constructor          | Can have constructors       | ❌ No constructors                            |
| Multiple Inheritance | ❌ Not supported             | ✅ Supported                                  |


 */