package week7.Book;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook(new Book("Book1", "Author1", 2001, true));
        catalog.addBook(new Book("Book2", "Author2", 2002, false));
        catalog.addBook(new Book("Book3", "Author1", 2003, true));

        System.out.println("Check availability of 'Book1': " + catalog.checkAvailabilityByTitle("Book1").isPresent());
        System.out.println("First available book by 'Author1': " + catalog.getFirstAvailableBookByAuthor("Author1").get().title());
        catalog.updateAvailability("Book2", true);
        System.out.println("Check availability of 'Book2' after update: " + catalog.checkAvailabilityByTitle("Book2").isPresent());
    }
}
