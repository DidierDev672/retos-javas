import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Author author = new Author(UUID.randomUUID(), "Gabriel Garcia Márquez", "Colombiano");
        Author author2 = new Author(UUID.randomUUID(), "Isabel Allende", "Chilena");
        Author author3 = new Author(UUID.randomUUID(), "Toni Morrison", "Estadounidense");
        Author author4 = new Author(UUID.randomUUID(), "Jorge Luis Borges", "Argentina");
        Author author5 = new Author(UUID.randomUUID(), "Chinua Achebe", "Nigeria");

        AuthorRepository authorRepository = new AuthorRepository();
        authorRepository.addAuthor(author);
        authorRepository.addAuthor(author2);
        authorRepository.addAuthor(author3);
        authorRepository.addAuthor(author4);
        authorRepository.addAuthor(author5);

        Book book = new Book(UUID.randomUUID(), "Cien años de soledad", "Realismo mágico", authorRepository.getAuthorByName("Gabriel Garcia Márquez"));
        Book book2 = new Book(UUID.randomUUID(), "La casa de los espíritus", "Realismo Mágico", authorRepository.getAuthorByName("Isabel Allende"));
        Book book3 = new Book(UUID.randomUUID(), "El Aleph", "Cuento", authorRepository.getAuthorByName("Jorge Luis Borges"));
        Book book4 = new Book(UUID.randomUUID(), "Beloved", "Realismo mágico", authorRepository.getAuthorByName("Toni Morrison"));
        Book book5 = new Book(UUID.randomUUID(), "Things Fall Apart", "Novela", authorRepository.getAuthorByName("Chinua Achebe"));

        BookRepository bookRepository = new BookRepository();

        bookRepository.addBook(book);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);
        bookRepository.addBook(book5);

        bookRepository.getAllBooks().forEach(item -> {
            System.out.println("Title: " + item.getTitle());
            System.out.println("Genre: " + item.getGenre());

            item.getAuthors().forEach(element -> {
                System.out.println("Author: " + element.getName());
                System.out.println("Nacionalidad: " + element.getNationality());
            });
            System.out.println("***----***----***-----***----***----***");
        });

        System.out.println("***----***----***-----***----***----***");
        System.out.println("Lista de autores");
        authorRepository.getAllAuthors().forEach(autor -> {
            System.out.println("Author: " + author.getName());
            System.out.println("Nacionalidad: " + author.getNationality());
        });
    }
}
