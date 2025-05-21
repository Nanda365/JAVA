class Library {
    String[] books;
    String[] issuedBooks;
    int bookCount;
    int issuedCount;

    // Constructor
    public Library() {
        books = new String[100];        // fixed array size for available books
        issuedBooks = new String[100];  // fixed array size for issued books
        bookCount = 0;
        issuedCount = 0;
    }

    public void addBook(String book) {
        books[bookCount] = book;
        bookCount++;
        System.out.println("\"" + book + "\" has been added to the library.");
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null) {
                System.out.println("* " + books[i]);
            }
        }
    }

    public void issueBook(String book) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].equals(book)) {
                issuedBooks[issuedCount++] = book;
                books[i] = null; // Mark as issued
                System.out.println("\"" + book + "\" has been issued.");
                return;
            }
        }
        System.out.println("Sorry, the book \"" + book + "\" is not available.");
    }

    public void returnBook(String book) {
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i] != null && issuedBooks[i].equals(book)) {
                books[bookCount++] = book;
                issuedBooks[i] = null;
                System.out.println("\"" + book + "\" has been returned.");
                return;
            }
        }
        System.out.println("This book was not issued from this library.");
    }
}

public class OnlineBook {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Java Programming");
        lib.addBook("Python Basics");
        lib.addBook("Data Structures");

        lib.showAvailableBooks();

        lib.issueBook("Java Programming");
        lib.showAvailableBooks();

        lib.returnBook("Java Programming");
        lib.showAvailableBooks();
    }
}
