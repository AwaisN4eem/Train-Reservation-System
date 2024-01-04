package BusinessLayer;

import java.sql.SQLException;

import DatabaseHandler.DBHandler;

public class Booking{
	
	private String cnicBooking;
	private String trainNameBooking;
	private String arrivalBooking;
	private String destBooking;
	private int numOfSeatsBooking;
	
	
	public Booking(String cnic, String nameofTrain, String arrival, String destination, int no_of_Seats) {
		this.cnicBooking = cnic;
		this.trainNameBooking = nameofTrain;
		this.arrivalBooking = arrival;
		this.destBooking = destination;
		this.numOfSeatsBooking = no_of_Seats;
		
		BookingCatalogue bc = BookingCatalogue.getinstance();
		bc.addBooking(this);
		// TODO Auto-generated constructor stub
	}
	
	public String getCnicBooking() {
		return cnicBooking;
	}
	public void setCnicBooking(String cnicBooking) {
		this.cnicBooking = cnicBooking;
	}
	public String getTrainNameBooking() {
		return trainNameBooking;
	}
	public void setTrainNameBooking(String trainNameBooking) {
		this.trainNameBooking = trainNameBooking;
	}
	public String getArrivalBooking() {
		return arrivalBooking;
	}
	public void setArrivalBooking(String arrivalBooking) {
		this.arrivalBooking = arrivalBooking;
	}
	public String getDestBooking() {
		return destBooking;
	}
	public void setDestBooking(String destBooking) {
		this.destBooking = destBooking;
	}
	public int getNumOfSeatsBooking() {
		return numOfSeatsBooking;
	}
	public void setNumOfSeatsBooking(int numOfSeatsBooking) {
		this.numOfSeatsBooking = numOfSeatsBooking;
	}
	
	public boolean saveToDB() {
    	try {
    		DBHandler dbHandler = DBHandler.getInstance();
			return dbHandler.BookingConfirmed(this.cnicBooking, this.trainNameBooking, this.arrivalBooking, this.destBooking, this.numOfSeatsBooking);
			
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
	}
	
	public void completePayment(Booking b)
	{
		System.out.println("Enter Payment");
		
		b.numOfSeatsBooking = b.numOfSeatsBooking*1000;
		int cost = b.numOfSeatsBooking;
		System.out.println(cost);
		
		BookingCatalogue bc = new BookingCatalogue();
	}
}