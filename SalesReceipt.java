package SWE30003_SAD;

public class SalesReceipt {
    private String receiptId;
    private String orderId;
    private Payment paymentMethod;
    private DeliveryProcess deliveryProcess;
    private Staff staff;

    // Constructor
    public SalesReceipt(String receiptId, String orderId, Payment paymentMethod,
                        DeliveryProcess deliveryProcess, Staff staff) {
        this.receiptId = receiptId;
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.deliveryProcess = deliveryProcess;
        this.staff = staff;
    }

    // Getters and Setters
    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public DeliveryProcess getDeliveryProcess() {
        return deliveryProcess;
    }

    public void setDeliveryProcess(DeliveryProcess deliveryProcess) {
        this.deliveryProcess = deliveryProcess;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    // Method to print sales receipt details
    public void printReceipt() {
        System.out.println("Receipt ID: " + receiptId);
        System.out.println("Order ID: " + orderId);
        System.out.println("Payment Method: " + paymentMethod.getMethod());
        System.out.println("Delivery Process ID: " + deliveryProcess.getDeliveryID());
        System.out.println("Staff Name: " + staff.getName());
    }
}

