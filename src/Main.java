
class Book {

    String title;
    String author;
    int pages;
    boolean isAvailable;


    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;


        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }


    public void displayInfo() {
        System.out.println("=== Book Information ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("========================");
    }


    public void borrowBook() {
        isAvailable = false;
        System.out.println("Book Borrowed");
    }


    public void returnBook() {
        isAvailable = true;
        System.out.println("Book Returned");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book3 = new Book("1984", "George Orwell", 328);

        System.out.println();


        System.out.println("Displaying all books in the library:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();


        System.out.println("Testing borrow/return functionality:");
        System.out.println("\n--- Borrowing books ---");
        book1.borrowBook();
        book2.borrowBook();

        System.out.println("\n--- Checking availability after borrowing ---");
        book1.displayInfo();
        book2.displayInfo();

        System.out.println("\n--- Returning books ---");
        book1.returnBook();

        System.out.println("\n--- Final status ---");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
