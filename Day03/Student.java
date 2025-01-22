public class Student {
    // Static variable shared across all students
    private static String universityName = "XYZ University";

    // Instance variables
    private String name;
    private int rollNumber;
    private double grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        if (this instanceof Student) { // Check if 'this' is an instance of Student
            System.out.println("Student name is: " + this.name);
            System.out.println("Student roll number is: " + this.rollNumber);
            System.out.println("Student grade is: " + this.grade);
            System.out.println("University Name: " + universityName);
        } else {
            System.out.println("Invalid object.");
        }
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating student instances
        Student s1 = new Student("Dev", 4, 89.6);
        Student s2 = new Student("Sarv", 5, 92.6);

        // Displaying the details of the students
        System.out.println("Displaying details of a student:");
        s1.displayDetails();
        s2.displayDetails();
    }
}
