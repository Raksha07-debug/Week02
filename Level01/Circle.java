public class Circle {
    // Declare a private variable to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius; // Set the circle's radius
    }

    // Static method to calculate the area of the circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius; // Return the calculated area
    }

    // Static method to calculate the circumference of the circle
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius; // Return the calculated circumference
    }

    // Main method to test the Circle class
    public static void main(String ars[]) {
        // Create a Circle object with a given radius
        Circle c = new Circle(5.0);
        // Calculate the area of the circle
        double a = calculateArea(5.0);
        // Calculate the circumference of the circle
        double b = calculateCircumference(5.0);
        // Print the area of the circle
        System.out.println("Area is " + a);
        // Print the circumference of the circle
        System.out.println("Circumference is " + b);
    }
}
