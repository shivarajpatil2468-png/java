// Program 7: Program to demonstrate multiple inheritances by implementing interfaces
// Demonstrates a class implementing two interfaces to achieve multiple inheritance in Java.

// First Interface
interface AcademicMarks {
    void setAcademicMarks(int marks1, int marks2);
    void displayAcademicMarks();
}

// Second Interface
interface SportsMarks {
    int SPORTS_WEIGHTAGE = 25;
    void displaySportsMarks();
}

// Class implementing multiple interfaces
class StudentResult implements AcademicMarks, SportsMarks {
    private String studentName;
    private int rollNo;
    private int subject1, subject2;

    public StudentResult(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    @Override
    public void setAcademicMarks(int marks1, int marks2) {
        this.subject1 = marks1;
        this.subject2 = marks2;
    }

    @Override
    public void displayAcademicMarks() {
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
    }

    @Override
    public void displaySportsMarks() {
        System.out.println("Sports Weightage Marks: " + SPORTS_WEIGHTAGE);
    }

    public void displayFinalResult() {
        int total = subject1 + subject2 + SPORTS_WEIGHTAGE;
        System.out.println("--- Student Result Report ---");
        System.out.println("Name: " + studentName + " | Roll No: " + rollNo);
        displayAcademicMarks();
        displaySportsMarks();
        System.out.println("Total Score: " + total);
    }
}

public class Program07_MultipleInheritance {
    public static void main(String[] args) {
        StudentResult student = new StudentResult("Ananya Rao", 104);
        student.setAcademicMarks(88, 92);
        student.displayFinalResult();
    }
}
