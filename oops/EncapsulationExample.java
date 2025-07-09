
// Encapsulated class
class BankAccount {
    // private data members
    private String accountHolder;
    private double balance;

    // constructor
    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    // public getter method
    public double getBalance() {
        return balance;
    }

    // public setter method (controlled access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}


public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Nitraj", 1000.0);

        // Can't access balance directly: acc.balance ❌
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: ₹" + acc.getBalance());

        acc.deposit(500);
        System.out.println("After deposit: ₹" + acc.getBalance());

        acc.withdraw(300);
        System.out.println("After withdrawal: ₹" + acc.getBalance());
    }
}



/*
Encapsulation is the process of wrapping data (variables) and methods (functions) together in a single unit (class) and hiding the internal details from outside classes.

You provide controlled access using getters and setters.


Real-Life Example:
You have a bank account:
Balance is private.
You can check the balance (getter).
You can deposit/withdraw using methods.
You cannot directly change the balance.

 */