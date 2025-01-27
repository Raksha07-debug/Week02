package inheritance.employeemgmt;

class Manager extends Employee {
    // Private field for team size
    private int teamSize;

    // Constructor to initialize manager details including team size
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Getter method for team size
    public int getTeamSize() {
        return teamSize;
    }

    // Override displayDetails method to include team size
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size: " + teamSize);
    }
}
