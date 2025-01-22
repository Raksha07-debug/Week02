public class Vehicle {
    // Static variable for a common registration fee
    private static double registrationFee = 100.0;

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber; // Final variable to uniquely identify each vehicle

    // Constructor to initialize the instance variables
    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display the vehicle's registration details
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) { // Check if 'this' is an instance of Vehicle
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Jiya", "Car", 101);
        Vehicle vehicle2 = new Vehicle("aish", "Bike", 102);

        // Displaying registration details of the vehicles
        System.out.println("Displaying vehicle registration details:");
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(150.0);

        // Displaying updated registration details of the vehicles
        System.out.println("Displaying updated vehicle registration details:");
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}
