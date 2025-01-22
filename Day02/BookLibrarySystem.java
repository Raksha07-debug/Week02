class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Setter method for author (public access)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for author (public access)
    public String getAuthor() {
        return this.author;
    }
}

class EBook extends Book {
    // Method to display details of the eBook
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating an instance of EBook
        EBook eBook = new EBook();
        
        // Setting attributes
        eBook.ISBN = "1234567890";
        eBook.title = "Example Book";
        eBook.setAuthor("John Doe");

        // Display eBook details
        eBook.displayDetails();
        System.out.println("Author: " + eBook.getAuthor());
    }
}
