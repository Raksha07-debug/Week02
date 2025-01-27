package inheritance.employeemgmt;

class Employee {
    // Private fields for employee details
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Details of an employee:");
        System.out.println("Name of the employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}