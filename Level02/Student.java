public class Student {
    // Fields to store the student's name, roll number, and marks
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize the student's details
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the student's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to create a Student object and display its details
    public static void main(String[] args) {
        Student student = new Student("John Doe", 1, 85.5);
        student.displayDetails();
    }
}
