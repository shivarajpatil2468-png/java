// Program 4: Exception Handling: Program to implement the concept of exception handling
// Demonstrates try, multiple catch blocks, and finally block.

public class Program04_ExceptionHandling {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;
        int[] numbers = {10, 20, 30};

        System.out.println("--- Exception Handling Demonstration ---");

        // Case 1: Handling ArithmeticException
        try {
            System.out.println("Attempting division: " + numerator + " / " + denominator);
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide a number by zero! (" + e.getMessage() + ")");
        }

        // Case 2: Handling ArrayIndexOutOfBoundsException with finally block
        try {
            System.out.println("\nAttempting to access index 5 of a 3-element array...");
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index accessed! (" + e.getMessage() + ")");
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        } finally {
            System.out.println("\nFinally Block Executed: Resources cleaned up successfully.");
        }

        System.out.println("Program continues smoothly after exception handling.");
    }
}
