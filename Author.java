import java.util.UUID;

public class Author {
    private UUID uuid;
    private String name;
    private String nationality;

    public Author() {
    }

    public Author(UUID uuid, String name, String nationality) {
        this.uuid = uuid;
        this.name = name;
        this.nationality = nationality;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Author{id= " + uuid + ", name=' " + name + ", nationality=' " + nationality + "'}";
    }

}
