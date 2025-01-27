package inheritance.vehiclehierarchy;

class Vehicle {
    // Private fields for vehicle details
    private float maxSpeed;
    private String fuelType;

    // Constructor to initialize vehicle details
    public Vehicle(float maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("The max speed of the vehicle is " + maxSpeed + " and the fuel type is " + fuelType);
    }
}
