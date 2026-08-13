class Student {
    // Fields
    String name;
    int rollNumber;
    int marks;

    // Constructor
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student information
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    }
}

public class StudentRecord {
    public static void main(String[] args) {

        // Creating two Student objects
        Student student1 = new Student("Arun", 101, 85);
        Student student2 = new Student("Priya", 102, 92);

        // Display student details
        student1.displayDetails();
        student2.displayDetails();
    }
}
