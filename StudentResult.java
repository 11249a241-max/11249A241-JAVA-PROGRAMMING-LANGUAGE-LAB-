
// Level 1: Student class
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

// Level 2: Marks inherits Student
class Marks extends Student {
    int[] marks = new int[5];

    Marks(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name);
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        marks[3] = m4;
        marks[4] = m5;
    }

    void displayMarks() {
        System.out.println("Marks in 5 Subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

// Level 3: Result inherits Marks
class Result extends Marks {

    Result(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name, m1, m2, m3, m4, m5);
    }

    void calculateResult() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / 5;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class StudentResult {
    public static void main(String[] args) {

        Result student = new Result(
            101, "Arun", 85, 90, 78, 88, 92
        );

        student.displayStudent();
        student.displayMarks();
        student.calculateResult();
    }
}