package SWE30003_SAD;

public class Payment {
    private String paymentId;
    private double amount;
    private String paymentStatus;
    // Other payment details

    // Constructor, Getters and Setters

    // Method to retrieve payment method
    public String getMethod() {
        return paymentStatus; // For example, returning payment status as payment method
    }
}
