package SWE30003_SAD;

import java.util.Map;

public class InventoryManager {
    private Map<Product, Integer> inventory;

    // Constructor, Getters and Setters
    public void addProduct(Product product, int quantity) {
        inventory.put(product, quantity);
    }

    // Method to remove product from inventory after sale
    public void updateInventory(Product product, int quantitySold, String productName) {
        int currentQuantity = inventory.getOrDefault(product, 0);
        if (currentQuantity >= quantitySold) {
            inventory.put(product, currentQuantity - quantitySold);
        } else {
            System.out.println("Insufficient inventory for product: " + productName);
        }
    }
}
