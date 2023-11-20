package week7.Book;

import java.util.*;

record Book(String title, String author, int publicationYear, boolean isAvailable) {}

class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Optional<Book> checkAvailabilityByTitle(String title) {
        return books.stream()
                .filter(book -> book.title().equals(title) && book.isAvailable())
                .findFirst();
    }

    public Optional<Book> getFirstAvailableBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equals(author) && book.isAvailable())
                .findFirst();
    }

    public void updateAvailability(String title, boolean newStatus) {
        books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .ifPresent(book -> book = new Book(book.title(), book.author(), book.publicationYear(), newStatus));
    }
}
