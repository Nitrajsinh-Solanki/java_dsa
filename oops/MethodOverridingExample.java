// Parent class
class Person {
    void work() {
        System.out.println("Person is working...");
    }
}

// Child class
class Doctor extends Person {
    // This method overrides the one in Person class
    @Override
    void work() {
        System.out.println("Doctor is treating patients...");
    }
}

// Another child class
class Engineer extends Person {
    @Override
    void work() {
        System.out.println("Engineer is developing software...");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Parent class reference and object
        Person p = new Person();
        p.work(); // Output: Person is working...

        // Child class object: Doctor
        Doctor d = new Doctor();
        d.work(); // Output: Doctor is treating patients...

        // Child class object: Engineer
        Engineer e = new Engineer();
        e.work(); // Output: Engineer is developing software...

        // Parent class reference to child object (Polymorphism)
        Person ref = new Doctor();
        ref.work(); // Output: Doctor is treating patients...
    }
}
