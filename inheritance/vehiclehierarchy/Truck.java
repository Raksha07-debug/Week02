package inheritance.vehiclehierarchy;

class Truck extends Vehicle {
    // Private field for weight capacity
    private int weightCapacity;

    // Constructor to initialize truck details including weight capacity
    public Truck(float maxSpeed, String fuelType, int weightCapacity) {
        super(maxSpeed, fuelType);
        this.weightCapacity = weightCapacity;
    }

    // Override displayInfo method to include weight capacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The truck has a weight capacity of " + weightCapacity + " kg");
    }
}
