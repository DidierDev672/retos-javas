package inventarios;

import java.util.UUID;

public class Product {
    private UUID uuid;
    private String name;
    private Double price;
    private int quantity;

    public Product(){}

    public Product(UUID uuid, String name, Double price, int quantity) {
        this.uuid = uuid;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + uuid +
                ", nombre='" + name + '\'' +
                ", precio=" + price +
                ", cantidad=" + quantity +
                '}';
    }

}
