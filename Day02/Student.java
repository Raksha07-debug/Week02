class Student {
    // Public attribute: rollNumber
    public int rollNumber;

    // Protected attribute: name
    protected String name;

    // Private attribute: cgpa
    private double cgpa;

    // Constructor to initialize rollNumber, cgpa, and name
    public Student(int rollNumber, double cgpa, String name) {
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        this.name = name;
    }

    // Getter method for cgpa (public access)
    public double getCgpa() {
        return cgpa;
    }

    // Setter method for cgpa (public access)
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
    public static void main(String[] args) {
        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 8.5);

        // Display postgraduate student details
        pgStudent.displayPgDetails();

        // Modify CGPA using setter method
        pgStudent.setCgpa(9.0);

        // Display updated details
        System.out.println("\nUpdated Postgraduate Student Details:");
        pgStudent.displayPgDetails();
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    // Constructor to initialize rollNumber, name, and cgpa
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, cgpa, name);
    }

    // Method to demonstrate the use of protected member 'name'
    public void displayPgDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("CGPA: " + getCgpa());
    }

    // Main method to test the Student and PostgraduateStudent classes

}
