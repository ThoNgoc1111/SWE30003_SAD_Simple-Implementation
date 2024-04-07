package SWE30003_SAD;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    // Constructor, Getters and Setters

    // Method to add item to the cart
    public void addItem(CartItem item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }
}
