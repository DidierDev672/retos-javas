package inventarios;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        Product product = new Product(UUID.randomUUID(), "Manzana", 0.50, 10);
        Product product2 = new Product(UUID.randomUUID(), "Leche", 2.00, 1);
        Product product3 = new Product(UUID.randomUUID(), "Pan", 1.50, 2);
        Product product4 = new Product(UUID.randomUUID(), "Arroz", 3.00, 3);
        Product product5 = new Product(UUID.randomUUID(), "Pasta", 2.50, 5);

        productRepository.addProduct(product);
        productRepository.addProduct(product2);
        productRepository.addProduct(product3);
        productRepository.addProduct(product4);
        productRepository.addProduct(product5);

        for (Product listInventory : productRepository.getAllProduct()) {
            System.out.println("Name: " + listInventory.getName());
            System.out.println("Price: " + listInventory.getPrice());
            System.out.println("Quantity: " + listInventory.getQuantity());
            System.out.println("Total: " + ( listInventory.getPrice() * listInventory.getQuantity()));
        }

        System.out.println("Total del inventario: " + productRepository.calculateTotalValueInventory());
    }
}
