package hybrid_inheritance.vehicle_management;

class Vehicle {
    private float maxSpeed;
    private String model;
 
    public Vehicle(float var1, String var2) {
       this.maxSpeed = var1;
       this.model = var2;
    }
 
    public void displayInfo() {
       System.out.println("Model: " + this.model);
       System.out.println("Max Speed: " + this.maxSpeed);
    }
 }
 
