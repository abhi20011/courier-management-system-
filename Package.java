public class Package {
    private String trackingNumber;
    private String senderId;
    private String receiverId;
    private String status;

    public Package(String trackingNumber, String senderId, String receiverId, String status) {
        this.trackingNumber = trackingNumber;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.status = status;
    }

    // Getters and Setters
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
