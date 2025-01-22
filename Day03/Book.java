public class Book {
    private static String libraryName = "XYZ Library"; // Static variable for library name
    private String title;
    private String author;  // Added this instance variable
    private final int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title of the book: " + this.title);
        System.out.println("Author of the book: " + this.author);
        System.out.println("ISBN of the book: " + this.isbn);
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1254);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 127);

        System.out.println("Displaying details of books in the library:");

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
