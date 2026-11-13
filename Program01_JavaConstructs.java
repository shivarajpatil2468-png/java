// Program 1: Exercises in Java Programming Constructs
// Demonstrates control statements (if-else, switch), loops (for, while), and arrays.

import java.util.Scanner;

public class Program01_JavaConstructs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. If-Else Construct: Check Even or Odd
        int number = 14;
        System.out.println("--- 1. If-Else Construct ---");
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        // 2. Switch-Case Construct: Day of the Week
        int day = 3;
        System.out.println("\n--- 2. Switch-Case Construct ---");
        switch (day) {
            case 1: System.out.println("Day 1: Monday"); break;
            case 2: System.out.println("Day 2: Tuesday"); break;
            case 3: System.out.println("Day 3: Wednesday"); break;
            case 4: System.out.println("Day 4: Thursday"); break;
            case 5: System.out.println("Day 5: Friday"); break;
            default: System.out.println("Weekend");
        }

        // 3. For Loop Construct: Factorial of a Number
        int n = 5;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("\n--- 3. For Loop Construct ---");
        System.out.println("Factorial of " + n + " is: " + factorial);

        // 4. While Loop Construct: Sum of Digits
        int temp = 1234, sumOfDigits = 0;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        System.out.println("\n--- 4. While Loop Construct ---");
        System.out.println("Sum of digits of 1234 is: " + sumOfDigits);

        // 5. Array & Enhanced For-Loop Construct
        int[] marks = {85, 90, 78, 92, 88};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / marks.length;
        System.out.println("\n--- 5. Array Construct ---");
        System.out.println("Total Marks: " + total + ", Average: " + average);

        sc.close();
    }
}
