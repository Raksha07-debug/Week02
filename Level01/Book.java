public class Book {
    // Declare variables to store book details
    String title;
    String author;
    int price;

    // Constructor to initialize book details
    public Book(String title, String author, int price) {
        this.title = title; // Set the book's title
        this.author = author; // Set the book's author
        this.price = price; // Set the book's price
    }

    // Static method to display book details
    public static void display(String title, String author, int price) {
        // Print the book's title
        System.out.println("Book's title is " + title);
        // Print the book's author
        System.out.println("Author of the book is " + author);
        // Print the book's price
        System.out.println("Price of the book is " + price);
    }

    // Main method to test the Book class
    public static void main(String args[]) {
        // Create a Book object with given details
        Book b = new Book("Alchemist", "Paulo Coelho", 150);
        // Display the details of the created book
        display("Alchemist", "Paulo Coelho", 150);
    }
}
