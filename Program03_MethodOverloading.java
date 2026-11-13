// Program 3: To write a Java program to implement method overloading
// Demonstrates compile-time polymorphism by overloading methods with different parameter lists.

class GeometryCalculator {
    // 1. Area of a Circle (1 double parameter)
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 2. Area of a Rectangle (2 double parameters)
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // 3. Area of a Triangle (2 float parameters)
    public double calculateArea(float base, float height) {
        return 0.5 * base * height;
    }

    // 4. Addition of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // 5. Addition of three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Program03_MethodOverloading {
    public static void main(String[] args) {
        GeometryCalculator calc = new GeometryCalculator();

        System.out.println("--- Method Overloading Demonstration ---");
        System.out.printf("Area of Circle (r = 5.0): %.2f%n", calc.calculateArea(5.0));
        System.out.printf("Area of Rectangle (10.0 x 4.5): %.2f%n", calc.calculateArea(10.0, 4.5));
        System.out.printf("Area of Triangle (b = 6.0f, h = 8.0f): %.2f%n", calc.calculateArea(6.0f, 8.0f));

        System.out.println("Sum of 2 integers (10, 20): " + calc.add(10, 20));
        System.out.println("Sum of 3 integers (10, 20, 30): " + calc.add(10, 20, 30));
    }
}
