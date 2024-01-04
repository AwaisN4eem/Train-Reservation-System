package BusinessLayer;

public class MyCustomer {
	private String fullNameCustomer;
	private String cnicCustomer;
	private String addressCustomer;
	private String phoneNumCustomer;
	
	
	public MyCustomer(String customerName, String customerCnic, String address, String phoneNo) {
		
		// TODO Auto-generated constructor stub
		this.fullNameCustomer = customerName;
		this.cnicCustomer = customerCnic;
		this.addressCustomer = address;
		this.phoneNumCustomer = phoneNo;
		RegistrationCatalogue RC = RegistrationCatalogue.getinstance();
		
		RC.addCustomer(this);
	}
	
	public String getFullNameCustomer() {
		return fullNameCustomer;
	}
	public void setFullNameCustomer(String fullNameCustomer) {
		this.fullNameCustomer = fullNameCustomer;
	}
	public String getCnicCustomer() {
		return cnicCustomer;
	}
	public void setCnicCustomer(String cnicCustomer) {
		this.cnicCustomer = cnicCustomer;
	}
	public String getAddressCustomer() {
		return addressCustomer;
	}
	public void setAddressCustomer(String addressCustomer) {
		this.addressCustomer = addressCustomer;
	}
	public String getPhoneNumCustomer() {
		return phoneNumCustomer;
	}
	public void setPhoneNumCustomer(String phoneNumCustomer) {
		this.phoneNumCustomer = phoneNumCustomer;
	}
}
