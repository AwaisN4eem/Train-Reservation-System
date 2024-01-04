package BusinessLayer;

import java.util.ArrayList;

public class RegistrationCatalogue {
	
	static ArrayList<Registration> obj = new ArrayList<Registration>();
	private static RegistrationCatalogue instance = null;
	
	public void addCustomer(Registration reg)
	{
		obj.add(reg);
	}
	
	public void removeBooking(Registration reg)
	{
		obj.remove(reg);
	}

	public static RegistrationCatalogue getinstance() {
		// TODO Auto-generated method stub
		if(instance == null)
		{
			instance = new RegistrationCatalogue();	
		}
		return instance;
	}
	
	
	
}
