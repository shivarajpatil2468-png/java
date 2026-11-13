// Program 5: Exception Sub Classes: Program to demonstrate creating own exception subclasses
// Demonstrates creating and throwing a User-Defined / Custom Exception.

// Custom Exception Subclass extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Program05_CustomException {
    // Method that validates age and declares the custom exception using 'throws'
    public static void validateVoterAge(int age) throws InvalidAgeException {
        System.out.println("Checking eligibility for age: " + age);
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is below 18. Not eligible to vote!");
        } else {
            System.out.println("Age " + age + " is valid. Welcome to vote!");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- User-Defined Exception Demonstration ---");

        // Valid case
        try {
            validateVoterAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println();

        // Invalid case triggering custom exception
        try {
            validateVoterAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Verification process completed.");
        }
    }
}
