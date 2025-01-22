public class Employee {
    // Static variable shared across all employees
    private static String companyName = "ABC Corp";

    // Instance variables for employee details
    private String name;
    private String designation;
    private final int id; // Final variable to ensure ID cannot be changed once assigned

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    // Method to display employee details
    public void employeeDetails() {
        // Using instanceof to check if 'this' is an instance of Employee
        if (this instanceof Employee) {
            System.out.println("Name of the employee: " + this.name);
            System.out.println("ID of the employee: " + this.id);
            System.out.println("Designation of the employee: " + this.designation);
        } else {
            System.out.println("Invalid object.");
        }
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating employee instances
        Employee e1 = new Employee("Savi", 12, "Developer");
        Employee e2 = new Employee("Rashii", 13, "Developer");

        // Displaying the details of the employees
        System.out.println("Displaying employee details:");
        e1.employeeDetails();
        e2.employeeDetails();
    }
}
