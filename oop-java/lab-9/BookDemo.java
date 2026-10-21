import java.util.*;

class Book {
    private final String isbn;
    private final String title;

    Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book other = (Book) o;
        return isbn.equals(other.isbn);               // equal if the ISBN is equal
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);                    // must use the same field as equals
    }

    @Override
    public String toString() {
        return title + " (" + isbn + ")";
    }
}

public class BookDemo {

    public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Effective Java");
        Book b2 = new Book("978-0134685991", "Effective Java (copy)");
        Book b3 = new Book("978-0596009205", "Head First Java");

        System.out.println(b1 == b2);                 // false
        System.out.println(b1.equals(b2));            // true

        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);                                // duplicate, rejected
        books.add(b3);

        System.out.println("Set size: " + 

books.size());   // 2
        System.out.println(books);
    }
}
