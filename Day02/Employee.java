public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
  public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager(101, "Marketing", 70000.0);

        // Display manager details
        System.out.println("Manager Details:");
        manager.displayEmployeeInfo();
        System.out.println("Initial Salary: $" + manager.getSalary());

        // Modify salary using the modifySalary method
        manager.modifySalary(80000.0);

        // Display updated manager details
        System.out.println("\nUpdated Manager Details:");
        manager.displayEmployeeInfo();
        System.out.println("Updated Salary: $" + manager.getSalary());
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    // Main method to test the Employee and Manager classes
  
}
