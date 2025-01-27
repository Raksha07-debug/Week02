// Superclass Employee
package inheritance.employeemgmt;

// Main class to manage employee details and demonstrate method overriding
public class EmployeeManagement {
    public static void main(String[] args) {
        // Create instances of Employee, Manager, Developer, and Intern
        Employee e1 = new Employee("Savi", 51, 100000);
        Manager m1 = new Manager("Rashi", 548, 50000, 5);
        Developer d1 = new Developer("Ravi", 567, 60000, "Java");
        Intern i1 = new Intern("Rahul", 123, 40000, 6);

        // Display details of employee, manager, developer, and intern
        e1.displayDetails();
        m1.displayDetails();
        d1.displayDetails();
        i1.displayDetails();
    }
}
