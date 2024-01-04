package BusinessLayer;

public class Luggage {

    private String cnicNumber;
    private String luggageNumber;
    private double luggageWeight;

    public Luggage(String cnicNumber, String luggageNumber, double luggageWeight) {
        this.cnicNumber = cnicNumber;
        this.luggageNumber = luggageNumber;
        this.luggageWeight = luggageWeight;
    }

    // Getter and Setter for CNIC Number
    public String getCnicNumber() {
        return cnicNumber;
    }

    public void setCnicNumber(String cnicNumber) {
        this.cnicNumber = cnicNumber;
    }

    // Getter and Setter for Luggage Number
    public String getLuggageNumber() {
        return luggageNumber;
    }

    public void setLuggageNumber(String luggageNumber) {
        this.luggageNumber = luggageNumber;
    }

    // Getter and Setter for Luggage Weight
    public double getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(double luggageWeight) {
        this.luggageWeight = luggageWeight;
    }
}
