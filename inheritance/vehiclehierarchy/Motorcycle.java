package inheritance.vehiclehierarchy;

class Motorcycle extends Vehicle {
    // Private field for motorcycle type
    private String type;

    // Constructor to initialize motorcycle details including type
    public Motorcycle(float maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    // Override displayInfo method to include motorcycle type
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The motorcycle is a " + type + " type");
    }
}
