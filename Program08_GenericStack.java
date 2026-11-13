// Program 8: Generic Classes: Program to demonstrate generic classes. Stack Operations
// Demonstrates a type-safe generic Stack<T> supporting push, pop, peek, and display operations.

class GenericStack<T> {
    private T[] stackArray;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GenericStack(int size) {
        this.capacity = size;
        this.stackArray = (T[]) new Object[size];
        this.top = -1;
    }

    // Push operation
    public void push(T item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push: " + item);
            return;
        }
        stackArray[++top] = item;
        System.out.println("Pushed: " + item);
    }

    // Pop operation
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return null;
        }
        T poppedItem = stackArray[top--];
        System.out.println("Popped: " + poppedItem);
        return poppedItem;
    }

    // Peek operation
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack Elements (Bottom to Top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class Program08_GenericStack {
    public static void main(String[] args) {
        System.out.println("--- 1. Generic Stack of Integers ---");
        GenericStack<Integer> intStack = new GenericStack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.display();
        System.out.println("Top Element (Peek): " + intStack.peek());
        intStack.pop();
        intStack.display();

        System.out.println("\n--- 2. Generic Stack of Strings ---");
        GenericStack<String> stringStack = new GenericStack<>(5);
        stringStack.push("Java");
        stringStack.push("Generics");
        stringStack.push("Stack");
        stringStack.display();
        stringStack.pop();
        stringStack.display();
    }
}
