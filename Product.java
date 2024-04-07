package SWE30003_SAD;

public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private int inventoryCount;

    // Constructor, Getters and Setters
    public Product(String productId, String name, String description, double price, int inventoryCount) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.inventoryCount = inventoryCount;
    }

    public double getPrice() {
        return price;
    }

    // Method to update inventory count after sale
    public void updateInventory(int quantitySold) {
        inventoryCount -= quantitySold;
    }
}
