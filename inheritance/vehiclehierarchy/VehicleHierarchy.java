
package inheritance.vehiclehierarchy;


// Main class to demonstrate the vehicle hierarchy
public class VehicleHierarchy {
    public static void main(String[] args) {
        // Create instances of Car, Truck, and Motorcycle
        Car car = new Car(120.0f, "gasoline", 5);
        car.displayInfo();

        Truck truck = new Truck(80.0f, "diesel", 2000);
        truck.displayInfo();

        Motorcycle motorcycle = new Motorcycle(150.0f, "gasoline", "sport");
        motorcycle.displayInfo();
    }
}
