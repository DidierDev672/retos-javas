import java.util.List;
import java.util.UUID;

public class Book {
    private UUID uuid;
    private String title;
    private String genre;
    private List<Author> authors;

    public Book(){}

    public Book(UUID uuid, String title, String genre, List<Author> authors) {
        this.uuid = uuid;
        this.title = title;
        this.genre = genre;
        this.authors = authors;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{id=" + uuid + ", title='" + title + "', genre='" + genre + "', authors=" + authors + "}";
    }
}
