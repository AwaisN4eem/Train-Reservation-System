package BusinessLayer;

public class admin{
	private String adminUsername;
	private String adminPassword;
	
	public admin(String username, String passcode) {
		// TODO Auto-generated constructor stub
		this.adminUsername = username;
		this.adminPassword = passcode;
	}

	public String getAdminUsername() {
		return adminUsername;
	}
	
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
}
