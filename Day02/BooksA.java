class BooksA {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public BooksA(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("The book \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a book instance
        BooksA book1 = new BooksA("To Kill a Mockingbird", "Harper Lee", 9.99, true);

        // Displaying book details
        book1.displayBookDetails();

        // Borrowing the book
        book1.borrowBook();

        // Displaying book details after borrowing
        book1.displayBookDetails();
    }
}
