package SWE30003_SAD;
import java.util.*;

// Model Layer

// Represents an order transaction made by customers
class OrderHistory {
    private String orderId;
    private Date orderDate;
    private Customer customer;
    private List<CartItem> items;
    private double totalAmount;

    // Constructor, Getters and Setters

    // Method to add items to the order
    public void addItem(CartItem item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }

    // Method to calculate total amount
    public void calculateTotalAmount() {
        totalAmount = 0;
        if (items != null) {
            for (CartItem item : items) {
                totalAmount += item.getProduct().getPrice() * item.getQuantity();
            }
        }
    }
}

