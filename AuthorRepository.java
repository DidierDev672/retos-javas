import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AuthorRepository {
    private List<Author> authors = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Optional<Author> getAuthorById(UUID uuid) {
        return authors.stream()
                .filter(author -> author.getUuid()
                        .equals(uuid))
                .findFirst();
    }

    public List<Author> getAuthorByName(String name) {
        List<Author> listAuthor = new ArrayList<>();
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                listAuthor.add(author);
            }
        }
        return listAuthor;
    }

    public List<Author> getAllAuthors() {
        return authors;
    }
}
