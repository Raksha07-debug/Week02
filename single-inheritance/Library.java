// Class representing a Book
class Book {
    // Private fields for book details
    private String title;
    private int publicationYear;

    // Constructor to initialize book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Class representing an Author, extending Book
class Author extends Book {
    // Private fields for author details
    private String name;
    private String bio;

    // Constructor to initialize author details including book details
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call to superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo method to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass displayInfo method
        System.out.println("Name of the author: " + name);
        System.out.println("Bio of the author: " + bio);
    }
}

// Main class to demonstrate the Library
public class Library {
    public static void main(String[] args) {
        // Create an instance of Author
        Author author = new Author("Harry Potter", 1997, "J.K. Rowling", "Lots of thought");
        
        // Display the details of the book and the author
        author.displayInfo();
    }
}
