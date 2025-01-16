import java.util.Scanner;

class Item {

    // Declare variables to store item details
    int itemCode;
    int itemPrice;
    String itemName;

    // Constructor to initialize item details
    Item(int itemCode, String itemName, int itemPrice) {
        this.itemPrice = itemPrice; // Set the item's price
        this.itemName = itemName; // Set the item's name
        this.itemCode = itemCode; // Set the item's code
    }

    // Static method to display item details
    public static void display(int itemCode, String itemName, int itemPrice) {
        // Print the item's code
        System.out.println("The item code is " + itemCode);
        // Print the item's price
        System.out.println("The item price is " + itemPrice);
        // Print the item's name
        System.out.println("The item name is " + itemName);
    }

    // Static method to calculate the total cost for a given quantity
    public static int totalCost(int price, int quantity) {
        return price * quantity; // Return the total cost
    }

    // Main method to test the Item class
    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        // Read the quantity from user input
	System.out.println("enter the quantity");
        int quantity = sc.nextInt();
        
        // Display the details of an item
        display(12, "chocolate", 120);
        
        // Calculate and print the total cost for the given quantity
        System.out.println("The total cost is " + totalCost(120, quantity));
    }
}
