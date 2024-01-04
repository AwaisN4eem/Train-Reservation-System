package BusinessLayer;

import java.util.ArrayList;

public class BookingCatalogue {
	
	static ArrayList<Booking> str = new ArrayList<Booking>();
	private static BookingCatalogue instance = null;
	
	public void addBooking(Booking b)
	{
		str.add(b);
	}
	
	public void removeBooking(Booking b)
	{
		str.remove(b);
	}
	
	public static BookingCatalogue  getinstance() {
		// TODO Auto-generated method stub
		if(instance == null)
		{
			instance = new BookingCatalogue();	
		}
		return instance;
	}
	
	
}