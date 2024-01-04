public class Complaint {

    private String cnic;
    private String complaintDetails;

    public Complaint() {
        // Default constructor
    }

    public Complaint(String cnic, String complaintDetails) {
        this.cnic = cnic;
        this.complaintDetails = complaintDetails;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }
}
