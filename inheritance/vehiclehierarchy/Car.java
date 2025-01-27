package inheritance.vehiclehierarchy;

// Subclass Car extending Vehicle
class Car extends Vehicle {
    // Private field for seat capacity
    private int seatCapacity;

    // Constructor to initialize car details including seat capacity
    public Car(float maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override displayInfo method to include seat capacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The car has " + seatCapacity + " seats");
    }
}
