// Program 2: Program to implement OOPS concepts
// Demonstrates Encapsulation, Inheritance, Polymorphism (Method Overriding), and Abstraction.

// Abstract class demonstrating Abstraction
abstract class Account {
    // Private fields demonstrating Encapsulation
    private String accountHolder;
    private int accountNumber;
    protected double balance;

    public Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters (Encapsulation)
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }
    }

    // Abstract method to be implemented by subclasses
    public abstract void calculateInterest();

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass demonstrating Inheritance and Polymorphism (Method Overriding)
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, int accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added (" + interestRate + "%): " + interest + " | Updated Balance: " + balance);
    }
}

public class Program02_OOPSConcepts {
    public static void main(String[] args) {
        // Dynamic Method Dispatch / Runtime Polymorphism
        Account acc = new SavingsAccount("Rahul Sharma", 100245, 10000.0, 5.0);

        System.out.println("--- Initial Account Details ---");
        acc.displayDetails();

        System.out.println("\n--- Performing Transactions ---");
        acc.deposit(2500.0);
        acc.calculateInterest();
    }
}
