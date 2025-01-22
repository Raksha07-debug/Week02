class Vehicle{
private String ownerName;
private String vehicleType;
private int registrationFee=500.0;

public Vehicle(String ownerName,String vehicleType){
this.ownerName=ownerName;
this.vehicleType=vehicleType;
}

public void displayDetails(){
System.out.println("owner name" +ownerName);
 System.out.println("Vehicle Type: " + vehicleType);
 System.out.println("Registration Fee: " + registrationFee);


}

 public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
 public static void main(String[] args) {
        // Create a new VehicleRegistration object
        VehicleRegistration vehicle = new VehicleRegistration("John Doe", "Car");

        // Display vehicle details
        System.out.println("Vehicle Details:");
        vehicle.displayVehicleDetails();

        // Update registration fee
        System.out.println("\nUpdating registration fee...");
        updateRegistrationFee(600.0);

        // Display updated vehicle details
        System.out.println("\nUpdated Vehicle Details:");
        vehicle.displayVehicleDetails();
    }
}