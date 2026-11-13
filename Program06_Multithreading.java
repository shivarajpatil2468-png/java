// Program 6: Multithreading: Program to demonstrate Multithreading using Thread class
// Demonstrates creating multiple threads by extending the java.lang.Thread class.

class NumberPrinterThread extends Thread {
    private String threadName;

    public NumberPrinterThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " started execution.");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " -> Count: " + i);
                Thread.sleep(300); // Pause for 300 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " finished execution.");
    }
}

public class Program06_Multithreading {
    public static void main(String[] args) {
        System.out.println("--- Multithreading Using Thread Class ---");

        NumberPrinterThread t1 = new NumberPrinterThread("Thread-A");
        NumberPrinterThread t2 = new NumberPrinterThread("Thread-B");

        // Start both threads concurrently
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished after all child threads completed.");
    }
}
