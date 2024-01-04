import java.time.LocalDate;

public class Payment {
    private String username;
    private String cardNumber;
    private String cvvNumber;
    private LocalDate cardExpiryDate;

    // Constructor
    public Payment(String username, String cardNumber, String cvvNumber, LocalDate cardExpiryDate) {
        this.username = username;
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.cardExpiryDate = cardExpiryDate;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(String cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    public LocalDate getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(LocalDate cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    // Method to check if payment information is present
    public boolean isPaymentInfoPresent() {
        return username != null && cardNumber != null && cvvNumber != null && cardExpiryDate != null;
    }
}
