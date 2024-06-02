import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Optional<Book> getBookById(UUID uuid) {
        return books.stream()
                .filter(book -> book.getUuid()
                        .equals(uuid))
                .findFirst();
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getBookByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookByTitle.add(book);
            }
        }

        return bookByTitle;
    }

    public List<Book> getBooksByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                booksByAuthor.add(book);
            }
        }

        return booksByAuthor;
    }
}
