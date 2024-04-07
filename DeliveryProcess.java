package SWE30003_SAD;

public class DeliveryProcess {
    private String deliveryId;
    private int estimatedTime;

    // Constructor, Getters and Setters
    public DeliveryProcess(String deliveryId, int estimatedTime) {
        this.deliveryId = deliveryId;
        this.estimatedTime = estimatedTime;
    }

    // Method to get delivery ID
    public String getDeliveryID() {
        return deliveryId;
    }
}
