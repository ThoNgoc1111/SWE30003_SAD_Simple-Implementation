package SWE30003_SAD;

public class CartItem {
    private Product product;
    private int quantity;

    // Constructor
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and setters for product and quantity
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return product.getPrice();
    }

    // Method to calculate total price of the item
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
