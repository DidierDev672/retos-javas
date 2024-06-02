package inventarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Optional<Product> getProductById(UUID uuid) {
        return products.stream()
                .filter(product -> product.getUuid()
                        .equals(uuid))
                .findFirst();
    }

    public List<Product> getAllProduct() {
        return products;
    }

    public List<Product> getProductByName(String name) {
        List<Product> productByName = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                productByName.add(product);
            }
        }
        return productByName;
    }

    public void updateProduct(UUID uuid, int quantityNew) {
        for (Product product : products) {
            if (product.getUuid().equals(uuid)) {
                product.setQuantity(quantityNew);
                break;
            }
        }
    }

    public void deleteProduct(UUID uuid) {
        products.removeIf(product -> product.getUuid().equals(uuid));
    }

    public double calculateTotalValueInventory() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
}
