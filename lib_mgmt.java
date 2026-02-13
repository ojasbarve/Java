import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

public class lib_mgmt {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java Basics", "James Gosling", "111"));
        lib.addBook(new Book("Data Structures", "Mark Allen", "222"));
        lib.addBook(new Book("Operating Systems", "Galvin", "333"));

        System.out.println("All Books:");
        lib.displayAllBooks();

        System.out.println("\nSearch Result:");
        Book result = lib.searchByTitle("Data Structures");
        if (result != null)
            System.out.println(result);
        else
            System.out.println("Book not found");
    }
}
