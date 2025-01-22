public class Product {
    private static double discount; // Static variable for discount
    private String productName;
    private double price;
    private int quantity;
    private final int productid; // Final variable for product ID

    // Constructor to initialize product details
    public Product(String productName, double price, int quantity, int productid) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productid = productid; // Initialize final variable
    }

    // Method to display product details
    public void productDetail() {
        if (this instanceof Product) { // Check if 'this' is an instance of Product
            System.out.println("Product name is: " + this.productName);
            System.out.println("Product price is: " + this.price);
            System.out.println("Product quantity is: " + this.quantity);
            System.out.println("Product ID is: " + this.productid); // Display product ID
        } else {
            System.out.println("Invalid object.");
        }
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating product instances
        Product p1 = new Product("Notebook", 50.0, 2, 1);
        Product p2 = new Product("Eraser", 10.0, 3, 2);

        // Displaying the details of the products
        System.out.println("Displaying details of the products:");
        p1.productDetail();
        p2.productDetail();
    }
}
