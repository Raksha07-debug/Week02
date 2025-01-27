package inheritance.employeemgmt;

class Intern extends Employee {
    // Private field for internship duration
    private int duration;

    // Constructor to initialize intern details including duration
    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    // Getter method for internship duration
    public int getDuration() {
        return duration;
    }

    // Override displayDetails method to include internship duration
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration of internship: " + duration + " months");
    }
}